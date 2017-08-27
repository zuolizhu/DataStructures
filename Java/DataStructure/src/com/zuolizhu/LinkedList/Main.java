package com.zuolizhu.LinkedList;

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
    }
}
