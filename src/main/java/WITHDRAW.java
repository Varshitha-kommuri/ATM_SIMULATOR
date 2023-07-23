package com.mycompany.atm;

import java.awt.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.*;


public class WITHDRAW extends javax.swing.JFrame {
    public WITHDRAW() {
        initComponents();
    }
    String MyAccnum;
    public WITHDRAW(String Accnum) {
        initComponents();
        MyAccnum=Accnum;
        withdrawaccnum.setText(MyAccnum);
    }
    @SuppressWarnings("unchecked")
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        withdrawaccnum = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        withdrawamount = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(100, 100, 100));

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        jLabel1.setText("                     WELCOME  TO  THE  ATM");

        withdrawaccnum.setFont(new Font("Arial Rounded MT Bold", 1, 14));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(149, 149, 149)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(162, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
        );

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        jLabel2.setText("    ACCOUNT NUMBER   :");

        withdrawaccnum.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        jLabel3.setText("     ENTER   AMOUNT  :");

        withdrawamount.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jButton1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        jButton1.setText("BACK");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        jButton2.setText("WITHDRAW");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(174, 174, 174)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(withdrawaccnum)
                            .addComponent(withdrawamount))
                        .addGap(28, 28, 28))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(withdrawaccnum, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 117, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(withdrawamount, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
        );

        pack();
    }

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {
       new MAINMENU(MyAccnum).setVisible(true);
       this.setVisible(false);
    }
    Connection conn=null;
    PreparedStatement stmt = null;
    ResultSet rs = null;
    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {
        String depositAmountText = withdrawamount.getText();
        double depositAmount;
        try {
            depositAmount = Double.parseDouble(depositAmountText);
            if (depositAmount%100==0) {
                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/atm2?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "Abd41492080@");
                stmt = conn.prepareStatement("SELECT balance FROM accounts WHERE card_number ='" + MyAccnum + "'");
                rs = stmt.executeQuery();
                if (rs.next()) {
                    double oldbalance = rs.getDouble("balance");
                    if (Double.parseDouble(withdrawamount.getText()) > oldbalance) {
                        JOptionPane.showMessageDialog(this, "INSUFFICIENT BALANCE!");
                    } else {
                        double newbalance = oldbalance - Double.parseDouble(withdrawamount.getText());
                        stmt = conn.prepareStatement("UPDATE accounts SET balance = ? WHERE card_number = ?");
                        stmt.setDouble(1, newbalance);
                        stmt.setString(2, MyAccnum);
                        if (stmt.executeUpdate() == 1) {
                            JOptionPane.showMessageDialog(this, "AMOUNT WITHDRAWN SUCCESSFULLY");

                        } else {
                            JOptionPane.showMessageDialog(this, "PLEASE ENTER THE AMOUNT !");
                        }
                        stmt.close();
                        stmt = conn.prepareStatement("INSERT INTO transactions (card_number, amount, type) VALUES (? ,? ,?)");
                        stmt.setString(1, MyAccnum);
                        stmt.setDouble(2, Double.parseDouble(withdrawamount.getText()));
                        stmt.setString(3, "Debited");
                        stmt.executeUpdate();
                        withdrawamount.setText("");
                    }
                }
            }
                else {
                    JOptionPane.showMessageDialog(this, "INVALID DEPOSIT AMOUNT! Please enter valid amount");
                }
        }
        catch (NumberFormatException e){

        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this,e);
            JOptionPane.showMessageDialog(this,"PLEASE ENTER THE AMOUNT IN NUMBERS !");
        }
        }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
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
            java.util.logging.Logger.getLogger(WITHDRAW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WITHDRAW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WITHDRAW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WITHDRAW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WITHDRAW().setVisible(true);
            }
        });
    }

    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private JLabel withdrawaccnum;
    private javax.swing.JTextField withdrawamount;
}
