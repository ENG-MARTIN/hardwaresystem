/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package HARDWARE;

import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import java.sql.*;
import net.proteanit.sql.DbUtils;
public class ADD_ITEM extends javax.swing.JFrame {
Connection conn;
ResultSet rst;
PreparedStatement pst;
   
    public ADD_ITEM() {
        initComponents();
        conn=CONNECTION.connectsqlite();
    }
 private void  Update_table(){
        try{
    String sql = "select * from STOCK";
    pst = conn.prepareStatement(sql);
    rst = pst.executeQuery();
    }
    catch(Exception e){
        JOptionPane.showMessageDialog(null, e);
    }
    finally{
        try{
          
            rst.close();
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }
   }
 public void clear(){
    barcodeTxt.setText("");
     NAME.setText("");
      QUANTITY.setText("");
       PRICE.setText("");
}
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        barcodeTxt = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        DELETE = new javax.swing.JButton();
        SAVE = new javax.swing.JButton();
        RENAME = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        UPDATE = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        CATEGORY = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        STOCK_AMNT = new javax.swing.JTextField();
        QUANTITY = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        NAME = new javax.swing.JTextField();
        PRICE = new javax.swing.JTextField();
        BACK = new javax.swing.JButton();
        SUPPLIER = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        DATE = new com.toedter.calendar.JDateChooser();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        TABLE = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        details = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        MEASUREMENT = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        barcodeTxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        barcodeTxt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 2, new java.awt.Color(0, 0, 0)));
        barcodeTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                barcodeTxtActionPerformed(evt);
            }
        });
        barcodeTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                barcodeTxtKeyPressed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(204, 102, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jButton1.setText("READ BARCODE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 0), 2, true));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(153, 255, 204));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        DELETE.setBackground(new java.awt.Color(153, 153, 255));
        DELETE.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        DELETE.setForeground(new java.awt.Color(153, 0, 0));
        DELETE.setText("DELETE ITEM");
        DELETE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DELETEActionPerformed(evt);
            }
        });
        jPanel2.add(DELETE, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 220, 60));

        SAVE.setBackground(new java.awt.Color(51, 51, 0));
        SAVE.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        SAVE.setForeground(new java.awt.Color(0, 153, 0));
        SAVE.setText("SAVE ITEM");
        SAVE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SAVEActionPerformed(evt);
            }
        });
        jPanel2.add(SAVE, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 210, 60));

        RENAME.setBackground(new java.awt.Color(102, 0, 102));
        RENAME.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        RENAME.setText("RENAME ITEM");
        RENAME.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RENAMEActionPerformed(evt);
            }
        });
        jPanel2.add(RENAME, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 220, 70));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 470, 260, 10));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 250, 10));
        jPanel2.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 260, 10));
        jPanel2.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 260, 10));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText(" COMMANDS");
        jLabel3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 2, 0, 2, new java.awt.Color(0, 0, 0)));
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 190, 30));
        jPanel2.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 260, 10));

        UPDATE.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        UPDATE.setText("UPDATE ITEM");
        UPDATE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UPDATEActionPerformed(evt);
            }
        });
        jPanel2.add(UPDATE, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 210, 60));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 20, 260, 680));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setText("NAME OF THE ITEM");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 250, 40));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("PRICE TO SELL");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 200, 30));

        CATEGORY.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        CATEGORY.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SPICES", "SNACK", "LAUNDRY", "MECHANICS", "CONSTRUCTION", "BEDDINGS", "SCHOOL MATERIAL", "KITCHEN WARE", "ELECTRONICS" }));
        CATEGORY.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel1.add(CATEGORY, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 390, 290, 60));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel6.setText("DATE");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 110, 40));

        STOCK_AMNT.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel1.add(STOCK_AMNT, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 310, 290, 60));

        QUANTITY.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel1.add(QUANTITY, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 80, 290, 60));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("QUANTITY STOCKED");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 270, 30));

        NAME.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel1.add(NAME, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 290, 60));

        PRICE.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel1.add(PRICE, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 160, 290, 60));

        BACK.setBackground(new java.awt.Color(51, 0, 51));
        BACK.setFont(new java.awt.Font("Segoe Print", 1, 28)); // NOI18N
        BACK.setForeground(new java.awt.Color(0, 102, 102));
        BACK.setText("LOGOUT");
        BACK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BACKActionPerformed(evt);
            }
        });
        jPanel1.add(BACK, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 620, 200, -1));

        SUPPLIER.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        SUPPLIER.setForeground(new java.awt.Color(51, 153, 255));
        SUPPLIER.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mr.Kitwe", "Mr.Kaggwa", "M&R Suppliers", "D.K Events", "Producer", "Coca cola", "Pepsi", " " }));
        SUPPLIER.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel1.add(SUPPLIER, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 540, 290, 60));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel9.setText("STOCKED AT ");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 160, 40));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel10.setText("Supplied by ;");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 550, 160, 40));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel11.setText("MEASURED IN");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 180, 40));

        DATE.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel1.add(DATE, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 230, 290, 60));

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N

        TABLE.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        details.setBackground(new java.awt.Color(204, 204, 204));
        details.setBorder(new javax.swing.border.MatteBorder(null));
        details.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        details.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "BARCODE", "SUPLLIER", "COST", "TOTAL"
            }
        ));
        details.setGridColor(new java.awt.Color(0, 255, 0));
        details.setSelectionForeground(new java.awt.Color(204, 51, 0));
        jScrollPane1.setViewportView(details);

        TABLE.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 670, 330));

        jTabbedPane1.addTab("IN TABLE", TABLE);

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel12.setText("Search by Name");
        jPanel5.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, 30));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel13.setText("Search by Barcode");
        jPanel5.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, 30));

        jTextField1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 0, 204));
        jPanel5.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 40, 270, 50));

        jTextField2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(255, 0, 204));
        jPanel5.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, 270, 50));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(102, 102, 102));
        jLabel14.setText("LAST  STOCK :");
        jPanel5.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, -1));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(102, 102, 102));
        jLabel16.setText("MAXIMUM DATE :");
        jPanel5.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, -1, -1));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(102, 102, 102));
        jLabel17.setText("SUPLLIERS' CONTACT :");
        jPanel5.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, -1, -1));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(102, 102, 102));
        jLabel18.setText("QUANTITY :");
        jPanel5.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 204, 204));
        jLabel19.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel5.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 360, 230, 50));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 204, 204));
        jLabel20.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel5.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 230, 230, 50));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 204, 204));
        jLabel21.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel5.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 290, 230, 50));

        jLabel22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel22MouseClicked(evt);
            }
        });
        jPanel5.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 440, 60, 50));

        jLabel23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel23MouseClicked(evt);
            }
        });
        jPanel5.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 440, 60, 50));

        jLabel24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel24MouseClicked(evt);
            }
        });
        jPanel5.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 440, 60, 50));

        jLabel25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel25MouseClicked(evt);
            }
        });
        jPanel5.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 440, 60, 50));

        jTabbedPane1.addTab("CHECK STOCK", jPanel5);

        jPanel1.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 30, 670, 620));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel15.setText("CATEGORY");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 160, 40));

        MEASUREMENT.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel1.add(MEASUREMENT, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 470, 290, 60));

        jButton2.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(204, 0, 51));
        jButton2.setText("BACK");
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 620, 130, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(barcodeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(barcodeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void barcodeTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_barcodeTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_barcodeTxtActionPerformed

    private void barcodeTxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_barcodeTxtKeyPressed
        // TODO add your handling code here:
        String sb = barcodeTxt.getText();
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){

            JOptionPane.showMessageDialog(null, "barcode studied as:"+sb);
            NAME.requestFocus();
        }

    }//GEN-LAST:event_barcodeTxtKeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void DELETEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DELETEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DELETEActionPerformed

    private void SAVEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SAVEActionPerformed
        // TODO add your handling code here:
        
                try{
                    String sql= "Insert into STOCK (BARCODE,NAME,PRICE,CATEGORY,DATE_OF_LASTSTOCK,STOCK_PRICE,SUPPLIER,QUANTITY,MEASUREMENT) values(?,?,?,?,?,?,?,?,?)";
                    pst= conn.prepareStatement(sql);
                    pst.setString(1,barcodeTxt.getText());
                    pst.setString(2,NAME.getText());
                    pst.setString(3,PRICE.getText());
                    pst.setString(4,CATEGORY.getSelectedItem().toString());
                    pst.setString(5, DATE.getDate().toString());
                    pst.setString(6, STOCK_AMNT.getText());
                    pst.setString(7, SUPPLIER.getSelectedItem().toString());
                      pst.setString(8,QUANTITY.getText());
                      pst.setString(9, MEASUREMENT.getText());
                    pst.execute();
                    JOptionPane.showMessageDialog(null,"Successful");
                    //details.setModel(DbUtils.resultSetToTableModel(rst));
                }
                catch(SQLException | HeadlessException e){
                    JOptionPane.showMessageDialog(null,e);
                }
                Update_table();

                clear();
            }

            private void RenameActionPerformed(java.awt.event.ActionEvent evt) {
                try{
                    String value1 = barcodeTxt.getText();
                    String value2 = NAME.getText();
                    String value3 = QUANTITY.getText();
                    String value4 = PRICE.getText();

                    String sql= "update ITEM_STORE set NAME ='"+value2+"', QUANTITY='"+value3+"',PRICE='"+value4+"' where BARCODE='"+value1+"' ";

                    pst= conn.prepareStatement(sql);
                    pst.execute();
                    JOptionPane.showMessageDialog(null,"Renamed");
                }
                catch(Exception e){
                    JOptionPane.showMessageDialog(null,e);
                }
                Update_table();
                clear();
    }//GEN-LAST:event_SAVEActionPerformed

    private void RENAMEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RENAMEActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_RENAMEActionPerformed

    private void UPDATEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UPDATEActionPerformed
        // TODO add your handling code here:
        try{
            String value1 = barcodeTxt.getText();
            String value2 = NAME.getText();
            String value3 = QUANTITY.getText();
            String value4 = PRICE.getText();

            String sql= "update STOCK set QUANTITY='"+value3+"',PRICE='"+value4+"' where BARCODE='"+value1+"' ";

            pst= conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null,"ITEM UPDATED ONLY BY QUANTITY AND PRICE");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        Update_table();
        clear();
    }//GEN-LAST:event_UPDATEActionPerformed

    private void BACKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BACKActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new LOGIN().setVisible(true);
        this.setVisible(true);
        dispose();
    }//GEN-LAST:event_BACKActionPerformed

    private void jLabel22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MouseClicked
        // TODO add your handling code here:
        //JOptionPane.showMessageDialog(null, "+256 700562982");
        JOptionPane.showMessageDialog(null, "this is the contact +256 700562982", "WHATSAPP CONTACT", HEIGHT);
    }//GEN-LAST:event_jLabel22MouseClicked

    private void jLabel23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel23MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel23MouseClicked

    private void jLabel24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel24MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel24MouseClicked

    private void jLabel25MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel25MouseClicked
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "this is the contact +256 700562982", "WHATSAPP CONTACT", HEIGHT);
    }//GEN-LAST:event_jLabel25MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ADD_ITEM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ADD_ITEM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ADD_ITEM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ADD_ITEM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ADD_ITEM().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BACK;
    private javax.swing.JComboBox<String> CATEGORY;
    private com.toedter.calendar.JDateChooser DATE;
    private javax.swing.JButton DELETE;
    private javax.swing.JTextField MEASUREMENT;
    private javax.swing.JTextField NAME;
    private javax.swing.JTextField PRICE;
    private javax.swing.JTextField QUANTITY;
    private javax.swing.JButton RENAME;
    private javax.swing.JButton SAVE;
    private javax.swing.JTextField STOCK_AMNT;
    private javax.swing.JComboBox<String> SUPPLIER;
    private javax.swing.JPanel TABLE;
    private javax.swing.JButton UPDATE;
    private javax.swing.JTextField barcodeTxt;
    private javax.swing.JTable details;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
