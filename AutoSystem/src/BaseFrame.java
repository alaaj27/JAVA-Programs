import autosystem.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class BaseFrame extends javax.swing.JFrame {

    ShowUsers Shwusers= new ShowUsers(this);;
    Setting set= new Setting(this);
    system Exam ;
    
    public BaseFrame() {
        
        initComponents();
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextFieldSYSUserName = new javax.swing.JTextField();
        jTextFieldSYSConfirmPassword = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButtonAddUser = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldSYSPassword = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextFieldPassword = new javax.swing.JTextField();
        jTextFieldConfirmPassword = new javax.swing.JTextField();
        jButtonCreateSystem = new javax.swing.JButton();
        jButtonCloseFrame1 = new javax.swing.JButton();
        jButtonShowUser = new javax.swing.JButton();
        jButtonShowUser1 = new javax.swing.JButton();
        jTextFieldUserName = new javax.swing.JTextField();
        jTextFieldMaxUser = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();

        setTitle("Auto System");
        setBackground(new java.awt.Color(51, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(new java.awt.Color(51, 255, 255));

        jTextFieldSYSUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldSYSUserNameActionPerformed(evt);
            }
        });

        jTextFieldSYSConfirmPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldSYSConfirmPasswordActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Viner Hand ITC", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 102, 255));
        jLabel1.setText("Welcome To Auto System");

        jButtonAddUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Button-Add-icon.png"))); // NOI18N
        jButtonAddUser.setEnabled(false);
        jButtonAddUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonAddUserMouseClicked(evt);
            }
        });
        jButtonAddUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddUserActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/SystemIcon.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Perpetua Titling MT", 1, 10)); // NOI18N
        jLabel3.setText("User Name Of system :");

        jLabel4.setFont(new java.awt.Font("Perpetua Titling MT", 1, 10)); // NOI18N
        jLabel4.setText("Password :");

        jLabel5.setFont(new java.awt.Font("Perpetua Titling MT", 1, 10)); // NOI18N
        jLabel5.setText("Confirm Password :");

        jTextFieldSYSPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldSYSPasswordActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Gungsuh", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 0, 51));
        jLabel6.setText("System intilization :");

        jLabel8.setFont(new java.awt.Font("Gungsuh", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 0, 51));
        jLabel8.setText("Sign In To the System :");

        jLabel7.setFont(new java.awt.Font("Perpetua Titling MT", 1, 10)); // NOI18N
        jLabel7.setText("Confirm Password :");

        jLabel9.setFont(new java.awt.Font("Perpetua Titling MT", 1, 10)); // NOI18N
        jLabel9.setText("User Name :");

        jLabel10.setFont(new java.awt.Font("Perpetua Titling MT", 1, 10)); // NOI18N
        jLabel10.setText("Password :");

        jTextFieldConfirmPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldConfirmPasswordActionPerformed(evt);
            }
        });

        jButtonCreateSystem.setFont(new java.awt.Font("Tunga", 1, 11)); // NOI18N
        jButtonCreateSystem.setForeground(new java.awt.Color(0, 102, 0));
        jButtonCreateSystem.setText("Create System");
        jButtonCreateSystem.setEnabled(false);
        jButtonCreateSystem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCreateSystemActionPerformed(evt);
            }
        });

        jButtonCloseFrame1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/exit-icon.png"))); // NOI18N
        jButtonCloseFrame1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCloseFrame1ActionPerformed(evt);
            }
        });

        jButtonShowUser.setFont(new java.awt.Font("Lucida Calligraphy", 1, 10)); // NOI18N
        jButtonShowUser.setForeground(new java.awt.Color(0, 0, 102));
        jButtonShowUser.setText("Log In");
        jButtonShowUser.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                jButtonShowUserMouseWheelMoved(evt);
            }
        });
        jButtonShowUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButtonShowUserMousePressed(evt);
            }
        });
        jButtonShowUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonShowUserActionPerformed(evt);
            }
        });

        jButtonShowUser1.setFont(new java.awt.Font("Lucida Calligraphy", 1, 10)); // NOI18N
        jButtonShowUser1.setForeground(new java.awt.Color(0, 0, 102));
        jButtonShowUser1.setText("Show Users");
        jButtonShowUser1.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                jButtonShowUser1MouseWheelMoved(evt);
            }
        });
        jButtonShowUser1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonShowUser1ActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Perpetua Titling MT", 1, 10)); // NOI18N
        jLabel11.setText("Max num of User :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jButtonShowUser1)))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonCloseFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(84, 84, 84)
                                .addComponent(jButtonShowUser, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldConfirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(81, 81, 81)
                                .addComponent(jButtonAddUser, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextFieldSYSConfirmPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                    .addComponent(jTextFieldSYSUserName)
                    .addComponent(jTextFieldSYSPassword)
                    .addComponent(jTextFieldMaxUser))
                .addGap(59, 59, 59)
                .addComponent(jButtonCreateSystem)
                .addGap(217, 217, 217))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(25, 25, 25)
                .addComponent(jLabel6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jButtonCreateSystem))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldSYSUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldMaxUser)))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldSYSPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldSYSConfirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldConfirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButtonCloseFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonShowUser1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonAddUser, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(jButtonShowUser, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(39, 39, 39))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAddUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddUserActionPerformed

         String userName = jTextFieldUserName.getText();
         String UserPassword="";
                   
         String pass1 =jTextFieldPassword.getText();
         String pass2 =jTextFieldConfirmPassword.getText();          
        
         if(pass1.equals(pass2)) 
             UserPassword = pass2;
         else{
             JOptionPane.showMessageDialog(null, "Enter two Similar correct password of "
                                            +userName +" Account!!");
             
             jTextFieldUserName.setText(null);
             jTextFieldPassword.setText( null); 
             jTextFieldConfirmPassword.setText(null);
             jButtonAddUser.setEnabled(false);
             return;
         }
        try {
            Exam.AddUsers(userName, UserPassword);
        }
        catch (IOException ex) {
            JOptionPane.showMessageDialog(rootPane, "Add user made eception");
            return;
        }
            
        jTextFieldUserName.setText(null);
        jTextFieldPassword.setText( null); 
        jTextFieldConfirmPassword.setText(null);
        jButtonAddUser.setEnabled(false);
         
    }//GEN-LAST:event_jButtonAddUserActionPerformed

    private void jButtonAddUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonAddUserMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonAddUserMouseClicked

    private void jButtonCloseFrame1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCloseFrame1ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButtonCloseFrame1ActionPerformed

    private void jButtonShowUserMouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_jButtonShowUserMouseWheelMoved
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jButtonShowUserMouseWheelMoved

    private void jButtonShowUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonShowUserActionPerformed

        set.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonShowUserActionPerformed

    private void jButtonShowUser1MouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_jButtonShowUser1MouseWheelMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonShowUser1MouseWheelMoved

    private void jButtonShowUser1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonShowUser1ActionPerformed
        
        this.setVisible(false);
        Shwusers.setVisible(true);
        try {
            Shwusers.jTextArea1.setText(this.Exam.PrintAllUsers());
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(rootPane, "Eception occurs , Try again !! ");
            return;
        }
    }//GEN-LAST:event_jButtonShowUser1ActionPerformed

    private void jButtonShowUserMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonShowUserMousePressed
     
    }//GEN-LAST:event_jButtonShowUserMousePressed

    private void jButtonCreateSystemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCreateSystemActionPerformed
       
            String SystemName = jTextFieldSYSUserName.getText();
            String pass="";
            int maxUser=0;
            try{
             
                maxUser= Integer.parseInt(jTextFieldMaxUser.getText());
            }
            catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(rootPane, "Enter Number , not String -.-!");
                return;
            }
            
             String pass1 =jTextFieldSYSPassword.getText();
             String pass2 =jTextFieldSYSConfirmPassword.getText();
              
              if(pass1.equals(pass2))
              { pass = pass2;}
              else
              {
                  JOptionPane.showMessageDialog(null, "Enter two Similar correct password !!");
                  return;
              }
        try {
            Exam = new system(SystemName , pass , maxUser);
        } catch (IOException ex) {
            
            JOptionPane.showMessageDialog(rootPane, "IO Exception Occurs !!");
            return;
        }
        
        
    }//GEN-LAST:event_jButtonCreateSystemActionPerformed

    private void jTextFieldSYSUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSYSUserNameActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jTextFieldSYSUserNameActionPerformed

    private void jTextFieldSYSPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSYSPasswordActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jTextFieldSYSPasswordActionPerformed

    private void jTextFieldSYSConfirmPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSYSConfirmPasswordActionPerformed
       if(jTextFieldSYSUserName.getText() != null &&
          jTextFieldMaxUser.getText() != null &&
          jTextFieldSYSPassword.getText() != null && 
          jTextFieldSYSConfirmPassword.getText() !=null)
           
           jButtonCreateSystem.setEnabled(true);
       
        
    }//GEN-LAST:event_jTextFieldSYSConfirmPasswordActionPerformed

    private void jTextFieldConfirmPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldConfirmPasswordActionPerformed
        
         if( jTextFieldUserName.getText() != null &&
             jTextFieldPassword.getText() != null && 
             jTextFieldConfirmPassword.getText() !=null)
           
           jButtonAddUser.setEnabled(true);
    }//GEN-LAST:event_jTextFieldConfirmPasswordActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BaseFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BaseFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BaseFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BaseFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new BaseFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAddUser;
    private javax.swing.JButton jButtonCloseFrame1;
    private javax.swing.JButton jButtonCreateSystem;
    private javax.swing.JButton jButtonShowUser;
    private javax.swing.JButton jButtonShowUser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextFieldConfirmPassword;
    private javax.swing.JTextField jTextFieldMaxUser;
    private javax.swing.JTextField jTextFieldPassword;
    private javax.swing.JTextField jTextFieldSYSConfirmPassword;
    private javax.swing.JTextField jTextFieldSYSPassword;
    private javax.swing.JTextField jTextFieldSYSUserName;
    private javax.swing.JTextField jTextFieldUserName;
    // End of variables declaration//GEN-END:variables
}
