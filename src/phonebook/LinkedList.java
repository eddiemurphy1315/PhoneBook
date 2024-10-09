package phonebook;

import model.Contact;

public class LinkedList {
    //Fields definition
    Node head = null;
    Node tail = null;
    int length = 0;

    //Node class
    private class Node {
        private Contact contact;
        private Node next;

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

    public void displayContacts(){
        if (head != null) {
            Node temp = head;
            while (temp != null) {
                System.out.println(temp.contact);
                temp = temp.next;
            }
        } else {
            System.out.println("No contacts found");
        }
    }

    // sorting the linked list by using Merge Sort
    public void sort() {
        head = mergeSort(head);
    }

    private Node mergeSort(Node head) {
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

    private Node sortedMerge(Node left, Node right) {
        if (left == null) return right;
        if (right == null) return left;

        Node result;
        if (left.contact.firstName.compareTo(right.contact.firstName) <= 0) {
            result = left;
            result.next = sortedMerge(left.next, right);
        } else {
            result = right;
            result.next = sortedMerge(left, right.next);
        }
        return result;
    }

    private Node getMiddle(Node head) {
        if (head == null) return head;

        Node slow = head, fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}

/**
 *
 * @author: < Eurico Dande - 223134902 />
 */