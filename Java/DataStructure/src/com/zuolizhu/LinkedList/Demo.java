package com.zuolizhu.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

/**
 * LinkedList play around demo
 */
public class Demo {

    public static void main(String[] args) {
        LinkedList<String> placedsToVisit = new LinkedList<>();

        /**
         * Add item to list with alphabetic order
         */
        addInOrder(placedsToVisit, "Bayside");
        addInOrder(placedsToVisit, "Flushing");
        addInOrder(placedsToVisit, "Penn Station");
        addInOrder(placedsToVisit, "Hudson");
        addInOrder(placedsToVisit, "Albany");
        printList(placedsToVisit);

        addInOrder(placedsToVisit, "Nassau");
        addInOrder(placedsToVisit, "Spring Field");

        printList(placedsToVisit);
        visit(placedsToVisit);
    }

    private static void printList(LinkedList<String> linkedList) {
        /**
         * Using iterator
         */
        Iterator<String> i = linkedList.iterator();
        while(i.hasNext()) {
            System.out.println("Now visiting : " + i.next());
        }
        System.out.println("wwwwwwwwwwwwwwwwwwwwwwww");
    }

    private static boolean addInOrder(LinkedList<String> linkedList, String newCity) {
        /**
         * The code below is not point to the first element in the list
         */
        ListIterator<String> stringListIterator = linkedList.listIterator();

        while(stringListIterator.hasNext()) {
            /**
             * That's why we need .next() in below
             */
            int comparision = stringListIterator.next().compareTo(newCity);
            if(comparision == 0) {
                System.out.println(newCity + " is already included as a destination");
                return false;
            } else if (comparision > 0) {
                stringListIterator.previous();
                stringListIterator.add(newCity);
                return true;
            } else if (comparision < 0) {

            }
        }

        stringListIterator.add(newCity);
        return true;
    }

    private static void visit(LinkedList cities) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true;

        ListIterator<String> listIterator = cities.listIterator();

        if(cities.isEmpty()) {
            System.out.println("No cities in the itenerary");
        } else {
            System.out.println("Now visiting " + listIterator.next());
            printMenu();
        }

        while(!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action) {
                case 0:
                    System.out.println("Holiday over");
                    quit = true;
                    break;
                case 1:
                    if(!goingForward){
                        if(listIterator.hasNext()) {
                            listIterator.next();
                        }
                        goingForward = true;
                    }
                    if(listIterator.hasNext()) {
                        System.out.println("Now visiting " + listIterator.next());
                    } else {
                        System.out.println("Reached the end of the list");
                        goingForward = false;
                    }
                    break;
                case 2:
                    if(goingForward) {
                        if(listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        goingForward = false;
                    }
                    if(listIterator.hasPrevious()) {
                        System.out.println("Now visiting " + listIterator.previous());
                    } else {
                        System.out.println("We are at the begin of the list");
                        goingForward = true;
                    }
                    break;
                case 3:
                    printMenu();
                    break;
            }
        }
    }

    private static void printMenu() {
        System.out.println("Avalable actions: \n press");
        System.out.println("0 - to quit\n" +
        "1 - go to next city\n" +
        "2 - go to previous city\n" +
        "3 - print menu options");
    }
}
