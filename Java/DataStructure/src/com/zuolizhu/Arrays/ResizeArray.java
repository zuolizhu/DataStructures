package com.zuolizhu.Arrays;

import java.util.Scanner;

public class ResizeArray {

    private static Scanner scanner = new Scanner(System.in);
    private static int[] baseData = new int[6];

    public static void main(String[] args) {
        System.out.println("Enter 6 integers: ");
        getInput();
        printArray(baseData);
        resizeArray();
        System.out.println("---------Array resized-------------");
        System.out.println("Enter 8 integers: ");
        getInput();
        printArray(baseData);
    }

    private static void getInput() {
        for(int i = 0; i < baseData.length; i++) {
            baseData[i] = scanner.nextInt();
        }

    }
    private static void printArray(int[] array) {
        for(int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
    private static void resizeArray() {
        int[] original = baseData;
        baseData = new int[8];
        for(int i = 0; i < original.length; i++) {
            baseData[i] = original[i];
        }
    }
}
