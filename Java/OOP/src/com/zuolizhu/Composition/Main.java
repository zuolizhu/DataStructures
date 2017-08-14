package com.zuolizhu.Composition;

public class Main {
    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20,20,5);
        Case theCase = new Case("S-Frame", "inwin", "500W", dimensions);
        Monitor monitor = new Monitor("Predator", "Acer", 34, new Resolution(2540,1440));
        Motherboard motherboard = new Motherboard("Z270","ASUS", 4,6, "v2.33");

        PC nicePC = new PC(theCase, monitor, motherboard);
        nicePC.getMonitor().drawPixelAt(1500,1200, "yellow");
        nicePC.getMotherboard().loadProgram("Ubuntu 16.04");
        nicePC.getTheCase().pressPowerButton();
    }
}
