package com.zuolizhu.OOP.Encapsulation;

public class Main {
    public static void main(String[] args) {

        /**
         * Example without Encapsulation
         * The change inside Player class will cause error below.
         */
//        Player player = new Player();
//        player.fullName = "ZZ";
//        player.health = 20;
//        player.weapon = "RPG";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());
//
//        damage = 11;
//        player.health = 100;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());

        /**
         * With Encapsulation, doesn't matter what private field changed
         * inside EnhancedPlayer class, we can still access getHealth()
         * without any problem.
         */
//        EnhancedPlayer player = new EnhancedPlayer("ZZ", 50, "Laser");
//        System.out.println("initial health is " + player.getHealth());


        Printer printer = new Printer(50, false);
        System.out.println("Initial page count = " + printer.getPagesPrinted());
        int pagesPrinted = printer.printPages(4);
        System.out.println("Pages printed was " + pagesPrinted + " new total print count for printer = " + printer.getPagesPrinted());
        pagesPrinted = printer.printPages(2);
        System.out.println("Pages printed was " + pagesPrinted + " new total print count for printer = " + printer.getPagesPrinted());

    }
}
