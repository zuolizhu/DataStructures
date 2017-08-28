package com.zuolizhu.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

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
}
