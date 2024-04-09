/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package loginsystem;

/**
 * Author: Rosie Chai
 * Program: Login and registration system
 * Date: April 1, 2024
 */
public class SystemFrame extends javax.swing.JFrame {
    RegistrationSystem system;
    /**
     * Creates new form SystemFrame
     */
    public SystemFrame(RegistrationSystem system) {
        initComponents();
        this.system = system;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgPanel = new javax.swing.JPanel();
        NavigationPanel = new javax.swing.JPanel();
        welcomeLabel = new javax.swing.JLabel();
        goLoginButton = new javax.swing.JButton();
        goRegisterButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        LoginPanel = new javax.swing.JPanel();
        loginButton = new javax.swing.JButton();
        passwordFieldL = new javax.swing.JTextField();
        usernameFieldL = new javax.swing.JTextField();
        loginLabel = new javax.swing.JLabel();
        usernameLabelL = new javax.swing.JLabel();
        passwordLabelL = new javax.swing.JLabel();
        loginMessage = new javax.swing.JLabel();
        loginBackButton = new javax.swing.JButton();
        RegisterPanel = new javax.swing.JPanel();
        passwordFieldR = new javax.swing.JTextField();
        lastNameField = new javax.swing.JTextField();
        registerTitle = new javax.swing.JLabel();
        usernameFieldR = new javax.swing.JTextField();
        lastNameLabel = new javax.swing.JLabel();
        firstNameField = new javax.swing.JTextField();
        passwordLabelR = new javax.swing.JLabel();
        firstNameLabel = new javax.swing.JLabel();
        registerMessage = new javax.swing.JLabel();
        usernameLabelR = new javax.swing.JLabel();
        emailField = new javax.swing.JTextField();
        emailLabel = new javax.swing.JLabel();
        registerButton = new javax.swing.JButton();
        registerBackButton = new javax.swing.JButton();
        pwCriteriaLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bgPanel.setLayout(new java.awt.CardLayout());

        welcomeLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        welcomeLabel.setText("WELCOME!");

        goLoginButton.setText("Login");
        goLoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goLoginButtonActionPerformed(evt);
            }
        });

        goRegisterButton.setText("Register");
        goRegisterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goRegisterButtonActionPerformed(evt);
            }
        });

        jLabel2.setText("Please select a button.");

        javax.swing.GroupLayout NavigationPanelLayout = new javax.swing.GroupLayout(NavigationPanel);
        NavigationPanel.setLayout(NavigationPanelLayout);
        NavigationPanelLayout.setHorizontalGroup(
            NavigationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NavigationPanelLayout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addGroup(NavigationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(welcomeLabel)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(NavigationPanelLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(NavigationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(goRegisterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(goLoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(143, Short.MAX_VALUE))
        );
        NavigationPanelLayout.setVerticalGroup(
            NavigationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NavigationPanelLayout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addComponent(welcomeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(goLoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(goRegisterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69))
        );

        bgPanel.add(NavigationPanel, "card2");

        loginButton.setText("Login");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        passwordFieldL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordFieldLActionPerformed(evt);
            }
        });

        usernameFieldL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameFieldLActionPerformed(evt);
            }
        });

        loginLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        loginLabel.setText("Login!");

        usernameLabelL.setText("Username");

        passwordLabelL.setText("Password");

        loginMessage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loginMessage.setText("                                                         ");
        loginMessage.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        loginBackButton.setText("<");
        loginBackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBackButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout LoginPanelLayout = new javax.swing.GroupLayout(LoginPanel);
        LoginPanel.setLayout(LoginPanelLayout);
        LoginPanelLayout.setHorizontalGroup(
            LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LoginPanelLayout.createSequentialGroup()
                        .addComponent(loginBackButton)
                        .addGap(139, 139, 139)
                        .addComponent(loginLabel)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LoginPanelLayout.createSequentialGroup()
                        .addGap(0, 107, Short.MAX_VALUE)
                        .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LoginPanelLayout.createSequentialGroup()
                                .addComponent(loginButton)
                                .addGap(156, 156, 156))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LoginPanelLayout.createSequentialGroup()
                                .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(usernameLabelL, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(passwordLabelL, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(usernameFieldL)
                                    .addComponent(passwordFieldL)
                                    .addComponent(loginMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(93, 93, 93))))))
        );
        LoginPanelLayout.setVerticalGroup(
            LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LoginPanelLayout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addComponent(loginBackButton)
                .addGap(264, 264, 264))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LoginPanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(loginLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(usernameLabelL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usernameFieldL, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(passwordLabelL)
                .addGap(1, 1, 1)
                .addComponent(passwordFieldL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(loginMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(loginButton)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        bgPanel.add(LoginPanel, "card3");

        lastNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastNameFieldActionPerformed(evt);
            }
        });

        registerTitle.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        registerTitle.setText("Register!");

        lastNameLabel.setText("Last Name");

        firstNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstNameFieldActionPerformed(evt);
            }
        });

        passwordLabelR.setText("Password");

        firstNameLabel.setText("First Name");

        registerMessage.setText(" ");
        registerMessage.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        usernameLabelR.setText("Username");

        emailLabel.setText("Email Address");

        registerButton.setText("Register");
        registerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerButtonActionPerformed(evt);
            }
        });

        registerBackButton.setText("<");
        registerBackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerBackButtonActionPerformed(evt);
            }
        });

        pwCriteriaLabel.setText("                                              ");

        javax.swing.GroupLayout RegisterPanelLayout = new javax.swing.GroupLayout(RegisterPanel);
        RegisterPanel.setLayout(RegisterPanelLayout);
        RegisterPanelLayout.setHorizontalGroup(
            RegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegisterPanelLayout.createSequentialGroup()
                .addGroup(RegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RegisterPanelLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(RegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(RegisterPanelLayout.createSequentialGroup()
                                .addGroup(RegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RegisterPanelLayout.createSequentialGroup()
                                        .addGroup(RegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(firstNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(firstNameField)
                                            .addComponent(usernameFieldR, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(usernameLabelR, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18))
                                    .addGroup(RegisterPanelLayout.createSequentialGroup()
                                        .addComponent(emailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(80, 80, 80)))
                                .addGroup(RegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lastNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lastNameField, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                                    .addComponent(passwordFieldR)
                                    .addComponent(passwordLabelR, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pwCriteriaLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(registerMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(RegisterPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(registerBackButton)
                        .addGap(118, 118, 118)
                        .addComponent(registerTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(RegisterPanelLayout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addComponent(registerButton)))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        RegisterPanelLayout.setVerticalGroup(
            RegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RegisterPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(RegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(registerTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(registerBackButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(RegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, RegisterPanelLayout.createSequentialGroup()
                        .addComponent(lastNameLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(RegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lastNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(firstNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(passwordLabelR)
                        .addGap(1, 1, 1)
                        .addComponent(passwordFieldR))
                    .addGroup(RegisterPanelLayout.createSequentialGroup()
                        .addComponent(firstNameLabel)
                        .addGap(46, 46, 46)
                        .addComponent(usernameLabelR)
                        .addGap(1, 1, 1)
                        .addComponent(usernameFieldR, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(RegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(emailLabel)
                    .addComponent(pwCriteriaLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(registerMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(registerButton)
                .addGap(16, 16, 16))
        );

        bgPanel.add(RegisterPanel, "card4");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 405, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addComponent(bgPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 313, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(bgPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        // TODO add your handling code here:

        //get username and password entered and login
        boolean canLogin = system.login(usernameFieldL.getText(), passwordFieldL.getText());
        
        if (canLogin){
            loginMessage.setText("Logged In!");
        } else{
            loginMessage.setText("Incorrect username and password.");
        }
    }//GEN-LAST:event_loginButtonActionPerformed

    private void usernameFieldLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameFieldLActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameFieldLActionPerformed

    private void goLoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goLoginButtonActionPerformed
        NavigationPanel.setVisible(false);
        LoginPanel.setVisible(true);
        usernameFieldL.setText("");
        passwordFieldL.setText("");
        loginMessage.setText("");        
    }//GEN-LAST:event_goLoginButtonActionPerformed

    private void goRegisterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goRegisterButtonActionPerformed
        NavigationPanel.setVisible(false);
        RegisterPanel.setVisible(true);
        firstNameField.setText("");
        lastNameField.setText("");
        usernameFieldR.setText("");
        passwordFieldR.setText("");
        emailField.setText("");
        registerMessage.setText("");    
    }//GEN-LAST:event_goRegisterButtonActionPerformed

    private void loginBackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBackButtonActionPerformed
        LoginPanel.setVisible(false);
        NavigationPanel.setVisible(true);
    }//GEN-LAST:event_loginBackButtonActionPerformed

    private void registerBackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerBackButtonActionPerformed
        RegisterPanel.setVisible(false);
        NavigationPanel.setVisible(true);
    }//GEN-LAST:event_registerBackButtonActionPerformed

    private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerButtonActionPerformed
        // TODO add your handling code here:

        int result = system.register(firstNameField.getText(), lastNameField.getText(), emailField.getText(), usernameFieldR.getText(), passwordFieldR.getText());

        if (result == 0){
            registerMessage.setText("Account created.");
        } else if (result == -1){
            registerMessage.setText("Username is invalid/taken."); //invalid b/c it might have a delimeter
        } else if (result == -2){
            registerMessage.setText("Weak password.");
        }
    }//GEN-LAST:event_registerButtonActionPerformed

    private void firstNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstNameFieldActionPerformed

    private void lastNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastNameFieldActionPerformed

    private void passwordFieldLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordFieldLActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordFieldLActionPerformed

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
            java.util.logging.Logger.getLogger(SystemFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SystemFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SystemFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SystemFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                RegistrationSystem system = new RegistrationSystem();
                new SystemFrame(system).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel LoginPanel;
    private javax.swing.JPanel NavigationPanel;
    private javax.swing.JPanel RegisterPanel;
    private javax.swing.JPanel bgPanel;
    private javax.swing.JTextField emailField;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField firstNameField;
    private javax.swing.JLabel firstNameLabel;
    private javax.swing.JButton goLoginButton;
    private javax.swing.JButton goRegisterButton;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField lastNameField;
    private javax.swing.JLabel lastNameLabel;
    private javax.swing.JButton loginBackButton;
    private javax.swing.JButton loginButton;
    private javax.swing.JLabel loginLabel;
    private javax.swing.JLabel loginMessage;
    private javax.swing.JTextField passwordFieldL;
    private javax.swing.JTextField passwordFieldR;
    private javax.swing.JLabel passwordLabelL;
    private javax.swing.JLabel passwordLabelR;
    private javax.swing.JLabel pwCriteriaLabel;
    private javax.swing.JButton registerBackButton;
    private javax.swing.JButton registerButton;
    private javax.swing.JLabel registerMessage;
    private javax.swing.JLabel registerTitle;
    private javax.swing.JTextField usernameFieldL;
    private javax.swing.JTextField usernameFieldR;
    private javax.swing.JLabel usernameLabelL;
    private javax.swing.JLabel usernameLabelR;
    private javax.swing.JLabel welcomeLabel;
    // End of variables declaration//GEN-END:variables
}
