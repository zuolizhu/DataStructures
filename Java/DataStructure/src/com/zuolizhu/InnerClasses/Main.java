package com.zuolizhu.InnerClasses;

public class Main {
    public static void main(String[] args) {
        Gearbox ford = new Gearbox(6);

        ford.addGear(1,5.1);
        ford.addGear(2,10.2);
        ford.addGear(3, 12.9);
        ford.operateClutch(true);
        ford.changeGear(1);
        System.out.println(ford.wheelSpeed(200));
        ford.changeGear(2);
        System.out.println(ford.wheelSpeed(300));

    }
}
