package com.zuolizhu.LinkedList;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("ZZ", 25);
        Customer anotherCustomer;
        anotherCustomer = customer;
        /**
         * Action below will cause customer's balance changed.
         * "anotherCustomer = customer;" assign the 2nd class point to the 1st class.
         */
        anotherCustomer.setBalance(12.22);
        System.out.println("Balance of customer " + customer.getName() + " is " + customer.getBalance());

        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(3);
        intList.add(5);
        intList.add(7);
        intList.add(9);

        for(int i = 0; i < intList.size(); i++) {
            System.out.println(i + ": " + intList.get(i));
        }

        /**
         * in Arraylist, if insert an element into the list, the rest element in
         * this list have to move down space for the new insert one.
         *
         * It wastes time
         */
        intList.add(1,2);

        for(int i = 0; i < intList.size(); i++) {
            System.out.println(i + ": " + intList.get(i));
        }
    }
}
