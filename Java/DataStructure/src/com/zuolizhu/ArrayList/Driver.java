package com.zuolizhu.ArrayList;

import java.util.Scanner;

public class Driver {
    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("518 000 0001");
    public static void main(String[] args) {

        boolean quit = false;
        startPhone();
        printActions();
        while(!quit) {
            System.out.println("\nEnter action: (6 to show instruction)");
            int action = scanner.nextInt();
            switch (action) {
                case 0:
                    System.out.println("\n Shutting down...");
                    quit = true;
                    break;
                case 1:
                    printContacts();
                    break;
                case 2:
                    addNewContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    searchContact();
                    break;
                case 6:
                    printActions();
                    break;
            }
        }
    }

    private static void searchContact() {
        System.out.println("Enter the contact name you want to search: ");
        String name = scanner.nextLine();
        Contact oldContact = mobilePhone.searchContact(name);
        if(oldContact == null) {
            System.out.println("Contact not found.");
            return;
        }

        System.out.println("Name: " + oldContact.getName() + " phone number is " + oldContact.getPhoneNumber());
    }

    private static void removeContact() {
        System.out.println("Enter the contact name you want to remove: ");
        String name = scanner.nextLine();
        Contact oldContact = mobilePhone.searchContact(name);
        if(oldContact == null) {
            System.out.println("Contact not found.");
            return;
        }

        if(mobilePhone.removeContact(oldContact)) {
            System.out.println("Successfully removed contact");
        } else {
            System.out.println("Error removing contact");
        }
    }

    private static void updateContact() {
        System.out.println("Enter the contact name you want to search: ");
        String name = scanner.nextLine();
        Contact oldContact = mobilePhone.searchContact(name);
        if(oldContact == null) {
            System.out.println("Contact not found.");
            return;
        }
        System.out.println("Enter new contact name: ");
        String newName = scanner.nextLine();
        System.out.print("Enter new contact phone number: ");
        String newNumber = scanner.nextLine();
        Contact newContact = Contact.createContact(newName, newNumber);
        if(mobilePhone.updateContact(oldContact, newContact)) {
            System.out.println("Successfully updated record");
        } else {
            System.out.println("Error updating record");
        }
    }

    private static void addNewContact() {
        System.out.println("Enter new contact name: ");
        String name = scanner.nextLine();
        System.out.println("Enter phone number: ");
        String number = scanner.nextLine();
        Contact newContact = Contact.createContact(name, number);
        if(mobilePhone.addNewContact(newContact)) {
            System.out.println("New contact added: name = " + name+ ", phone number = " + number);
        } else {
            System.out.println("Cannot add new contact, " + name + " might already exist");
        }
    }

    private static void printContacts() {
        mobilePhone.printContacts();
    }

    private static void startPhone() {
        System.out.println("Starting phone...");
    }

    private static void printActions() {
        System.out.println("\n Available actions: \npress");
        System.out.println("0 - shutdown\n" +
                           "1 - print contacts\n" +
                           "2 - add a new contact\n" +
                           "3 - update a contact\n" +
                           "4 - remove a contact\n" +
                           "5 - search a contact\n" +
                           "6 - print instruction.");
        System.out.println("Choose your action: ");
    }




}
