package com.zuolizhu.OOP.Inheritance;

public class Leica extends Camera {

    private String focusModes;
    private String exposureMetering;

    public Leica(String type, String model, String sensorSize, int maxISO, String focusModes, String exposureMetering) {
        super(type, model, sensorSize, maxISO);
        this.focusModes = focusModes;
        this.exposureMetering = exposureMetering;
    }
}
