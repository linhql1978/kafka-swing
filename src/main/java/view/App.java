package view;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import comsumer.ReadThread;
import files.FileService;
import lombok.Getter;
import lombok.Setter;
import model.StockInfoModel;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Getter
@Setter
public class App extends javax.swing.JFrame {
    private static List<StockInfoModel> data;
    ArrayList arrCols;
    DefaultTableModel model;
    Logger logger = LoggerFactory.getLogger(App.class);

    private Map<Integer, String> difference(StockInfoModel s1, StockInfoModel s2) {
        Map<Integer, String> fields = new HashMap<>();
        int index = 0;
        for(Field field: StockInfoModel.class.getDeclaredFields()) {
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
            index ++;
        }
        return fields;
    }

    public void reRender(ConsumerRecords<String, String> records) {
        try {
            Gson gson = new Gson();
            Map<Integer, String> fields = new HashMap<>();
            int size = -1, temp = -1, indexChange = -1;
            for (ConsumerRecord<String, String> item : records) {
                StockInfoModel object = gson.fromJson(item.value().substring(1, item.value().length() - 1), StockInfoModel.class);
                boolean check = false;
                for (int i = 0; i < data.size(); i++) {
                    if (data.get(i).getSymbol().equals(object.getSymbol())) {
                        fields = difference(data.get(i), object);
                        if (!fields.isEmpty()) {
                            data.set(i, object);
                            indexChange = i;
                        }
                        check = true;
                        break;
                    }
                }
                if (!check) {
                    data.add(object);
                    size ++;
                } else {
                    int finalIndexChange = indexChange;
                    fields.entrySet().stream().forEach(map ->{
                        model.setValueAt(map.getValue(), finalIndexChange, map.getKey());

                        TableCellRenderer cellRenderer = tblReceiveMessage.getCellRenderer(finalIndexChange, map.getKey());
                        Component component = cellRenderer.getTableCellRendererComponent(tblReceiveMessage, map.getValue(), false, false, finalIndexChange, map.getKey());
                        if (!component.getBackground().equals(Color.GREEN)) {
                            component.setBackground(Color.GREEN);
                        } else {
                            component.setBackground(Color.RED);
                        }
                    });
                }

                if (size > temp) {
                    StockInfoModel stockInfoModel = data.get(size);
                    temp ++;
                    Object[] objects = {
                            stockInfoModel.getIDSymbol(),
                            stockInfoModel.getSymbol(),
                            stockInfoModel.getBoardCode(),
                            stockInfoModel.getTradingSessionID(),
                            stockInfoModel.getTradSecStatus(),
                            stockInfoModel.getSecurityTradingStatus(),
                            stockInfoModel.getListingStatus()
                    };
                    model.addRow(objects);
                }
                tblReceiveMessage.setModel(model);
            }
        } catch (JsonSyntaxException | ArrayIndexOutOfBoundsException e) {
            logger.error(e.getMessage());
        } catch (Exception e) {
            logger.error(e.getMessage());
        }
    }

    public App() {
        logger.info("init "+this);
        initComponents();
        data = new ArrayList<>();
        model = new DefaultTableModel();
        arrCols = new ArrayList();
        jProgressBar1.setStringPainted(true);
        fileService = new FileService(jProgressBar1,this);
        initBtnClick();

        arrCols.add("ID chứng khoán"); //IDSymbol
        arrCols.add("Mã chứng khoán"); //Symbol
        arrCols.add("Mã bảng");         //BoardCode
        arrCols.add("Mã trạng thái GD");//TradingSessionID
        arrCols.add("Trạng thái GD");//TradSesStatus
        arrCols.add("Trạng thái chứng khoán");//SecurityTradingStatus
        arrCols.add("Tình trạng chứng khoán");//ListingStatus
        model.setColumnIdentifiers(arrCols.toArray());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listMessage = new javax.swing.JList<>();
        btnChooseFile = new javax.swing.JButton();
        btnReadFile = new javax.swing.JButton();
        btnPauseRead = new javax.swing.JButton();
        btnContinueRead = new javax.swing.JButton();
        btnCancelRead = new javax.swing.JButton();
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lbPathFile = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblReceiveMessage = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

        jTabbedPane1.addTab("Consumer", jScrollPane2);

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
    }// </editor-fold>//GEN-END:initComponents

    private void btnChooseFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChooseFileActionPerformed
        JFileChooser jFileChooser = new JFileChooser();
        jFileChooser.setDialogTitle("save File");
        int result = jFileChooser.showSaveDialog(null);
        if (result == JFileChooser.APPROVE_OPTION){
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
    }//GEN-LAST:event_btnChooseFileActionPerformed

    private void btnReadFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelReadActionPerformed
        // TODO add your handling code here:
        fileService.send();
        btnChooseFile.setEnabled(false);
        btnReadFile.setEnabled(false);
        btnPauseRead.setEnabled(true);
        btnContinueRead.setEnabled(false);
        btnCancelRead.setEnabled(true);
    }//GEN-LAST:event_btnCancelReadActionPerformed

    private void btnPauseReadPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelReadActionPerformed
        // TODO add your handling code here:
        fileService.pause();
        btnChooseFile.setEnabled(false);
        btnReadFile.setEnabled(false);
        btnPauseRead.setEnabled(false);
        btnContinueRead.setEnabled(true);
        btnCancelRead.setEnabled(true);
    }//GEN-LAST:event_btnCancelReadActionPerformed

    private void btnContinueReadPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelReadActionPerformed
        // TODO add your handling code here:
        fileService.resume();
        btnChooseFile.setEnabled(false);
        btnReadFile.setEnabled(false);
        btnPauseRead.setEnabled(true);
        btnContinueRead.setEnabled(false);
        btnCancelRead.setEnabled(true);
    }//GEN-LAST:event_btnCancelReadActionPerformed

    private void btnCancelReadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelReadActionPerformed
        // TODO add your handling code here:
        fileService.cancel();
        btnChooseFile.setEnabled(true);
        btnReadFile.setEnabled(false);
        btnPauseRead.setEnabled(false);
        btnContinueRead.setEnabled(false);
        btnCancelRead.setEnabled(false);
    }//GEN-LAST:event_btnCancelReadActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                App app = new App();
                app.setVisible(true);
                app.setLocationRelativeTo(null);

                ReadThread readThread = new ReadThread(app);
                readThread.start();
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelRead;
    private javax.swing.JButton btnChooseFile;
    private javax.swing.JButton btnContinueRead;
    private javax.swing.JButton btnPauseRead;
    private javax.swing.JButton btnReadFile;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lbPathFile;
    private javax.swing.JList<String> listMessage;
    private javax.swing.JTable tblReceiveMessage;
    // End of variables declaration//GEN-END:variables
}
