/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.atm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class FASTCASH extends javax.swing.JFrame {

    public FASTCASH() {
        initComponents();
    }
    String MyAccnum;
    public FASTCASH(String Accnum) {
        initComponents();
        MyAccnum=Accnum;
        
    }
    @SuppressWarnings("unchecked")
    private void initComponents() {
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        fastcash500 = new javax.swing.JButton();
        fastcash1000 = new javax.swing.JButton();
        fastcash100 = new javax.swing.JButton();
        fastcash1001 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(100, 100, 100));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14));
        jLabel1.setText("                     WELCOME  TO  THE  ATM");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(149, 149, 149)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(150, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
        );

        fastcash500.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24));
        fastcash500.setText("500");
        fastcash500.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fastcash500MouseClicked(evt);
            }
        });

        fastcash1000.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24));
        fastcash1000.setText("1000");
        fastcash1000.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fastcash1000MouseClicked(evt);
            }
        });
        fastcash1000.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fastcash1000ActionPerformed(evt);
            }
        });
        fastcash1000.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                fastcash1000KeyPressed(evt);
            }
        });

        fastcash100.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24));
        fastcash100.setText("100");
        fastcash100.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fastcash100MouseClicked(evt);
            }
        });
        fastcash100.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fastcash100ActionPerformed(evt);
            }
        });

        fastcash1001.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24));
        fastcash1001.setText("BACK");
        fastcash1001.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fastcash1001MouseClicked(evt);
            }
        });
        fastcash1001.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fastcash1001ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(fastcash1001, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(fastcash100, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(fastcash500, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(fastcash1000, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(239, 239, 239))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fastcash100, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fastcash500, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addComponent(fastcash1000, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(fastcash1001, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );
        pack();
    }

    private void fastcash1000ActionPerformed(java.awt.event.ActionEvent evt) {
    }

    Connection conn=null;
    PreparedStatement stmt = null;
    ResultSet rs = null;
    private void fastcash100MouseClicked(java.awt.event.MouseEvent evt) {
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/atm2?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "Abd41492080@");
            stmt = conn.prepareStatement("SELECT balance FROM accounts WHERE card_number ='" + MyAccnum + "'");
            rs = stmt.executeQuery();
            if (rs.next()) {
                double oldbalance = rs.getDouble("balance");
                if (100 > oldbalance) {
                    JOptionPane.showMessageDialog(this, "INSUFFICIENT BALANCE!");
                } else {
                    double newbalance = oldbalance - 100;
                    stmt = conn.prepareStatement("UPDATE accounts SET balance = ? WHERE card_number = ?");
                    stmt.setDouble(1, newbalance);
                    stmt.setString(2, MyAccnum);
                    if (stmt.executeUpdate() == 1) {
                        JOptionPane.showMessageDialog(this, "AMOUNT WITHDRAWN SUCCESSFULLY");
                    } else {
                        JOptionPane.showMessageDialog(this, "PLEASE ENTER THE AMOUNT !");
                    }
                }
            }
            stmt.close();
            stmt = conn.prepareStatement("INSERT INTO transactions (card_number, amount, type) VALUES (? ,? ,?)");
            stmt.setString(1, MyAccnum);
            stmt.setDouble(2, Double.parseDouble(fastcash100.getText()));
            stmt.setString(3, "Debited");
            stmt.executeUpdate();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }

    private void fastcash500MouseClicked(java.awt.event.MouseEvent evt) {
        try{
         conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/atm2?zeroDateTimeBehavior=CONVERT_TO_NULL","root","Abd41492080@");
         stmt=conn.prepareStatement("SELECT balance FROM accounts WHERE card_number ='"+MyAccnum+"'");
         rs = stmt.executeQuery();
         if(rs.next()){
             double oldbalance=rs.getDouble("balance");
             if(500>oldbalance)
             {
                JOptionPane.showMessageDialog(this,"INSUFFICIENT BALANCE!");
                
             }else{
             double newbalance=oldbalance-500;
             stmt = conn.prepareStatement("UPDATE accounts SET balance = ? WHERE card_number = ?");
             stmt.setDouble(1, newbalance);
             stmt.setString(2, MyAccnum);
             if(stmt.executeUpdate()==1)
             {
                 JOptionPane.showMessageDialog(this,"AMOUNT WITHDRAWN SUCCESSFULLY");
             }
            else{
             JOptionPane.showMessageDialog(this,"PLEASE ENTER THE AMOUNT !");}
             }
         }
            stmt.close();
            stmt = conn.prepareStatement("INSERT INTO transactions (card_number, amount, type) VALUES (? ,? ,?)");
            stmt.setString(1, MyAccnum);
            stmt.setDouble(2, Double.parseDouble(fastcash500.getText()));
            stmt.setString(3, "Debited");
            stmt.executeUpdate();
        }catch(Exception e){
            JOptionPane.showMessageDialog(this,e);
        }
    }
    private void fastcash1000MouseClicked(java.awt.event.MouseEvent evt) {
        try{
         conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/atm2?zeroDateTimeBehavior=CONVERT_TO_NULL","root","Abd41492080@");
         stmt=conn.prepareStatement("SELECT balance FROM accounts WHERE card_number ='"+MyAccnum+"'");
         rs = stmt.executeQuery();
         if(rs.next()){
             double oldbalance=rs.getDouble("balance");
             if(1000>oldbalance)
             {
                JOptionPane.showMessageDialog(this,"INSUFFICIENT BALANCE!");
                
             }else{
             double newbalance=oldbalance-1000;
             stmt = conn.prepareStatement("UPDATE accounts SET balance = ? WHERE card_number = ?");
             stmt.setDouble(1, newbalance);
             stmt.setString(2, MyAccnum);
             if(stmt.executeUpdate()==1)
             {
                 JOptionPane.showMessageDialog(this,"AMOUNT WITHDRAWN SUCCESSFULLY");
             }
            else{
             JOptionPane.showMessageDialog(this,"PLEASE ENTER THE AMOUNT !");}
             }
         }
            stmt.close();
            stmt = conn.prepareStatement("INSERT INTO transactions (card_number, amount, type) VALUES (? ,? ,?)");
            stmt.setString(1, MyAccnum);
            stmt.setDouble(2, Double.parseDouble(fastcash1000.getText()));
            stmt.setString(3, "Debited");
            stmt.executeUpdate();
        }catch(Exception e){
            JOptionPane.showMessageDialog(this,e);
        }
        finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    // Ignore
                }
            }
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException e) {
                    // Ignore
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    // Ignore
                }
            }
        }
    }
    private void fastcash1001MouseClicked(java.awt.event.MouseEvent evt) {
        new MAINMENU(MyAccnum).setVisible(true);
        this.setVisible(false);
    }
    private void fastcash1001ActionPerformed(java.awt.event.ActionEvent evt) {
    }
    private void fastcash1000KeyPressed(java.awt.event.KeyEvent evt) {
    }
    private void fastcash100ActionPerformed(java.awt.event.ActionEvent evt) {
    }
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FASTCASH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FASTCASH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FASTCASH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FASTCASH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FASTCASH().setVisible(true);
            }
        });
    }

    private javax.swing.JButton fastcash100;
    private javax.swing.JButton fastcash1000;
    private javax.swing.JButton fastcash1001;
    private javax.swing.JButton fastcash500;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
}
