package authentication;

import insertcontact.InsertContact;

import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import phonebook.LinkedList;

import validations.AuthenticationFunctions;

public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlLogin = new javax.swing.JPanel();
        lblUsername = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        lblPassword = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JToggleButton();
        chkShowPassword = new javax.swing.JCheckBox();
        lblPhoneBook = new javax.swing.JLabel();
        lblDoNotHaveAnAccount = new javax.swing.JLabel();
        lblSignUp = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setName("login"); // NOI18N

        pnlLogin.setBackground(new java.awt.Color(232, 248, 245));

        lblUsername.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblUsername.setForeground(new java.awt.Color(93, 58, 155));
        lblUsername.setText("Username");

        txtUsername.setBackground(new java.awt.Color(250, 250, 250));
        txtUsername.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtUsername.setForeground(new java.awt.Color(72, 217, 141));
        txtUsername.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(250, 250, 250), 3, true));

        lblPassword.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblPassword.setForeground(new java.awt.Color(93, 58, 155));
        lblPassword.setText("Password");

        txtPassword.setBackground(new java.awt.Color(250, 250, 250));
        txtPassword.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtPassword.setForeground(new java.awt.Color(72, 217, 141));
        txtPassword.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(250, 250, 250), 3));
        txtPassword.setEchoChar('*');
        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });

        btnLogin.setBackground(new java.awt.Color(255, 111, 97));
        btnLogin.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("Login");
        btnLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLoginMouseClicked(evt);
            }
        });
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        chkShowPassword.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        chkShowPassword.setForeground(new java.awt.Color(93, 58, 155));
        chkShowPassword.setText("Show password");
        chkShowPassword.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chkShowPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chkShowPasswordMouseClicked(evt);
            }
        });

        lblPhoneBook.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblPhoneBook.setForeground(new java.awt.Color(93, 58, 155));
        lblPhoneBook.setText("PhoneBook");

        lblDoNotHaveAnAccount.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblDoNotHaveAnAccount.setForeground(new java.awt.Color(93, 58, 155));
        lblDoNotHaveAnAccount.setText("Don't have an account?");

        lblSignUp.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblSignUp.setForeground(new java.awt.Color(255, 111, 97));
        lblSignUp.setText("Sign Up");
        lblSignUp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblSignUp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSignUpMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlLoginLayout = new javax.swing.GroupLayout(pnlLogin);
        pnlLogin.setLayout(pnlLoginLayout);
        pnlLoginLayout.setHorizontalGroup(
            pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLoginLayout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlLoginLayout.createSequentialGroup()
                        .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPassword)
                            .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(pnlLoginLayout.createSequentialGroup()
                                    .addComponent(lblPhoneBook)
                                    .addGap(146, 146, 146))
                                .addComponent(txtUsername, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblUsername))
                        .addGap(41, 41, 41))
                    .addGroup(pnlLoginLayout.createSequentialGroup()
                        .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnlLoginLayout.createSequentialGroup()
                                .addComponent(lblDoNotHaveAnAccount)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblSignUp))
                            .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chkShowPassword)
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );
        pnlLoginLayout.setVerticalGroup(
            pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLoginLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(lblPhoneBook)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblUsername)
                .addGap(18, 18, 18)
                .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblPassword)
                .addGap(18, 18, 18)
                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(chkShowPassword)
                .addGap(29, 29, 29)
                .addComponent(btnLogin)
                .addGap(37, 37, 37)
                .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDoNotHaveAnAccount)
                    .addComponent(lblSignUp))
                .addGap(103, 103, 103))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnLoginMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_btnLoginMouseClicked
        String username = txtUsername.getText();
        char [] passwordChars = txtPassword.getPassword();
        String password = new String(passwordChars);

        if (!AuthenticationFunctions.validateUsernameLogin(username)) return;
        if (!AuthenticationFunctions.validatePasswordFormat(password)) return;

        // Call the authenticateUser function to check the login credentials
        boolean isAuthenticated = AuthenticationFunctions.authenticateUser(username, password);

        if (isAuthenticated) {
            JOptionPane.showMessageDialog(this, "Login successful!", "Success", JOptionPane.INFORMATION_MESSAGE);
            
            // Get the logged-in userID
            String loggedInUserID = AuthenticationFunctions.getLoggedInUserID();

            // Load the contacts from the CSV file based on the logged-in userID
            LinkedList contacts = LinkedList.loadContactsForUser("src/storage/contact.csv", loggedInUserID);

            contacts.displayContactsConsole(contacts);
            // Proceed to the next screen (e.g., dispose of the login screen, open a dashboard)
            this.dispose();  // Close the login window
            new InsertContact(contacts);
            //new DisplayAllContacts(contacts).setVisible(true);  // Assuming you have a Dashboard JFrame
        } else {
            JOptionPane.showMessageDialog(this, "Invalid username or password. Please try again.",
                    "Login Failed", JOptionPane.ERROR_MESSAGE);
        }
    }// GEN-LAST:event_btnLoginMouseClicked




    private void lblSignUpMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_lblSignUpMouseClicked
        this.dispose();
        new SignUp();
    }// GEN-LAST:event_lblSignUpMouseClicked

    private void chkShowPasswordMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_chkShowPasswordMouseClicked
        JPasswordField[] txtPasswords = { txtPassword };
        displayOrHidePassword(txtPasswords);
    }// GEN-LAST:event_chkShowPasswordMouseClicked

    // Method for displaying or hiding the password
    public static void displayOrHidePassword(JPasswordField[] txtPassword) {
        for (JPasswordField txtPassword1 : txtPassword) {
            if (txtPassword1.getEchoChar() == '\u002A') {
                txtPassword1.setEchoChar('\0');
            } else {
                txtPassword1.setEchoChar('\u002A');
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnLogin;
    private javax.swing.JCheckBox chkShowPassword;
    private javax.swing.JLabel lblDoNotHaveAnAccount;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblPhoneBook;
    private javax.swing.JLabel lblSignUp;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JPanel pnlLogin;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}

/**
 *
 * @author: < Eurico Dande - 223134902 />
 */