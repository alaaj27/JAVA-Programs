/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nutritionsystem;

import javax.swing.JOptionPane;

/**
 *
 * @author Alaa Jararwah
 */
public class GetStartedFrame extends javax.swing.JFrame {

    SignUpFrame SignUp_Page;
    LogInFrame LogIn_Page;
    public Users [] ListOfUser = new  Users[100];
    public  int UserRegistered = 0;
    public GetStartedFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButtonSignUp = new javax.swing.JButton();
        jButtonLogIn = new javax.swing.JButton();
        jButtonPublicUser = new javax.swing.JButton();
        jButtonAboutUs = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Get Started");
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(0, 0, 0));
        setForeground(new java.awt.Color(0, 0, 0));

        jLabel1.setBackground(new java.awt.Color(0, 51, 204));
        jLabel1.setFont(new java.awt.Font("Vijaya", 1, 18)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login-page.png"))); // NOI18N
        jLabel1.setText("Get started for FREE");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/health-system-services-vertical-logo.png"))); // NOI18N

        jButtonSignUp.setBackground(new java.awt.Color(102, 102, 102));
        jButtonSignUp.setFont(new java.awt.Font("Viner Hand ITC", 1, 11)); // NOI18N
        jButtonSignUp.setForeground(new java.awt.Color(0, 51, 153));
        jButtonSignUp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sign-Add-icon.png"))); // NOI18N
        jButtonSignUp.setText("Sign UP");
        jButtonSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSignUpActionPerformed(evt);
            }
        });

        jButtonLogIn.setBackground(new java.awt.Color(102, 102, 102));
        jButtonLogIn.setFont(new java.awt.Font("Viner Hand ITC", 1, 11)); // NOI18N
        jButtonLogIn.setForeground(new java.awt.Color(0, 51, 153));
        jButtonLogIn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Login-icon.png"))); // NOI18N
        jButtonLogIn.setText("Log IN");
        jButtonLogIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLogInActionPerformed(evt);
            }
        });

        jButtonPublicUser.setBackground(new java.awt.Color(102, 102, 102));
        jButtonPublicUser.setFont(new java.awt.Font("Viner Hand ITC", 1, 11)); // NOI18N
        jButtonPublicUser.setForeground(new java.awt.Color(0, 51, 153));
        jButtonPublicUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Public-icon.png"))); // NOI18N
        jButtonPublicUser.setText("Public User");
        jButtonPublicUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPublicUserActionPerformed(evt);
            }
        });

        jButtonAboutUs.setBackground(new java.awt.Color(102, 102, 102));
        jButtonAboutUs.setFont(new java.awt.Font("Viner Hand ITC", 1, 11)); // NOI18N
        jButtonAboutUs.setForeground(new java.awt.Color(0, 51, 153));
        jButtonAboutUs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Actions-help-about-icon.png"))); // NOI18N
        jButtonAboutUs.setText("About Us");
        jButtonAboutUs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAboutUsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 695, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(211, 211, 211)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jButtonSignUp)
                .addGap(48, 48, 48)
                .addComponent(jButtonLogIn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonPublicUser)
                .addGap(56, 56, 56)
                .addComponent(jButtonAboutUs, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(203, 203, 203)
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSignUp)
                    .addComponent(jButtonPublicUser)
                    .addComponent(jButtonAboutUs, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonLogIn))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSignUpActionPerformed
       SignUp_Page = new SignUpFrame(this);
       SignUp_Page.show();
       this.setVisible(false);
        
    }//GEN-LAST:event_jButtonSignUpActionPerformed

    private void jButtonLogInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLogInActionPerformed
      LogIn_Page = new LogInFrame(this);
      LogIn_Page.show();
      this.setVisible(false);
        
    }//GEN-LAST:event_jButtonLogInActionPerformed

    private void jButtonPublicUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPublicUserActionPerformed
        //public object
        Users Public = new Users("Public","Public","Public" , this);
        
        this.setVisible(false);
        
    }//GEN-LAST:event_jButtonPublicUserActionPerformed

    private void jButtonAboutUsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAboutUsActionPerformed
        
        JOptionPane.showMessageDialog(null, "Hello there , We are group of volunteer ,we have bulid this tool to help people out. \n\n"
                + "In general, this tool aims at increasing awareness in the health domain\n"
                + ", targeting the citizens, residents and visitors as well as the business\n"
                + " sector, meanwhile focusing on both specialists and non-specialists. \n" 
                +"\n\nMission: Providing accurate information to the Portal’s public visitors as\n"
                + "well as raising the health awareness in general, meanwhile trying to highlight\n"
                + " the best health practices and seeking to improve the Kingdom’s health sector.\n"
                +"\n\nDevelopers: Alaa Jararwah , Anoud Magableh , Dena Yasser"
                + "\nVersion : 0.1");
    }//GEN-LAST:event_jButtonAboutUsActionPerformed

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
            java.util.logging.Logger.getLogger(GetStartedFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GetStartedFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GetStartedFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GetStartedFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GetStartedFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAboutUs;
    private javax.swing.JButton jButtonLogIn;
    private javax.swing.JButton jButtonPublicUser;
    private javax.swing.JButton jButtonSignUp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
