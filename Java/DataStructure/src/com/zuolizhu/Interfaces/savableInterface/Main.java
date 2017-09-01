package com.zuolizhu.Interfaces.savableInterface;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * simple interface practice that allow an object
 * to be saved to some data.
 */
public class Main {

    public static void main(String[] args) {

    }

    public static ArrayList<String> readValues() {
        ArrayList<String> values = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Choose \n " +
        "1 - to enter a string\n" +
        "0 - to quit");
        while(!quit) {
            System.out.println("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.println("Enter a string: ");
                    String stringInput = scanner.nextLine();
                    values.add(index, stringInput);
                    index++;
                    break;
            }
        }
        return values;
    }
}
