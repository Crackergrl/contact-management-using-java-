
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class LoginForm extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public LoginForm() {
        initComponents();
        //center form
        this.setLocationRelativeTo(null);
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
        jCheckBoxShowPass = new javax.swing.JCheckBox();
        jTextFieldUsername = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButtonLogin1 = new javax.swing.JButton();
        jButtonCancel = new javax.swing.JButton();
        jLabelCreateAccount = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabelMin = new javax.swing.JLabel();
        jLabelClose = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LOGIN Form");
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.blue, java.awt.Color.blue, java.awt.Color.darkGray));
        jPanel2.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        jLabel2.setText("PASSWORD :");
        jLabel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.white, null, null));
        jPanel2.add(jLabel2);
        jLabel2.setBounds(20, 180, 180, 50);

        jLabel3.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        jLabel3.setText("USERNAME :");
        jLabel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.white, null, null));
        jPanel2.add(jLabel3);
        jLabel3.setBounds(20, 80, 180, 50);

        jCheckBoxShowPass.setText("Show Password");
        jCheckBoxShowPass.setName("showpass"); // NOI18N
        jCheckBoxShowPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxShowPassActionPerformed(evt);
            }
        });
        jPanel2.add(jCheckBoxShowPass);
        jCheckBoxShowPass.setBounds(260, 240, 130, 20);
        jPanel2.add(jTextFieldUsername);
        jTextFieldUsername.setBounds(230, 80, 180, 50);

        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });
        jPanel2.add(jPasswordField1);
        jPasswordField1.setBounds(230, 180, 180, 50);

        jButtonLogin1.setBackground(new java.awt.Color(51, 102, 255));
        jButtonLogin1.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        jButtonLogin1.setForeground(new java.awt.Color(255, 255, 255));
        jButtonLogin1.setText("LOGIN");
        jButtonLogin1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.blue, java.awt.Color.white, null, java.awt.Color.lightGray));
        jButtonLogin1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonLogin1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLogin1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonLogin1);
        jButtonLogin1.setBounds(230, 310, 150, 50);

        jButtonCancel.setBackground(new java.awt.Color(229, 33, 33));
        jButtonCancel.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        jButtonCancel.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCancel.setText("CANCEL");
        jButtonCancel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.blue, java.awt.Color.white, null, java.awt.Color.lightGray));
        jButtonCancel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(jButtonCancel);
        jButtonCancel.setBounds(40, 310, 150, 50);

        jLabelCreateAccount.setBackground(new java.awt.Color(255, 102, 102));
        jLabelCreateAccount.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelCreateAccount.setText("New user ? Create an account here.");
        jLabelCreateAccount.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jLabelCreateAccount.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelCreateAccount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCreateAccountMouseClicked(evt);
            }
        });
        jPanel2.add(jLabelCreateAccount);
        jLabelCreateAccount.setBounds(80, 420, 260, 30);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, 420, 510));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelMin.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabelMin.setForeground(new java.awt.Color(255, 255, 255));
        jLabelMin.setText("-");
        jLabelMin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelMin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMinMouseClicked(evt);
            }
        });
        jPanel1.add(jLabelMin, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, -10, 30, 50));

        jLabelClose.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelClose.setForeground(new java.awt.Color(255, 255, 255));
        jLabelClose.setText("X");
        jLabelClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCloseMouseClicked(evt);
            }
        });
        jPanel1.add(jLabelClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 0, 30, 30));

        jLabel4.setFont(new java.awt.Font("Segoe Script", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("LOGIN FORM");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 290, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1150, 40));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WhatsApp Image 2022-06-24 at 10.10.38 PM.jpeg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1150, 670));

        setSize(new java.awt.Dimension(1149, 675));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelMinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabelMinMouseClicked

    private void jLabelCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCloseMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabelCloseMouseClicked

    private void jCheckBoxShowPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxShowPassActionPerformed
        if (jCheckBoxShowPass.isSelected()) {
            jPasswordField1.setEchoChar((char) 0);
        } else {
            jPasswordField1.setEchoChar('*');
        }
    }//GEN-LAST:event_jCheckBoxShowPassActionPerformed

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1ActionPerformed

    private void jLabelCreateAccountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCreateAccountMouseClicked
        SignupForm supf = new SignupForm();
        supf.setVisible(true);
        supf.pack();
        supf.setLocationRelativeTo(null);
        supf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jLabelCreateAccountMouseClicked

    private void jButtonLogin1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLogin1ActionPerformed

        Connection con = myConnection.getConnection();
        PreparedStatement ps;
        ResultSet rs;
        try {
//            ps = con.prepareStatement("SELECT * FROM `contacts` WHERE `username`=? AND `password`=?");
            ps = con.prepareStatement("SELECT `username`,`pass`,`pic` FROM `user` WHERE `username`=? AND `pass`=?");
            ps.setString(1, jTextFieldUsername.getText());
            ps.setString(2, String.valueOf(jPasswordField1.getPassword()));
            rs = ps.executeQuery();
            if (rs.next()) {
//                JOptionPane.showMessageDialog(null, "Logged in Successfully");
                MyContactsForm mcf = new MyContactsForm();
                mcf.setVisible(true);
                mcf.pack();
                mcf.setLocationRelativeTo(null);
                mcf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                //show the user profile picture in top form
                mcf.jLabelUserPic.setIcon(new Myfunc().resizePic(null, rs.getBytes(3), mcf.jLabelUserPic.getWidth(), mcf.jLabelUserPic.getHeight()));

                mcf.jLabelUsername.setText(rs.getString(1));

                this.dispose();

            } else {
                JOptionPane.showMessageDialog(null, "Please check the credentials and try again!");
            }
        } catch (SQLException ex) {
            Logger.getLogger(SignupForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonLogin1ActionPerformed

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
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonLogin1;
    private javax.swing.JCheckBox jCheckBoxShowPass;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelClose;
    private javax.swing.JLabel jLabelCreateAccount;
    private javax.swing.JLabel jLabelMin;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextFieldUsername;
    // End of variables declaration//GEN-END:variables
}
