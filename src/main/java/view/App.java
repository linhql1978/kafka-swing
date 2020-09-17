package view;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import comsumer.ReadThread;
import files.FileService;
import lombok.Getter;
import lombok.Setter;
import model.StockInfoModel;
import model.SubTopNPriceModel;
import model.TopNPriceModel;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import quickfix.messages.StockInfo;

import javax.swing.Timer;
import javax.swing.*;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.lang.reflect.Field;
import java.util.List;
import java.util.*;

@Getter
@Setter
public class App extends javax.swing.JFrame {
    private static List<StockInfoModel> data;
    private static List<TopNPriceModel> topNPriceModels;
    ArrayList arrCols;
    DefaultTableModel model;
    DefaultTableModel defaultTableModelTopNPrice;
    private Map colors;
    ColorRenderer colorRenderer;
    Gson gson;
    private static int size = -1, temp = -1, indexChange = -1;
    private static int size1 = -1, temp1 = -1, indexChane1 = -1;

    private static Map<String, List<String>> topNPriceMap;
    private static Map<String, Integer> topNPriceMapIndex;
    private Integer lastIndex;

    Logger logger = LoggerFactory.getLogger(App.class);

    private Map<Integer, String> difference(StockInfoModel s1, StockInfoModel s2) {
        int index = 0;
        Map<Integer, String> fields = new HashMap<>();
        for (Field field : StockInfoModel.class.getDeclaredFields()) {
            field.setAccessible(true);
            try {
                String valueS1 = field.get(s1).toString();
                String valueS2 = field.get(s2).toString();
                if (!valueS1.equals(valueS2)) {
                    fields.put(index, valueS2);
                }
            } catch (IllegalAccessException e) {
                logger.error(e.getMessage());
            } catch (Exception e) {
                logger.error(e.getMessage());
            }
            index++;
        }
        return fields;
    }

    private Map<Integer, String> difference(SubTopNPriceModel s1, SubTopNPriceModel s2, int index) {
        Map<Integer, String> fields = new HashMap<>();
        for (Field field : SubTopNPriceModel.class.getDeclaredFields()) {
            field.setAccessible(true);
            try {
                String valueS1 = field.get(s1).toString();
                String valueS2 = field.get(s2).toString();
                if (!valueS1.equals(valueS2)) {
                    fields.put(index, valueS2);
                }
            } catch (IllegalAccessException e) {
                logger.error(e.getMessage());
            } catch (Exception e) {
                logger.error(e.getMessage());
            }
            index++;
        }
        return fields;
    }

    public void stockInfo(ConsumerRecord<String, String> item) {
        Map<Integer, String> fields = new HashMap<>();
        StockInfoModel object = gson.fromJson(item.value().substring(1, item.value().length() - 1), StockInfoModel.class);
        boolean check = false;
        for (int i = 0; i < data.size(); i++) {
            if (data.get(i).getSymbol().equals(object.getSymbol())) {
                fields = difference(data.get(i), object);
                if (!fields.isEmpty()) {
                    indexChange = i;
                }
                check = true;
                break;
            }
        }
        if (!check) {
            data.add(object);
            size++;
        } else {
            int finalIndexChange = indexChange;
            fields.entrySet().stream().forEach(map -> {
                model.setValueAt(map.getValue(), finalIndexChange, map.getKey());
                colorRenderer.setCellColor(finalIndexChange, map.getKey(), Color.ORANGE);
                try {
                    Thread.sleep(10);
                    colorRenderer.setCellColor(finalIndexChange, map.getKey(), Color.WHITE);
                } catch (InterruptedException e) {
                    logger.error(e.getMessage());
                } catch (Exception e) {
                    logger.error(e.getMessage());
                }

            });
        }

        if (size > temp) {
            StockInfoModel stockInfoModel = data.get(size);
            temp++;
            Object[] objects = {
                    stockInfoModel.getIDSymbol(),
                    stockInfoModel.getSymbol(),
                    stockInfoModel.getBoardCode(),

                    stockInfoModel.getTradingSessionID(),
                    stockInfoModel.getTradSecStatus(),
                    stockInfoModel.getSecurityTradingStatus(),
                    stockInfoModel.getListingStatus()
            };
            model.insertRow(model.getRowCount(), objects);
            colorRenderer.setRowColor(model.getRowCount() - 1, Color.YELLOW);
            colorRenderer.setRowColor(model.getRowCount() - 1, Color.WHITE);
        }
    }

    private void topNPrice(ConsumerRecord<String, String> item) {
        TopNPriceModel object = null;
        List<Object> objectList = gson.fromJson(item.value(), (java.lang.reflect.Type) Object.class);
        object = gson.fromJson(gson.toJsonTree(objectList.get(0)), TopNPriceModel.class);
        if (objectList.size() > 1) {
            for (int i = 1; i < objectList.size(); i++) {
                SubTopNPriceModel subTopNPriceModel = null;
                subTopNPriceModel = gson.fromJson(gson.toJsonTree(objectList.get(i)), SubTopNPriceModel.class);
                if (subTopNPriceModel != null) object.getGroup().add(subTopNPriceModel);
            }
        }
        System.out.println(object.toString());

        List<String> topNprice = new ArrayList<>();
        topNprice.add(object.getSymbol());
        topNprice.add(object.getBoardCode());
        topNprice.add(object.getNoTopPrice());

        for (int i = 0; i < 3; i++) {
            if (i < object.getGroup().size()) {
                topNprice.add(object.getGroup().get(i).getNumTopPrice() != null ? object.getGroup().get(i).getNumTopPrice() : "");
                topNprice.add(object.getGroup().get(i).getBestBidQtty() != null ? object.getGroup().get(i).getBestBidPrice() : "");
                topNprice.add(object.getGroup().get(i).getBestOfferPrice() != null ? object.getGroup().get(i).getBestBidQtty() : "");
                topNprice.add(object.getGroup().get(i).getBestBidPrice() != null ? object.getGroup().get(i).getBestOfferPrice() : "");
                topNprice.add(object.getGroup().get(i).getBestOfferQtty() != null ? object.getGroup().get(i).getBestOfferQtty() : "");
            } else {
                topNprice.add("");
                topNprice.add("");
                topNprice.add("");
                topNprice.add("");
                topNprice.add("");
            }
        }

        String key = topNprice.get(0);
        if (topNPriceMap.containsKey(key)) {
            List<String> oldData = topNPriceMap.get(key);
            for (int i = 0; i < oldData.size(); i++) {
                if (!oldData.get(i).equals(topNprice.get(i))) {
                    try {
                        defaultTableModelTopNPrice.setValueAt(topNprice.get(i), topNPriceMapIndex.get(key), i);
                        colorRenderer.setCellColor(topNPriceMapIndex.get(key), i, Color.ORANGE);
                        Thread.sleep(5);
                        colorRenderer.setCellColor(topNPriceMapIndex.get(key), i, Color.WHITE);
                    } catch (InterruptedException e) {
                        logger.error(e.getMessage());
                    } catch (Exception e) {
                        logger.error(e.getMessage());
                    }
                }
            }
            topNPriceMap.put(key, topNprice);
        } else {
            topNPriceMap.put(key, topNprice);
            defaultTableModelTopNPrice.insertRow(defaultTableModelTopNPrice.getRowCount(), topNPriceMap.get(key).toArray());
            topNPriceMapIndex.put(key, defaultTableModelTopNPrice.getRowCount() - 1);
        }
    }

    public void reRender(ConsumerRecords<String, String> records, String topic) {
        try {
            for (ConsumerRecord<String, String> item : records) {
                if (topic.equals("stock-info")) {
                    stockInfo(item);
                } else {
                    topNPrice(item);
                }
            }
        } catch (JsonSyntaxException | ArrayIndexOutOfBoundsException e) {
            logger.error(e.getMessage());
        } catch (Exception e) {
            logger.error(e.getMessage());
        }
    }

    public App() {
        logger.info("init " + this);
        initComponents();
        data = new ArrayList<>();
        topNPriceModels = new ArrayList<>();
        model = new DefaultTableModel();
        defaultTableModelTopNPrice = new DefaultTableModel();
        colors = new HashMap();
        jProgressBar1.setStringPainted(true);
        fileService = new FileService(jProgressBar1, this);
        gson = new Gson();
        topNPriceMap = new HashMap<>();
        topNPriceMapIndex = new HashMap<>();
        lastIndex = 0;
        initBtnClick();

        model.addColumn("ID chứng khoán"); //IDSymbol
        model.addColumn("Mã chứng khoán"); //Symbol
        model.addColumn("Mã bảng");         //BoardCode
        model.addColumn("Mã trạng thái GD");//TradingSessionID
        model.addColumn("Trạng thái GD");//TradSesStatus
        model.addColumn("Trạng thái chứng khoán");//SecurityTradingStatus
        model.addColumn("Tình trạng chứng khoán");//ListingStatus
        tblReceiveMessage = new JTable(model) {
            @Override
            public Component prepareRenderer(TableCellRenderer renderer, int row, int column) {
                Component component = super.prepareRenderer(renderer, row, column);
                colorRenderer.setBackground(component, row, column);
                return component;
            }
        };
        jScrollPane2.setViewportView(tblReceiveMessage);
        colorRenderer = new ColorRenderer(tblReceiveMessage);

        defaultTableModelTopNPrice.addColumn("Symbol");
        defaultTableModelTopNPrice.addColumn("BoardCode");
        defaultTableModelTopNPrice.addColumn("NoTopPrice");

        defaultTableModelTopNPrice.addColumn("NumTopPrice");
        defaultTableModelTopNPrice.addColumn("BestBidPrice");
        defaultTableModelTopNPrice.addColumn("BestBidQtty");
        defaultTableModelTopNPrice.addColumn("BestOfferPrice");
        defaultTableModelTopNPrice.addColumn("BestOfferQtty");

        defaultTableModelTopNPrice.addColumn("NumTopPrice");
        defaultTableModelTopNPrice.addColumn("BestBidPrice");
        defaultTableModelTopNPrice.addColumn("BestBidQtty");
        defaultTableModelTopNPrice.addColumn("BestOfferPrice");
        defaultTableModelTopNPrice.addColumn("BestOfferQtty");

        defaultTableModelTopNPrice.addColumn("NumTopPrice");
        defaultTableModelTopNPrice.addColumn("BestBidPrice");
        defaultTableModelTopNPrice.addColumn("BestBidQtty");
        defaultTableModelTopNPrice.addColumn("BestOfferPrice");
        defaultTableModelTopNPrice.addColumn("BestOfferQtty");
        jTableTopNPrice = new JTable(defaultTableModelTopNPrice) {
            @Override
            public Component prepareRenderer(TableCellRenderer renderer, int row, int column) {
                Component component = super.prepareRenderer(renderer, row, column);
                colorRenderer.setBackground(component, row, column);
                return component;
            }
        };

        jScrollPaneTopNPrice.setViewportView(jTableTopNPrice);
        colorRenderer = new ColorRenderer(jTableTopNPrice);
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jTabbedPane1 = new JTabbedPane();
        jPanel1 = new JPanel();
        jScrollPane1 = new JScrollPane();
        listMessage = new JList<>();
        btnChooseFile = new JButton();
        btnReadFile = new JButton();
        btnPauseRead = new JButton();
        btnContinueRead = new JButton();
        btnCancelRead = new JButton();
        jProgressBar1 = new JProgressBar();
        jLabel1 = new JLabel();
        jLabel2 = new JLabel();
        lbPathFile = new JLabel();
        jScrollPane2 = new JScrollPane();
        tblReceiveMessage = new JTable();
        jScrollPaneTopNPrice = new JScrollPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(1200, 600));
        defaultListModel = new DefaultListModel();
        listMessage.setModel(defaultListModel);

        jScrollPane1.setViewportView(listMessage);

        btnChooseFile.setText("Choose File");
        btnChooseFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChooseFileActionPerformed(evt);
            }
        });

        btnReadFile.setText("Read");
        btnReadFile.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                btnReadFileActionPerformed(actionEvent);
            }
        });

        btnPauseRead.setText("Pause");
        btnPauseRead.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                btnPauseReadPerformed(actionEvent);
            }
        });

        btnContinueRead.setText("Continue");
        btnContinueRead.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                btnContinueReadPerformed(actionEvent);
            }
        });

        btnCancelRead.setText("Cancel");
        btnCancelRead.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelReadActionPerformed(evt);
            }
        });

        jLabel1.setText("File:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jScrollPane1)
                                                .addComponent(jProgressBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 567, Short.MAX_VALUE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lbPathFile)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel2)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btnPauseRead, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                                        .addComponent(btnReadFile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnChooseFile, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnContinueRead, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                                        .addComponent(btnCancelRead, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE))
                                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnChooseFile, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel2)
                                        .addComponent(lbPathFile))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(btnReadFile, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(14, 14, 14)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(btnPauseRead, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(btnContinueRead, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnCancelRead, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())
        );

        jTabbedPane1.addTab("Producer", jPanel1);

        tblReceiveMessage.setModel(new DefaultTableModel(
                new Object[][]{
                        {},
                        {},
                        {},
                        {}
                },
                new String[]{

                }
        ));
        jScrollPane2.setViewportView(tblReceiveMessage);

        jTabbedPane1.addTab("stock-info", jScrollPane2);
        jTabbedPane1.addTab("top-n-price", jScrollPaneTopNPrice);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTabbedPane1)
        );

        pack();
    }

    private void btnChooseFileActionPerformed(java.awt.event.ActionEvent evt) {
        JFileChooser jFileChooser = new JFileChooser();
        jFileChooser.setDialogTitle("save File");
        int result = jFileChooser.showSaveDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {
            File file = jFileChooser.getSelectedFile();
            lbPathFile.setText(file.getPath());

            btnChooseFile.setEnabled(true);
            btnReadFile.setEnabled(true);
            btnPauseRead.setEnabled(false);
            btnContinueRead.setEnabled(false);
            btnCancelRead.setEnabled(false);

            pathFile = file.getPath().toString();
            fileService.setPathFile(pathFile);
        }
    }

    private void btnReadFileActionPerformed(java.awt.event.ActionEvent evt) {
        fileService.send();
        btnChooseFile.setEnabled(false);
        btnReadFile.setEnabled(false);
        btnPauseRead.setEnabled(true);
        btnContinueRead.setEnabled(false);
        btnCancelRead.setEnabled(true);
    }

    private void btnPauseReadPerformed(java.awt.event.ActionEvent evt) {
        fileService.pause();
        btnChooseFile.setEnabled(false);
        btnReadFile.setEnabled(false);
        btnPauseRead.setEnabled(false);
        btnContinueRead.setEnabled(true);
        btnCancelRead.setEnabled(true);
    }

    private void btnContinueReadPerformed(java.awt.event.ActionEvent evt) {
        fileService.resume();
        btnChooseFile.setEnabled(false);
        btnReadFile.setEnabled(false);
        btnPauseRead.setEnabled(true);
        btnContinueRead.setEnabled(false);
        btnCancelRead.setEnabled(true);
    }

    private void btnCancelReadActionPerformed(java.awt.event.ActionEvent evt) {
        fileService.cancel();
        btnChooseFile.setEnabled(true);
        btnReadFile.setEnabled(false);
        btnPauseRead.setEnabled(false);
        btnContinueRead.setEnabled(false);
        btnCancelRead.setEnabled(false);
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                App app = new App();
                app.setVisible(true);
                app.setLocationRelativeTo(null);

                String topic = "stock-info";
                ReadThread readThreadSI = new ReadThread(app, topic);

                topic = "top-n-price";
                ReadThread readThreadTNP = new ReadThread(app, topic);

                readThreadSI.start();
                readThreadTNP.start();


            }
        });
    }

    public void initBtnClick() {
        btnChooseFile.setEnabled(true);
        btnReadFile.setEnabled(false);
        btnPauseRead.setEnabled(false);
        btnContinueRead.setEnabled(false);
        btnCancelRead.setEnabled(false);
    }

    private FileService fileService;
    private String pathFile;
    private volatile DefaultListModel defaultListModel;

    private JButton btnCancelRead;
    private JButton btnChooseFile;
    private JButton btnContinueRead;
    private JButton btnPauseRead;
    private JButton btnReadFile;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JPanel jPanel1;
    private JProgressBar jProgressBar1;
    private JScrollPane jScrollPane1;
    private JScrollPane jScrollPane2;
    private JTabbedPane jTabbedPane1;
    private JLabel lbPathFile;
    private JList<String> listMessage;
    private JTable tblReceiveMessage;
    private JTable jTableTopNPrice;
    private JScrollPane jScrollPaneTopNPrice;

    static class ColorRenderer implements ActionListener {
        private JTable table;
        private AbstractTableModel model;
        private Map colors;
        private boolean isBlinking = true;
        private Timer timer;
        private Point location;

        public ColorRenderer(JTable table) {
            this.table = table;
            model = (AbstractTableModel) table.getModel();
            colors = new HashMap();
            location = new Point();
        }

        public void setBackground(Component c, int row, int column) {
            //  Don't override the background color of a selected cell
            if (table.isCellSelected(row, column)) return;

            //  The default render does not reset the background color
            //  that was set for the previous cell, so reset it here
            if (c instanceof DefaultTableCellRenderer) {
                c.setBackground(table.getBackground());
            }

            //  Don't highlight this time
            if (!isBlinking) return;

            //  In case columns have been reordered, convert the column number
            column = table.convertColumnIndexToModel(column);

            //  Get cell color
            Object key = getKey(row, column);
            Object o = colors.get(key);

            if (o != null) {
                c.setBackground((Color) o);
                return;
            }

            //  Get row color
            key = getKey(row, -1);
            o = colors.get(key);

            if (o != null) {
                c.setBackground((Color) o);
                return;
            }

            //  Get column color
            key = getKey(-1, column);
            o = colors.get(key);

            if (o != null) {
                c.setBackground((Color) o);
                return;
            }

        }

        public void setCellColor(int row, int column, Color color) {
            Point key = new Point(row, column);
            colors.put(key, color);
        }

        public void setColumnColor(int column, Color color) {
            setCellColor(-1, column, color);
        }

        public void setRowColor(int row, Color color) {
            setCellColor(row, -1, color);
        }

        private Object getKey(int row, int column) {
            location.x = row;
            location.y = column;
            return location;
        }

        public void startBlinking(int interval) {
            timer = new Timer(interval, this);
            timer.start();
        }

        public void stopBlinking() {
            timer.stop();
        }

        public void actionPerformed(ActionEvent e) {
            isBlinking = !isBlinking;

            Iterator it = colors.keySet().iterator();

            while (it.hasNext()) {
                Point key = (Point) it.next();
                int row = key.x;
                int column = key.y;

                if (column == -1) {
                    model.fireTableRowsUpdated(row, row);
                } else if (row == -1) {
                    int rows = table.getRowCount();

                    for (int i = 0; i < rows; i++) {
                        model.fireTableCellUpdated(i, column);
                    }
                } else {
                    model.fireTableCellUpdated(row, column);
                }
            }
        }
    }

    public synchronized void updateListMessage(List<String> stringList) {
        for (String str : stringList) {
            ((DefaultListModel) listMessage.getModel()).addElement(str);
        }
    }
}
