/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

import java.awt.Image;
import javax.swing.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author HP
 */
public class SignupForm extends javax.swing.JFrame {

    /**
     * Creates new form LoginForm
     */
    String imagePth = null;

    public SignupForm() {
        initComponents();
    }
    //function to verifyData of Form 

    public boolean verifData() {
        //if any of the values are empty 
        if (fname.getText().equals("") && lname.getText().equals("") || username.getText().equals("")
                || String.valueOf(pass1.getPassword()).equals("")) {
            JOptionPane.showMessageDialog(null, "One or More field is empty");
            return false;
        } else if (!String.valueOf(pass1.getPassword()).equals(String.valueOf(pass2.getPassword()))) {
            JOptionPane.showMessageDialog(null, "Password and Confirm Password did not match");
            return false;
        } else if (imagePth == null) {
            JOptionPane.showMessageDialog(null, "Image is not selected");
            return false;
        } else {
            return true;
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        pass2 = new javax.swing.JPasswordField();
        loginbtn = new javax.swing.JButton();
        cancelbtn = new javax.swing.JButton();
        loginact = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        fname = new javax.swing.JTextField();
        lname = new javax.swing.JTextField();
        username = new javax.swing.JTextField();
        pass1 = new javax.swing.JPasswordField();
        pictureupload = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        minimize = new javax.swing.JLabel();
        close = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LOGIN Form");
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.blue, java.awt.Color.blue, java.awt.Color.darkGray));
        jPanel2.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        jLabel2.setText("Password :");
        jLabel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.white, null, null));
        jPanel2.add(jLabel2);
        jLabel2.setBounds(10, 190, 180, 50);

        jLabel3.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        jLabel3.setText("Profile Picture :");
        jLabel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.white, null, null));
        jPanel2.add(jLabel3);
        jLabel3.setBounds(10, 310, 200, 50);

        pass2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pass2ActionPerformed(evt);
            }
        });
        jPanel2.add(pass2);
        pass2.setBounds(290, 240, 180, 40);

        loginbtn.setBackground(new java.awt.Color(51, 102, 255));
        loginbtn.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        loginbtn.setForeground(new java.awt.Color(255, 255, 255));
        loginbtn.setText("CREATE");
        loginbtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.blue, java.awt.Color.white, null, java.awt.Color.lightGray));
        loginbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginbtnActionPerformed(evt);
            }
        });
        jPanel2.add(loginbtn);
        loginbtn.setBounds(260, 510, 150, 50);

        cancelbtn.setBackground(new java.awt.Color(229, 33, 33));
        cancelbtn.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        cancelbtn.setForeground(new java.awt.Color(255, 255, 255));
        cancelbtn.setText("CANCEL");
        cancelbtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.blue, java.awt.Color.white, null, java.awt.Color.lightGray));
        cancelbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cancelbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelbtnActionPerformed(evt);
            }
        });
        jPanel2.add(cancelbtn);
        cancelbtn.setBounds(80, 510, 150, 50);

        loginact.setBackground(new java.awt.Color(255, 102, 102));
        loginact.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        loginact.setText("Already have an account ? Login here.");
        loginact.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        loginact.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginact.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginactMouseClicked(evt);
            }
        });
        jPanel2.add(loginact);
        loginact.setBounds(110, 580, 280, 30);

        jLabel5.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        jLabel5.setText("Last Name");
        jLabel5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.white, null, null));
        jPanel2.add(jLabel5);
        jLabel5.setBounds(10, 70, 180, 50);

        jLabel6.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        jLabel6.setText("Confirm Password:");
        jLabel6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.white, null, null));
        jPanel2.add(jLabel6);
        jLabel6.setBounds(10, 250, 250, 50);

        jLabel7.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        jLabel7.setText("Username");
        jLabel7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.white, null, null));
        jPanel2.add(jLabel7);
        jLabel7.setBounds(10, 130, 180, 50);

        jLabel8.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        jLabel8.setText("First Name");
        jLabel8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.white, null, null));
        jPanel2.add(jLabel8);
        jLabel8.setBounds(10, 10, 180, 50);
        jPanel2.add(fname);
        fname.setBounds(290, 20, 180, 40);
        jPanel2.add(lname);
        lname.setBounds(290, 70, 180, 40);
        jPanel2.add(username);
        username.setBounds(290, 120, 180, 40);

        pass1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pass1ActionPerformed(evt);
            }
        });
        jPanel2.add(pass1);
        pass1.setBounds(290, 180, 180, 40);

        pictureupload.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.add(pictureupload);
        pictureupload.setBounds(280, 330, 200, 160);

        jButton1.setText("BROWSE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(320, 300, 90, 30);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 40, 520, 630));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        minimize.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        minimize.setForeground(new java.awt.Color(255, 255, 255));
        minimize.setText("-");
        minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizeMouseClicked(evt);
            }
        });
        jPanel1.add(minimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, -10, 20, 50));

        close.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        close.setForeground(new java.awt.Color(255, 255, 255));
        close.setText("X");
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
        });
        jPanel1.add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 0, 40, 30));

        jLabel4.setFont(new java.awt.Font("Segoe Script", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("CREATE AN ACCOUNT");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 330, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1150, 40));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WhatsApp Image 2022-06-24 at 10.10.38 PM.jpeg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1140, 680));

        setSize(new java.awt.Dimension(1137, 682));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseClicked
        // TODO add your handling code here:
        this.setState(SignupForm.ICONIFIED);


    }//GEN-LAST:event_minimizeMouseClicked
    public ImageIcon resizePic(String picpath) {

        ImageIcon myimg = new ImageIcon(picpath);
        Image img = myimg.getImage().getScaledInstance(pictureupload.getWidth(), pictureupload.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon mypicture = new ImageIcon(img);
        return mypicture;
    }
    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        System.exit(0);
    }//GEN-LAST:event_closeMouseClicked

    private void pass2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pass2ActionPerformed

    }//GEN-LAST:event_pass2ActionPerformed

    private void loginactMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginactMouseClicked
        LoginForm loginf = new LoginForm();
        loginf.setVisible(true);
        loginf.pack();
        loginf.setLocationRelativeTo(null);
        loginf.setDefaultCloseOperation(LoginForm.EXIT_ON_CLOSE);
        this.dispose();

    }//GEN-LAST:event_loginactMouseClicked

    private void pass1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pass1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pass1ActionPerformed

    private void loginbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginbtnActionPerformed

        if (verifData()) {
            Connection con = myConnection.getConnection();
            PreparedStatement ps;
            try {
                ps = con.prepareStatement("INSERT INTO `user`(`fname`, `lname`, `username`, `pass`, `pic`) VALUES(?,?,?,?,?)");
                ps.setString(1, fname.getText());
                ps.setString(2, lname.getText());
                ps.setString(3, username.getText());
                ps.setString(4, String.valueOf(pass1.getPassword()));
                InputStream img = new FileInputStream(new File(imagePth));
                ps.setBlob(5, img);
                if (ps.executeUpdate() != 0) {
                    JOptionPane.showMessageDialog(null, "Account Created");
                } else {
                    JOptionPane.showMessageDialog(null, "Something went wrong");
                }
            } catch (SQLException | FileNotFoundException ex) {
                Logger.getLogger(SignupForm.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Some problem in account creation");
        }

    }//GEN-LAST:event_loginbtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        JFileChooser filec = new JFileChooser();
        filec.setCurrentDirectory(new File(System.getProperty("user.home")));
        FileNameExtensionFilter filefilter = new FileNameExtensionFilter("*.Images", "jpg", "png", "gif");
        filec.addChoosableFileFilter(filefilter);
        int fileState = filec.showSaveDialog(null);
        //if the user select a file
        if (fileState == JFileChooser.APPROVE_OPTION) {
            File selectedFile = filec.getSelectedFile();
            String path = selectedFile.getAbsolutePath();
            imagePth = path;
            //display the image in label using resize image function

            pictureupload.setIcon(resizePic(path));

        } //if the user press cancel button
        else if (fileState == JFileChooser.CANCEL_OPTION) {
            System.out.println("No Image selected");
        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void cancelbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelbtnActionPerformed
        System.exit(0);
    }//GEN-LAST:event_cancelbtnActionPerformed

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
            java.util.logging.Logger.getLogger(SignupForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignupForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignupForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignupForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SignupForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelbtn;
    private javax.swing.JLabel close;
    private javax.swing.JTextField fname;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField lname;
    private javax.swing.JLabel loginact;
    private javax.swing.JButton loginbtn;
    private javax.swing.JLabel minimize;
    private javax.swing.JPasswordField pass1;
    private javax.swing.JPasswordField pass2;
    private javax.swing.JLabel pictureupload;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}