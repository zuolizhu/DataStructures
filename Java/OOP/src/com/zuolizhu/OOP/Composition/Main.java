package com.zuolizhu.OOP.Composition;

public class Main {
    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20,20,5);
        Case theCase = new Case("S-Frame", "inwin", "500W", dimensions);
        Monitor monitor = new Monitor("Predator", "Acer", 34, new Resolution(2540,1440));
        Motherboard motherboard = new Motherboard("Z270","ASUS", 4,6, "v2.33");

        PC nicePC = new PC(theCase, monitor, motherboard);
        nicePC.powerUp();


        Wall wall1 = new Wall("West");
        Wall wall2 = new Wall("East");
        Wall wall3 = new Wall("South");
        Wall wall4 = new Wall("North");

        Ceiling ceiling = new Ceiling(12, "lightBlue");
        Bed bed = new Bed("Modern", 4,3,2,1);
        Lamp lamp = new Lamp("Classic", false, 75);

        Bedroom bedroom = new Bedroom("NiceRoom", wall1,wall2,wall3,wall4,ceiling,bed,lamp);

        bedroom.makeBed();

        bedroom.getLamp().turnOn();
    }
}
