package com.zuolizhu.OOP.OOPTest;

public class Main {

    public static void main(String[] args) {

        Hamburger hamburger = new Hamburger("Basic", "Sausage", 5.5, "Brown");
        double price = hamburger.itemizeHamburger();
        hamburger.addHamburgerAddition1("Cabage", 0.5);
        hamburger.addHamburgerAddition2("Tomato", 1);
        hamburger.addHamburgerAddition3("Pikle",2);

        System.out.println("Total burger price is " + hamburger.itemizeHamburger());

        HealthyBurger healthyBurger = new HealthyBurger("Banana", 7.75);
        healthyBurger.addHamburgerAddition1("Egg", 2);
        healthyBurger.addHealthAddition1("Avocado", 5.25);

        System.out.println("Total healthy burger price is " + healthyBurger.itemizeHamburger());

        DeluxeBurger deluxeBurger = new DeluxeBurger();
        deluxeBurger.itemizeHamburger();
    }
}
