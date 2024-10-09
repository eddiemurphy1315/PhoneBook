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
        LinkedList contacts = new LinkedList();
        contacts.insertContact(new Contact("1","Eurico","Dos Antos","098645","euricodosantos@gmail.com","Mercury","Enemy","2"));
        contacts.insertContact(new Contact("2","Vali","Namibia","092323","valinamibia@gmail.com","villa","Family","3"));
        contacts.insertContact(new Contact("3","Murphy","Dande","098690","murphydande@gmail.com","katatatura","friend","4"));
        contacts.insertContact(new Contact("4","Ben","Ten","098667","benteninnit@gmail.com","Mercury","friend","5"));
        contacts.insertContact(new Contact("5","Enock","Niger","098666","enockniger@gmail.com","capitalResidence","friend","6"));

        //contacts.sort();
        //contacts.displayContacts();
        System.out.println(contacts.length);
    }
    
}

/**
 *
 * @author: < Eurico Dande - 223134902 />
 */