Overview
The AddressBook application is a simple Java program that allows users to manage a collection of contacts. Each contact consists of a name and a phone number. The application provides functionalities to add new contacts, remove existing contacts, retrieve phone numbers by name, and print all contacts in the address book.

Features
Add Contact: Add a new contact with a name and phone number.
Remove Contact: Remove an existing contact by name.
Get Phone Number: Retrieve the phone number of a contact by name.
Print Contacts: Print all contacts in the address book.
Classes and Methods
AddressBook Class
Fields:

ArrayList<String> names: Stores the names of the contacts.
ArrayList<String> phoneNumbers: Stores the phone numbers of the contacts.
Constructor:

AddressBook(): Initializes the names and phoneNumbers lists.
Methods:

void addContact(String name, String phoneNumber): Adds a new contact with the specified name and phone number.
void removeContact(String name): Removes the contact with the specified name.
String getPhoneNumber(String name): Returns the phone number of the contact with the specified name. If the contact is not found, it returns null.
void printContacts(): Prints all the contacts in the address book.

Main Class
Main Method:
public static void main(String[] arg): Entry point of the application. Demonstrates the usage of the AddressBook class by adding, removing, and retrieving contacts, and printing the list of contacts.
