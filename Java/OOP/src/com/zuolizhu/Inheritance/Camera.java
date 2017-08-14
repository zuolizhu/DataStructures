package com.zuolizhu.Inheritance;

public class Camera {
    private String type;
    private String model;
    private String sensorSize;
    private int maxISO;

    public Camera(String type, String model, String sensorSize, int maxISO) {
        this.type = type;
        this.model = model;
        this.sensorSize = sensorSize;
        this.maxISO = maxISO;
    }

    public void takePicture() {
        System.out.println("Camera take picture!");
    }

    public void imageQuality(int resolution) {
        System.out.println("Image resolution is " + resolution);
    }

    public String getType() {
        return type;
    }

    public String getModel() {
        return model;
    }

    public String getSensorSize() {
        return sensorSize;
    }

    public int getMaxISO() {
        return maxISO;
    }
}
