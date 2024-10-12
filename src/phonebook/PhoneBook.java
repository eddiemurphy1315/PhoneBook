package phonebook;

import model.Contact;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class PhoneBook {

    public static void main(String[] args) {
        // Set Nimbus look and feel
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
            e.printStackTrace();  // Handle any exceptions
        }

        // Start the application
        //new SplashScreen();
        //contacts.displayContacts();
        //System.out.println(contacts.length);
    }
    
}

/**
 *
 * @author: < Eurico Dande - 223134902 />
 */