package com.zuolizhu.ArrayList;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        printInstructions();
        while(!quit) {
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    deleteItem();
                    break;
                case 5:
                    searchItem();
                    break;
                case 6:
                    quit = true;
                    break;
            }
        }
    }

    private static void printGroceryList() {
        groceryList.printGroceryList();
    }

    private static void searchItem() {
        System.out.print("Enter item name: ");
        String searchItem = scanner.nextLine();
        if(groceryList.findItem(searchItem) != null) {
            System.out.println("Found " + searchItem + " in your list.");
        } else {
            System.out.println(searchItem + " is not in your list.");
        }
    }

    private static void deleteItem() {
        System.out.print("Enter item number: ");
        int itemNo = scanner.nextInt();
        scanner.nextLine();
        groceryList.removeGroceryItem(itemNo - 1);
    }

    private static void modifyItem() {
        System.out.print("Enter item number: ");
        int itemNo = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter replacement item: ");
        String newItem = scanner.nextLine();
        groceryList.modifyGroceryItem(itemNo, newItem);
    }

    private static void addItem() {
        System.out.print("Please enter an item: ");
        groceryList.addGroceryItem(scanner.nextLine());
    }

    private static void printInstructions() {
        System.out.println("\nPress ");
        System.out.println("\t 0 - Show choice options.");
        System.out.println("\t 1 - Show list of items.");
        System.out.println("\t 2 - Add item to the list.");
        System.out.println("\t 3 - Modify an item in the list.");
        System.out.println("\t 4 - Remove an item from the list.");
        System.out.println("\t 5 - Search an item in the list.");
        System.out.println("\t 6 - Quit the application.");
    }
}
