
package HARDWARE;
import java.awt.event.KeyEvent;
import static java.lang.Thread.sleep;
import java.sql.*;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Random;
import javax.swing.JOptionPane;

public class COUNTER extends javax.swing.JFrame {
Connection conn;
ResultSet rst;
PreparedStatement pst;

    public COUNTER() {
      
       this.setUndecorated(true);
        initComponents();
         setExtendedState(COUNTER.MAXIMIZED_BOTH);
        conn=CONNECTION.connectsqlite();
        currentdate();
    }
 private void  Update_table(){
        try{
    String sql = "select * from STOCK";
    pst = conn.prepareStatement(sql);
    rst = pst.executeQuery();
     //tblBarcode.setModel(DbUtils.resultSetToTableModel(rst));
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
   public void currentdate() {

        Thread clock = new Thread() {
            
            public void run() {
                for (;;) {
                    Calendar cal = new GregorianCalendar();
                    int month = cal.get(Calendar.MONTH);
                    int year = cal.get(Calendar.YEAR);
                    int day = cal.get(Calendar.DAY_OF_MONTH);
                    TELLER.setText(year + "/" + (month + 1) + "/" + day);

                    //time
                    int second = cal.get(Calendar.SECOND);
                    int minute = cal.get(Calendar.MINUTE);
                    int hour = cal.get(Calendar.HOUR);
                    TIME.setText(hour + ":" + (minute) + ":" + second);
                    //TIME.setEditable(false);
                    //DATE.setEditable(false);
                    try {
                        sleep(1000);
                    } catch (InterruptedException ex) {
                        java.util.logging.Logger.getLogger(LOGIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                    } 
                }

            }
        };
        clock.start();
    } 
   
    public void autoid() {
        Random w;
        w = new Random();
        C_NO.setText("CUST_10" + w.nextInt(100 + 1));

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        BACK = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        CATEGORY = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        BARCODE = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        MEASUREMENTS = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        PRICE = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        SEARCH = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        QNTY = new javax.swing.JTextField();
        SUPPLIER = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        DATE_OF_STOCK = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        REFRESH = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();
        EVALUTE = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        receipt = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        B_ITEM = new javax.swing.JTextField();
        C_NO = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        QUANTITY = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        CASH = new javax.swing.JTextField();
        CHANGE = new javax.swing.JTextField();
        AMOUNT = new javax.swing.JTextField();
        ADDTOCART = new javax.swing.JButton();
        TIME = new javax.swing.JTextField();
        TELLER = new javax.swing.JTextField();
        DATE = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        update = new javax.swing.JMenuItem();
        info = new javax.swing.JMenuItem();
        report = new javax.swing.JMenuItem();
        logout = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HARDWARE/icons8_shrink_48px.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1440, 10, 50, 40));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HARDWARE/icons8_cancel_48px.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1490, 10, 60, 40));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HARDWARE/icons8_icons8_100px_4.png"))); // NOI18N
        jLabel1.setText("COMPANY ICON");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 490, 100));

        BACK.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        BACK.setForeground(new java.awt.Color(153, 0, 0));
        BACK.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HARDWARE/icons8_back_to_24px.png"))); // NOI18N
        BACK.setText("BACK");
        BACK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BACKMouseClicked(evt);
            }
        });
        getContentPane().add(BACK, new org.netbeans.lib.awtextra.AbsoluteConstraints(1470, 810, -1, -1));

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 0, 10, 790));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setText("ssebakumba martin");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 820, -1, 30));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel20.setText("QUANTITY");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 550, -1, 40));

        CATEGORY.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        CATEGORY.setForeground(new java.awt.Color(102, 0, 102));
        getContentPane().add(CATEGORY, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 460, 270, 60));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setText("CATEGORY");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 460, -1, 50));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 810, 680, 10));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 0));
        jLabel8.setText("Produced by;");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 820, -1, 30));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 21)); // NOI18N
        jLabel13.setText("DATE OF STOCK");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 620, 160, 40));
        getContentPane().add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 520, 10));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 255, 255), 3, true));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BARCODE.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BARCODE.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 51), 2));
        BARCODE.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                BARCODEKeyPressed(evt);
            }
        });
        jPanel1.add(BARCODE, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, 270, 60));

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel3.setText("BARCODE");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 140, 50));

        jLabel21.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel21.setText("ITEM");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 70, 50));

        MEASUREMENTS.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        MEASUREMENTS.setForeground(new java.awt.Color(102, 0, 102));
        jPanel1.add(MEASUREMENTS, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 630, 270, 60));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel7.setText("MEASUREMENT");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 640, -1, 50));

        PRICE.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        PRICE.setForeground(new java.awt.Color(102, 0, 102));
        jPanel1.add(PRICE, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 240, 270, 60));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel6.setText("PRICE");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, -1, 50));

        SEARCH.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        SEARCH.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                SEARCHKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                SEARCHKeyTyped(evt);
            }
        });
        jPanel1.add(SEARCH, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, 270, 60));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 102, 102));
        jLabel10.setText("Stock details");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 230, 40));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 370, 10));

        QNTY.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        QNTY.setForeground(new java.awt.Color(102, 0, 102));
        jPanel1.add(QNTY, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 390, 270, 60));

        SUPPLIER.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        SUPPLIER.setForeground(new java.awt.Color(102, 0, 102));
        jPanel1.add(SUPPLIER, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 560, 270, 60));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 21)); // NOI18N
        jLabel11.setText("SUPPLIED BY;");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 560, 140, 40));
        jPanel1.add(DATE_OF_STOCK, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 480, 270, 60));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 500, 710));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        REFRESH.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        REFRESH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HARDWARE/icons8_refresh_50px.png"))); // NOI18N
        REFRESH.setText("REFRESH");
        REFRESH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                REFRESHActionPerformed(evt);
            }
        });
        jPanel2.add(REFRESH, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 680, 240, 50));

        jSeparator4.setForeground(new java.awt.Color(153, 0, 0));
        jPanel2.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 660, 600, 10));

        EVALUTE.setBackground(new java.awt.Color(204, 255, 255));
        EVALUTE.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        EVALUTE.setText("EVALUATE");
        EVALUTE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EVALUTEActionPerformed(evt);
            }
        });
        jPanel2.add(EVALUTE, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 680, 170, 50));

        jButton3.setBackground(new java.awt.Color(153, 204, 255));
        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton3.setText("PRINT");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 680, 120, 50));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel16.setText("CHANGE");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, 100, 50));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel9.setText("AMOUNT");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 120, 40));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel15.setText("CASH");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 80, 40));

        receipt.setColumns(20);
        receipt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        receipt.setRows(5);
        jScrollPane1.setViewportView(receipt);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 40, 380, 620));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 2, true));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        B_ITEM.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        B_ITEM.setForeground(new java.awt.Color(0, 204, 0));
        B_ITEM.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                B_ITEMKeyTyped(evt);
            }
        });
        jPanel3.add(B_ITEM, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, 330, 60));

        C_NO.setFont(new java.awt.Font("Segoe UI Emoji", 0, 24)); // NOI18N
        jPanel3.add(C_NO, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, 330, 60));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel14.setText("CUSTOMER NO.");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel17.setText("QUANTITY");
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        jLabel19.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel19.setText("ITEM");
        jPanel3.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 70, 50));

        QUANTITY.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        QUANTITY.setForeground(new java.awt.Color(0, 204, 0));
        QUANTITY.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                QUANTITYKeyTyped(evt);
            }
        });
        jPanel3.add(QUANTITY, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 160, 330, 60));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 620, 250));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 2, true));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CASH.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        CASH.setForeground(new java.awt.Color(51, 0, 204));
        CASH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CASHActionPerformed(evt);
            }
        });
        CASH.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                CASHKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CASHKeyTyped(evt);
            }
        });
        jPanel4.add(CASH, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, 330, 60));

        CHANGE.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        jPanel4.add(CHANGE, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 330, 70));

        AMOUNT.setFont(new java.awt.Font("Segoe UI", 1, 23)); // NOI18N
        jPanel4.add(AMOUNT, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 330, 60));

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 620, 330));

        ADDTOCART.setBackground(new java.awt.Color(204, 204, 204));
        ADDTOCART.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ADDTOCART.setText("ADD TO CART");
        ADDTOCART.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADDTOCARTActionPerformed(evt);
            }
        });
        jPanel2.add(ADDTOCART, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 680, 160, 50));

        TIME.setFont(new java.awt.Font("Segoe UI Emoji", 0, 24)); // NOI18N
        jPanel2.add(TIME, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, 170, 40));

        TELLER.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        TELLER.setForeground(new java.awt.Color(102, 0, 102));
        jPanel2.add(TELLER, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 140, 40));

        DATE.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        DATE.setForeground(new java.awt.Color(102, 0, 102));
        jPanel2.add(DATE, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 10, 140, 40));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 60, 1020, 740));

        jLabel18.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel18.setText("ITEM");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 70, 50));

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 102, 102));
        jLabel22.setText("Customer's details");
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 0, 320, 30));
        getContentPane().add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 30, 390, 10));

        jMenu1.setText("File");
        jMenu1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        update.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        jMenu1.add(update);

        info.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        info.setText("Info");
        jMenu1.add(info);

        report.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        report.setText("Report");
        jMenu1.add(report);

        logout.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        logout.setText("Lougout");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        jMenu1.add(logout);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenu2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        setExtendedState(COUNTER.ICONIFIED);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        System.exit(WIDTH);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void SEARCHKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SEARCHKeyTyped
        // TODO add your handling code here:
       
    }//GEN-LAST:event_SEARCHKeyTyped

    private void REFRESHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_REFRESHActionPerformed
        // TODO add your handling code here:
        try {
        SEARCH.setText("");
        MEASUREMENTS.setText("");
        QNTY.setText("");
        CATEGORY.setText("");
        PRICE.setText("");
        SUPPLIER.setText("");
        CASH.setText("");
       CHANGE.setText("");
       AMOUNT.setText("");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
                
     autoid();   

    }//GEN-LAST:event_REFRESHActionPerformed

    private void SEARCHKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SEARCHKeyPressed
        // TODO add your handling code here:
         if(evt.getKeyChar()==KeyEvent.VK_ENTER){
             String s=SEARCH.getText();
              try {
        String sql="select * from STOCK where name='"+s+"'";
        pst=conn.prepareStatement(sql);
        rst=pst.executeQuery();
        if(rst.next()){
            BARCODE.setText(rst.getString(1));
          PRICE.setText(rst.getString(3));
          QNTY.setText(rst.getString(8));
          MEASUREMENTS.setText(rst.getString(9));
          CATEGORY.setText(rst.getString(4));
          SUPPLIER.setText(rst.getString(7));
          B_ITEM.setText(rst.getString(2));
        }
        else{
            JOptionPane.showMessageDialog(null, "INVALID INPUT");
        }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        }
    }//GEN-LAST:event_SEARCHKeyPressed

    private void B_ITEMKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_B_ITEMKeyTyped
       /* char c=evt.getKeyChar();
        if(!(Character.isDigit(c)))
        evt.consume();*/
    }//GEN-LAST:event_B_ITEMKeyTyped

    private void ADDTOCARTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADDTOCARTActionPerformed
        // TODO add your handling code here:
        String item=B_ITEM.getText();
        String price=PRICE.getText();
        String quantity=QNTY.getText();

    }//GEN-LAST:event_ADDTOCARTActionPerformed

    private void CASHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CASHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CASHActionPerformed

    private void CASHKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CASHKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyChar()==KeyEvent.VK_ENTER){
            String s1 =QNTY.getText();
            String s2 = QUANTITY.getText();
            String s3 = PRICE.getText();
            String s4=CASH.getText();
            int d1 = Integer.parseInt(s1);
            int d2 = Integer.parseInt(s2);
            int d4 = Integer.parseInt(s3);
            int d5 = Integer.parseInt(s4);
            //Returns the remained quantity
            int d3 = d1-d2;

            // checking wether the reqiured is there in the stock
            if(d1<=d2){
                JOptionPane.showMessageDialog(null, "The stock is less than the reqiured Quantity");
            }
            else{
                try {
                    // total amount to pay
                    int totalproductPrice = d2 * d4;
                    String t=String.valueOf(totalproductPrice);
                    AMOUNT.setText(t);
                    AMOUNT.setEditable(false);
                    // change
                    int balance=d5-totalproductPrice;
                    String bal=String.valueOf(balance);
                    CHANGE.setText(bal);
                    CHANGE.setEditable(false);
                    //***********************SUPERMARKET SOLD ITEMS************************************************************

                    String sql= "Insert into SOLD_ITEMS(CODE,NAMEOF_PRODUCT,AMOUNT,TOTAL_AMOUNT,CASH_BROUGHT,CHANGE_GIVEN,QUANTITY,DATE,TIME,TELLER) values(?,?,?,?,?,?,?,?,?,?)";
                    pst= conn.prepareStatement(sql);
                    pst.setString(1,BARCODE.getText());
                    pst.setString(2,B_ITEM.getText());
                    pst.setString(3, PRICE.getText());
                    pst.setString(4, AMOUNT.getText());
                    pst.setString(5, CASH.getText());
                    pst.setString(6, CHANGE.getText());
                    pst.setString(7,QUANTITY.getText());
                    pst.setString(8, DATE.getText());
                    pst.setString(9,TIME.getText());
                    pst.setString(10,TELLER.getText());
                    pst.execute();
                    rst.close();
                    pst.close();
                    /////////////////updating the item_store table////////////////////////
                    try {
                        String code_id = BARCODE.getText();
                        String quanty = QNTY.getText();
                        String sold_no = QUANTITY.getText();

                        int quantity_before_selling = Integer.parseInt(quanty);
                        int sold_quantity = Integer.parseInt(sold_no);

                        int REMAINDER_IN_STORE = quantity_before_selling-sold_quantity;

                        String update = "update STOCK set QUANTITY ='"+REMAINDER_IN_STORE+"'where BARCODE ='"+code_id+"'";

                        pst = conn.prepareStatement(update);
                        pst.execute();

                        rst.close();
                        pst.close();

                        Update_table();
                    } catch (Exception e) {
                        JOptionPane.showConfirmDialog(null,e);
                    }

                    ///////////////////////////////////////////////////////////////////////////////////////////////////////
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, e);
                }
                finally{
                    try{
                        rst.close();
                        pst.close();
                    }
                    catch(Exception e){}
                }

                receipt.setText("        MARTEX SUPERMARKET"+"\n"+
                    "      P.OBox 1113-KAMPALA_Uganda" +"\n"+
                    "  Email: martinsseba3@gmail.com"+"\n"+
                    "  Tel: 0700562982/0776121843"+"\n\n"+
                    "                SALES RECIEPT  "+"\n\n"+
                    "ITEM "+"\t"+"QNTY "+"\t"+"PRICE"+"\t"+"TOTAL"+"\n\n"+
                    B_ITEM.getText()+"\t"+QUANTITY.getText()+"\t"+PRICE.getText()+"\t"+AMOUNT.getText()+"\n\n\n\n\n\n\n"+
                    "GRAND TOTAL: .........."+AMOUNT.getText()+"\n\n"+
                    "CASH  : .........................."+CASH.getText()+"\n\n"+
                    "                         "+"CHANGE: ...."+CHANGE.getText()

                );
                //clear();

                JOptionPane.showMessageDialog(null, "THANK YOU; WELLDONE");

            }

        }
    }//GEN-LAST:event_CASHKeyPressed

    private void CASHKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CASHKeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
        if(!(Character.isDigit(c)))
        evt.consume();
    }//GEN-LAST:event_CASHKeyTyped

    private void EVALUTEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EVALUTEActionPerformed
        // TODO add your handling code here:

        
            String s1 =QNTY.getText();
            String s2 = QUANTITY.getText();
            String s3 = PRICE.getText();
            String s4=CASH.getText();
            int d1 = Integer.parseInt(s1);
            int d2 = Integer.parseInt(s2);
            int d4 = Integer.parseInt(s3);
            int d5 = Integer.parseInt(s4);
            //Returns the remained quantity
            int d3 = d1-d2;

            // checking wether the reqiured is there in the stock
            if(d1<=d2){
                JOptionPane.showMessageDialog(null, "The stock is less than the reqiured Quantity");
            }
            else{
                try {
                    // total amount to pay
                    int totalproductPrice = d2 * d4;
                    String t=String.valueOf(totalproductPrice);
                    AMOUNT.setText(t);
                    AMOUNT.setEditable(false);
                    // change
                    int balance=d5-totalproductPrice;
                    String bal=String.valueOf(balance);
                    CHANGE.setText(bal);
                    CHANGE.setEditable(false);
                    //***********************SUPERMARKET SOLD ITEMS************************************************************

                    String sql= "Insert into SOLD_ITEMS(CODE,NAMEOF_PRODUCT,AMOUNT,TOTAL_AMOUNT,CASH_BROUGHT,CHANGE_GIVEN,QUANTITY,DATE,TIME,TELLER) values(?,?,?,?,?,?,?,?,?,?)";
                    pst= conn.prepareStatement(sql);
                    pst.setString(1,BARCODE.getText());
                    pst.setString(2,B_ITEM.getText());
                    pst.setString(3, PRICE.getText());
                    pst.setString(4, AMOUNT.getText());
                    pst.setString(5, CASH.getText());
                    pst.setString(6, CHANGE.getText());
                    pst.setString(7,QUANTITY.getText());
                    pst.setString(8, DATE.getText());
                    pst.setString(9,TIME.getText());
                    pst.setString(10,TELLER.getText());
                    pst.execute();
                    rst.close();
                    pst.close();
                    /////////////////updating the item_store table////////////////////////
                    try {
                        String code_id = BARCODE.getText();
                        String quanty = QNTY.getText();
                        String sold_no = QUANTITY.getText();

                        int quantity_before_selling = Integer.parseInt(quanty);
                        int sold_quantity = Integer.parseInt(sold_no);

                        int REMAINDER_IN_STORE = quantity_before_selling-sold_quantity;

                        String update = "update STOCK set QUANTITY ='"+REMAINDER_IN_STORE+"'where BARCODE ='"+code_id+"'";

                        pst = conn.prepareStatement(update);
                        pst.execute();

                        rst.close();
                        pst.close();

                        Update_table();
                    } catch (Exception e) {
                        JOptionPane.showConfirmDialog(null,e);
                    }

                    ///////////////////////////////////////////////////////////////////////////////////////////////////////
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, e);
                }
                finally{
                    try{
                        rst.close();
                        pst.close();
                    }
                    catch(Exception e){}
                }

                receipt.setText("        MARTEX SUPERMARKET"+"\n"+
                    "      P.OBox 1113-KAMPALA_Uganda" +"\n"+
                    "  Email: martinsseba3@gmail.com"+"\n"+
                    "  Tel: 0700562982/0776121843"+"\n\n"+
                    "                SALES RECIEPT  "+"\n\n"+
                    "ITEM "+"\t"+"QNTY "+"\t"+"PRICE"+"\t"+"TOTAL"+"\n\n"+
                    B_ITEM.getText()+"\t"+QUANTITY.getText()+"\t"+PRICE.getText()+"\t"+AMOUNT.getText()+"\n\n\n\n\n\n\n"+
                    "GRAND TOTAL: .........."+AMOUNT.getText()+"\n\n"+
                    "CASH  : .........................."+CASH.getText()+"\n\n"+
                    "                         "+"CHANGE: ...."+CHANGE.getText()

                );
                //clear();

                JOptionPane.showMessageDialog(null, "THANK YOU; WELLDONE");

            }

        
    }//GEN-LAST:event_EVALUTEActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        try {
           // receipt.print();
        } catch (Exception e) {
        }

    }//GEN-LAST:event_jButton3ActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_updateActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_logoutActionPerformed

    private void BARCODEKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BARCODEKeyPressed
        // TODO add your handling code here:
         if(evt.getKeyChar()==KeyEvent.VK_ENTER){
             String s=BARCODE.getText();
              try {
        String sql="select * from STOCK where barcode='"+s+"'";
        pst=conn.prepareStatement(sql);
        rst=pst.executeQuery();
        if(rst.next()){
            SEARCH.setText(rst.getString(2));
          PRICE.setText(rst.getString(3));
          QNTY.setText(rst.getString(8));
          MEASUREMENTS.setText(rst.getString(9));
          CATEGORY.setText(rst.getString(4));
          SUPPLIER.setText(rst.getString(7));
          B_ITEM.setText(rst.getString(2));
        }
        else{
            JOptionPane.showMessageDialog(null, "INVALID INPUT");
        }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        }
    }//GEN-LAST:event_BARCODEKeyPressed

    private void QUANTITYKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_QUANTITYKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_QUANTITYKeyTyped

    private void BACKMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BACKMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        new LOGIN().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BACKMouseClicked

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
            java.util.logging.Logger.getLogger(COUNTER.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(COUNTER.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(COUNTER.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(COUNTER.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new COUNTER().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ADDTOCART;
    private javax.swing.JTextField AMOUNT;
    private javax.swing.JLabel BACK;
    private javax.swing.JTextField BARCODE;
    private javax.swing.JTextField B_ITEM;
    private javax.swing.JTextField CASH;
    private javax.swing.JTextField CATEGORY;
    private javax.swing.JTextField CHANGE;
    private javax.swing.JTextField C_NO;
    private javax.swing.JTextField DATE;
    private javax.swing.JTextField DATE_OF_STOCK;
    private javax.swing.JButton EVALUTE;
    private javax.swing.JTextField MEASUREMENTS;
    private javax.swing.JTextField PRICE;
    private javax.swing.JTextField QNTY;
    private javax.swing.JTextField QUANTITY;
    private javax.swing.JButton REFRESH;
    private javax.swing.JTextField SEARCH;
    private javax.swing.JTextField SUPPLIER;
    private javax.swing.JTextField TELLER;
    private javax.swing.JTextField TIME;
    private javax.swing.JMenuItem info;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JMenuItem logout;
    private javax.swing.JTextArea receipt;
    private javax.swing.JMenuItem report;
    private javax.swing.JMenuItem update;
    // End of variables declaration//GEN-END:variables
}
