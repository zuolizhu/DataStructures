package com.zuolizhu.OOP.Inheritance;

public class Main {
    public static void main(String[] args) {
//        Camera myGear = new Camera("DSLR", "5D3","Full-Frame",25600);
//        Canon iWantIt = new Canon("1DX","FullFrame",1280000,"16-35",1);
//        iWantIt.takePicture();
//        iWantIt.imageJPG();

        PickupTruck pickup = new PickupTruck(36);
        pickup.steer(45);
        pickup.accelerate(30);
        pickup.accelerate(20);
        pickup.accelerate(-42);

    }
}
