package com.zuolizhu.OOP.OOPTest;

public class DeluxeBurger extends Hamburger {
    public DeluxeBurger() {
        super("Deluxe", "Sausage & Cheese & Bacon", 25, "Black");
        super.addHamburgerAddition1("Fries", 3);
        super.addHamburgerAddition2("Coffee", 5.5);
    }

    /**
     * Prevent add more items
     */

    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("Cannot add additional items to the deluxe burger");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("Cannot add additional items to the deluxe burger");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("Cannot add additional items to the deluxe burger");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("Cannot add additional items to the deluxe burger");
    }
}
