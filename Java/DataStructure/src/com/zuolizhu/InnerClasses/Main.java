package com.zuolizhu.InnerClasses;

public class Main {
    public static void main(String[] args) {
        Gearbox ford = new Gearbox(6);
        /**
         * Using inner class with right syntax
         */
        Gearbox.Gear first = ford.new Gear(1,11.5);

        /**
         * This code below does not work
         * "Not an enclosing class"
         */
//        Gearbox.Gear second = new Gearbox.Gear(2,7.5);

        /**
         * This code blow does not work as well
         * "Cannot resolve symbol 'Gear'"
         */
//        Gearbox.Gear third = new ford.Gear(3,5.5);


        System.out.println(first.driveSpeed(1000));


    }
}
