package displaycontacts;
import java.util.LinkedList;
import javax.swing.JOptionPane;
import model.Contact;
/**
 *
 * @author Murphy Sisamu 223055190
 */

//Represents a contact with name, phone, and email.
/*class Contact{
    String name;
    String phone;
    String email;
    
    public Contact(String name, String phone, String email){
        this.name = name;
        this.phone = phone;
        this.email = email;
    }
    public String toString() {
        return " " + name + "    \t\t" + phone + "        \t\t" + email ;
    }
}*/

public class DisplayAllContacts extends javax.swing.JFrame {

    LinkedList<Contact> contactList = new LinkedList<>();
    /**
     * Creates new form DisplayAllContacts
     */
    public DisplayAllContacts() {
        initComponents();
        //populateContacts();
        
        contactList.add(new Contact("1","Murphy", "Sisamu", "+264813535449", "murphysisamu1315@gmail.com", "Khomasdal", "Friend", "3"));
        contactList.add(new Contact("2", "Klaus", "Sisamu" , "264853535449" , "kluassisamu1807@gmail.com", "Dorado Park", "Family", "3"));
        contactList.add(new Contact ("3", "Eurico", "Dande" , "264813487560" , "euricodande@gmail.com", "Student Stay", "Friend", "3"));
    
        // Add placeholder functionality to SearchField
        SearchField.setText("Search...");
        SearchField.setForeground(new java.awt.Color(250, 250, 250));  // Gray text to indicate it's a placeholder

        SearchField.addFocusListener(new java.awt.event.FocusListener() {
            @Override
            public void focusGained(java.awt.event.FocusEvent evt) {
                if (SearchField.getText().equals("Search...")) {
                    SearchField.setText("");  // Clear the placeholder
                    SearchField.setForeground(new java.awt.Color(0, 0, 0));  // Set text color to black when typing
                }
            }

            @Override
            public void focusLost(java.awt.event.FocusEvent evt) {
                if (SearchField.getText().isEmpty()) {
                    SearchField.setForeground(new java.awt.Color(150, 150, 150));  // Gray text again
                    SearchField.setText("Search...");  // Show placeholder text again if the field is empty
                }
            }
        });
    }
    
    //Populate the LinkedList with some contactcts
    private void populateContact() {
    } 

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TextArea = new javax.swing.JTextArea();
        NameLabel = new javax.swing.JLabel();
        PhoneLabel = new javax.swing.JLabel();
        EmailLabel = new javax.swing.JLabel();
        SearchField = new javax.swing.JTextField();
        SearchButton = new javax.swing.JButton();
        DisplayAllContacsButton = new javax.swing.JButton();
        UpdateButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(786, 466));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(232, 248, 245));

        TextArea.setColumns(20);
        TextArea.setRows(5);
        TextArea.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                TextAreaAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane1.setViewportView(TextArea);

        NameLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        NameLabel.setText("Names");

        PhoneLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        PhoneLabel.setText("Phone");

        EmailLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        EmailLabel.setText("Email");

        SearchField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchFieldActionPerformed(evt);
            }
        });

        SearchButton.setBackground(new java.awt.Color(255, 111, 97));
        SearchButton.setText("Search");
        SearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchButtonActionPerformed(evt);
            }
        });

        DisplayAllContacsButton.setBackground(new java.awt.Color(255, 111, 97));
        DisplayAllContacsButton.setText("Display All Contacts");
        DisplayAllContacsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DisplayAllContacsButtonActionPerformed(evt);
            }
        });

        UpdateButton.setBackground(new java.awt.Color(255, 111, 97));
        UpdateButton.setText("Update contact");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(SearchField, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(NameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(169, 169, 169)
                                .addComponent(PhoneLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(EmailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(165, 165, 165))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(SearchButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(DisplayAllContacsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(17, 17, 17))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 667, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(68, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(UpdateButton)
                .addGap(95, 95, 95))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(UpdateButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(SearchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SearchButton)
                    .addComponent(DisplayAllContacsButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NameLabel)
                    .addComponent(PhoneLabel)
                    .addComponent(EmailLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TextAreaAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_TextAreaAncestorAdded
        TextArea.setEditable(false);
    }//GEN-LAST:event_TextAreaAncestorAdded

    private void SearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchButtonActionPerformed
        String searchQuery = SearchField.getText().trim();
        boolean found = false;
        
        //Clear TextArea before showing new result
        TextArea.setText("");
        
        //Search through the contact list
        for (Contact contact : contactList){
            if(contact.firstName.equalsIgnoreCase(searchQuery) || contact.phoneNumber.equals(searchQuery)) {
                TextArea.setText(contact.toString());
                found = true;
                break;
            }
        }
        if (!found) {
            TextArea.setText("Contact not found!");
        }
    }//GEN-LAST:event_SearchButtonActionPerformed

    private void DisplayAllContacsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DisplayAllContacsButtonActionPerformed
        displayContacts(); // Call method to display contacts when the button is pressed
    }//GEN-LAST:event_DisplayAllContacsButtonActionPerformed

    private void SearchFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SearchFieldActionPerformed

    private void displayContacts(){
        TextArea.setText(""); //Clearnthe TextArea First.
        for(Contact contact : contactList){
            TextArea.append(contact.toString() + "\n"); //Append each contact to the TextArea
        }
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
            java.util.logging.Logger.getLogger(DisplayAllContacts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DisplayAllContacts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DisplayAllContacts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DisplayAllContacts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DisplayAllContacts().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DisplayAllContacsButton;
    private javax.swing.JLabel EmailLabel;
    private javax.swing.JLabel NameLabel;
    private javax.swing.JLabel PhoneLabel;
    private javax.swing.JButton SearchButton;
    private javax.swing.JTextField SearchField;
    private javax.swing.JTextArea TextArea;
    private javax.swing.JButton UpdateButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
