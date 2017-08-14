package com.zuolizhu.Inheritance;

public class Canon extends Camera {

    private String EFLens;
    private int battery;


    public Canon(String model, String sensorSize, int maxISO, String EFLens, int battery) {
        super("DSLR", model, sensorSize, maxISO);
        this.EFLens = EFLens;
        this.battery = battery;
    }

    private void recordVideo() {
        System.out.println("Canon also record nice video!");
    }

    @Override
    public void takePicture() {
        System.out.println("Canon take nice picture!");
        recordVideo();
        super.takePicture();
    }
}
