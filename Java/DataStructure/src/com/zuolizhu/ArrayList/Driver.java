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
