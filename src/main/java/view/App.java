package view;

import com.google.gson.Gson;
import comsumer.ReadThread;
import model.StockInfoModel;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class App extends javax.swing.JFrame {
    private static List<StockInfoModel> data;
    ArrayList arrCols = new ArrayList();
    DefaultTableModel model = new DefaultTableModel();

    public void reRender(ConsumerRecords<String, String> records) {
        Gson gson = new Gson();
        for (ConsumerRecord<String, String> item : records) {
            try {
                StockInfoModel object = gson.fromJson(item.value().substring(1, item.value().length() - 1), StockInfoModel.class);
                boolean check = false;
                for (int i = 0; i < data.size(); i++) {
                    if (data.get(i).getSymbol().equals(object.getSymbol())) {
                        data.set(i, object);
                        check = true;
                        break;
                    }
                }
                if (!check) {
                    data.add(object);
                }
                model.setRowCount(0);
                for (StockInfoModel stockInfoModel : data) {
                    Object[] objects = {
                            stockInfoModel.getSymbolID(),
                            stockInfoModel.getSymbol(),
                            stockInfoModel.getBoardCode(),
                            stockInfoModel.getTradingSessionID(),
                            stockInfoModel.getSecurityTradingStatus(),
                            stockInfoModel.getListingStatus()
                    };
                    model.addRow(objects);
                }
                tblReceiveMessage.setModel(model);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public App() {
        initComponents();
        data = new ArrayList<>();

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

        listMessage.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = {"Item 1", "Item 2", "Item 3", "Item 4", "Item 5"};

            public int getSize() {
                return strings.length;
            }

            public String getElementAt(int i) {
                return strings[i];
            }
        });
        jScrollPane1.setViewportView(listMessage);

        btnChooseFile.setText("Choose File");
        btnChooseFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChooseFileActionPerformed(evt);
            }
        });

        btnReadFile.setText("Read");

        btnPauseRead.setText("Pause");

        btnContinueRead.setText("Continue");

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
        if (result == JFileChooser.APPROVE_OPTION) {
            File file = jFileChooser.getSelectedFile();
            lbPathFile.setText(file.getPath());
            System.out.println(file);
        }
    }//GEN-LAST:event_btnChooseFileActionPerformed

    private void btnCancelReadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelReadActionPerformed
        // TODO add your handling code here:
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
