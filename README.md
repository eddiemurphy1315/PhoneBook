# PhoneBook

## Modules
### 1.	Authentication Module (for sign up and login functionalities).
### 2.	Insert Contact (for insertion of a new contact).
### 3.	Search Contact (for searching for a contact).
### 4.	Display all contacts (for displaying all the contacts).
### 5.	Delete Contact (for deleting a contact). 
### 6.	Update Contact (for updating a contact). 
### 7.	Sort Contacts (for sorting a contact). 
### 8.	Validation (for validating the fields).

## Functions:
### 1.	Sign up 	
    Description: Takes user personal information and stores it to the (CSV file).	
    Output: New user added successfully; error message if failed.
### 2.	Login 	
    Description: Takes username or email and password as input, checks credentials against the user (CSV file), and grants access if valid.
	Output: Access to the phonebook upon successful login; error message if failed.
### 3.	Insert Contact
	Description: Adds a new contact to the phonebook. Requires fields such as name, phone number, and email.
	Key Inputs: Name, phone number, email.
	Output: Adds the new contact to the linked list and saves it in the CSV file.
### 4.	Search Contact
	Description: Searches for a contact based on the name or phone number using Linear Search.
	Key Inputs: Name or phone number.
	Output: Returns the matching contact details (if found) or a message indicating no match.
### 5.	Update Contact Function
	Description: Updates an existing contact's details (name, phone number, or email).
	Key Inputs: Contact ID or name, updated details (new name, new number, etc.).
	Output: Updates the contact in the linked list and CSV file.
### 6.	Delete Contact
	Description: Removes a contact from the phonebook by name or phone number.
	Key Inputs: Contact name or phone number.
	Output: Removes the contact from the linked list and file.
### 7.	Sort Contacts
	Description: Sorts the contacts alphabetically by name or by phone number using Merge Sort.
	Key Inputs: Sort criteria (name or phone number, ascending or descending).
	Output: Returns the sorted list of contacts.
### 8.	Display All Contacts
	Description: Displays all contacts in the phonebook, showing details like name, phone number, and email.
	Key Inputs: None.
	Output: Lists all the contacts.
### 9.	Create Phonebook
	Description: Creates a new phonebook. Requires fields such as phonebook name.
	Key Inputs: Phonebook number.
	Output: Creates the new Phonebook, as well as add it to the linked list and saves it in the CSV file.
### 10. Delete Phonebook
	Description: Removes a phonebook.
	Key Inputs: Phonebook name.
	Output: Removes the Phonebook from the linked list and file.
### 11. Update Phonebook
	Description: Updates an existing.
	Key Inputs: Phonebook name.
	Output: Updates the Phonebook in the linked list and CSV file.
### 12. Validate User Input (Supporting Functions – more than one)
	Description: Validates user inputs such as contact names, phone numbers, and emails for correctness.
	Key Inputs: Name, phone number, email.
	Output: Returns validation success or failure (error message if invalid).
### 13. Logout Function (related to authentication)
	Description: Logs the user out, ending the session and preventing further access to the phonebook until they log in again.	
    Output: Ends the user session.

## Group 70 - Members:
### Admiphy Sisamu - 223055190
### Eurico Dande - 223134902
### Kondwani Kunkwenzu - 224093894
### Martha Mathew - 224073966
### Pascal Tandula - 224084038
### Toluwani Omotayo - 224086235