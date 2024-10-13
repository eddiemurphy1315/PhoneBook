package phonebook;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import model.Contact;

public class LinkedList {
    // Fields definition
    public Node head = null;
    Node tail = null;
    int length = 0;

    // Node class
    public class Node {
        public Contact contact;
        public Node next;

        public Node(Contact contact) {
            this.contact = contact;
            this.next = null;
        }
    }

    public void insertContact(Contact contact) {
        Node newNode = new Node(contact);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        this.length = length + 1;
    }


    public void displayContacts(JTextArea textArea, LinkedList contacts) {
        if (head != null) {
            contacts.sort();
            Node temp = head;
            while (temp != null) {
                textArea.setText(contacts.toString(temp) + "\n"); // Append each contact to the TextArea
                temp = temp.next;
            }
        } else {
            System.out.println("No contacts found");
        }
    }

    public void displayContactsConsole(LinkedList contacts) {
        if (head != null) {
            Node temp = head;
            while (temp != null) {
                System.out.println(temp.contact.getFirstName() +" "+ temp.contact.getLastName() + " " + temp.contact.getPhoneNumber() + "\n"); // Append each contact to the TextArea
                temp = temp.next;
            }
        } else {
            System.out.println("No contacts found");
        }
    }

    public String toString(Node node) {

        return "  " +
                
                "  " + node.contact.getFirstName() + 
                "\t" + node.contact.getLastName() + 
                "\t" + node.contact.getPhoneNumber() + 
                "\t" + node.contact.getEmail() + 
                "\t\t" + node.contact.getAddress() + 
                "\t" + node.contact.getContactGroup();
        
    }

    // sorting the linked list by using Merge Sort
    public void sort() {
        head = mergeSort(head);
    }

    public Node mergeSort(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node middle = getMiddle(head);
        Node nextOfMiddle = middle.next;
        middle.next = null; // Split the list into two halves

        Node left = mergeSort(head); // Sort the left half
        Node right = mergeSort(nextOfMiddle); // Sort the right half

        return sortedMerge(left, right);
    }

    public Node sortedMerge(Node left, Node right) {
        if (left == null) return right;
        if (right == null) return left;

        Node result;
        if (left.contact.getFirstName().compareTo(right.contact.getFirstName()) <= 0) {
            result = left;
            result.next = sortedMerge(left.next, right);
        } else {
            result = right;
            result.next = sortedMerge(left, right.next);
        }
        return result;
    }

    private Node getMiddle(Node head) {
        if (head == null)
            return head;

        Node slow = head, fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    // Function to load contacts for a specific user from a CSV file
    public static LinkedList loadContactsForUser(String filePath, String userID) {
        LinkedList contacts = new LinkedList();
        File file = new File(filePath);

        try (Scanner scan = new Scanner(file)) {
            // Skip the first line (header)
            if (scan.hasNextLine()) {
                scan.nextLine();
            }

            // Read each line and add contacts that match the logged-in user's userID
            while (scan.hasNextLine()) {
                String line = scan.nextLine();
                String[] contactDetails = line.split(",");

                // Check if this contact belongs to the logged-in user
                if (contactDetails.length >= 8 && contactDetails[7].trim().equals(userID)) {
                    // Create a new Contact object and add it to the list
                    Contact contact = new Contact(
                            contactDetails[0].trim(), // contactID
                            contactDetails[1].trim(), // firstName
                            contactDetails[2].trim(), // lastName
                            contactDetails[3].trim(), // phoneNumber
                            contactDetails[4].trim(), // email
                            contactDetails[5].trim(), // address
                            contactDetails[6].trim(), // contactGroup
                            contactDetails[7].trim() // userID
                    );
                    contacts.insertContact(contact); // Add the contact to the LinkedList
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error: Contacts file not found!", "File Error",
                    JOptionPane.ERROR_MESSAGE);
        }

        return contacts; // Return the LinkedList of contacts for the user
    }

    //When displaying
    public LinkedList linearSearchName(String name, JTextArea textArea){
        LinkedList results = new LinkedList();
        int count = 0;
        if (isEmpty()){
            JOptionPane.showMessageDialog(null, "The list is empty.", "No contacts", JOptionPane.INFORMATION_MESSAGE);
            return null;
        } else {
            var temp = this.head;
            while (temp != null){
                if(temp.contact.getFirstName().equals(name) || temp.contact.getLastName().equals(name)){
                    textArea.setText(temp.contact.toString());
                    results.insertContact(temp.contact);
                }     
                    
                    
                temp = temp.next;
                count++;
            }
            if(count == 0){
                return null;
            }
            else{
                return results;
            }
            
        }
    }

    //When displaying
    public Contact linearSearchNumber(String phoneNumber, String loggedInUserID){
        if (isEmpty()){
            JOptionPane.showMessageDialog(null, "The list is empty.", "No contacts", JOptionPane.INFORMATION_MESSAGE);
            return null;
        } else {
            var temp = this.head;
            while (temp != null){
                if(temp.contact.getPhoneNumber().equals(phoneNumber) && temp.contact.getUserID().equals(loggedInUserID)){  
                    JOptionPane.showMessageDialog(null, "Contact found successfully", "Contact found", JOptionPane.INFORMATION_MESSAGE);
                    return temp.contact;
                }
                temp = temp.next;
            }
            JOptionPane.showMessageDialog(null, "The contact is not in the list.", "Not found", JOptionPane.INFORMATION_MESSAGE);
            return null;
        }
    }

    private boolean isEmpty(){
        return head == null;
    }

}

/**
 *
 * @author: < Eurico Dande - 223134902 />
 */