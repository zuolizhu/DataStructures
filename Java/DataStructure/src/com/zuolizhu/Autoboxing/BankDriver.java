package com.zuolizhu.Autoboxing;

public class BankDriver {
    public static void main(String[] args) {

        Bank bank = new Bank("Chase Bank");

        bank.addBranch("Bayside");

        bank.addCustomer("Bayside", "ZZ", 125000);
        bank.addCustomer("Bayside", "Irene", 162000);

        bank.addBranch("GreatNeck");
        bank.addCustomer("GreatNeck", "Popcorn", 100);

        bank.addCustomerTransaction("Bayside", "ZZ", 500);
        bank.addCustomerTransaction("Bayside", "ZZ", 125);
        bank.addCustomerTransaction("GreatNeck", "Popcorn", 250000);

        bank.listCustomers("GreatNeck", true);
        bank.listCustomers("Bayside", true);

        bank.addBranch("Port Washington");
        if(!bank.addCustomer("Port Washington", "Ben", 70000)) {
            System.out.println("Branch does not exist");
        }

        if(!bank.addBranch("Bayside")) {
            System.out.println("Branch already exists");
        }
    }
}
