package com.zuolizhu.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        /**
         * Some basic usage of Array in Java
         */

//        int [] myIntegers = getIntegers(5);
//        for(int i = 0; i< myIntegers.length; i++) {
//            System.out.println("Element " + i + ", typed value was " + myIntegers[i]);
//        }
//        System.out.println("The average is " + getAverage(myIntegers));
//    }
//
//    public static int[] getIntegers(int number) {
//        System.out.println("Enter " + number + " integer values: \r");
//        int []values = new int[number];
//
//        for(int i =0; i < values.length; i++) {
//            values[i] = scanner.nextInt();
//        }
//        return values;
//    }
//
//    public static double getAverage(int[] array) {
//        int sum = 0;
//        for(int i = 0; i < array.length; i++) {
//            sum += array[i];
//        }
//
//        return (double) sum / (double)array.length;

        /**
         * More practice
         */

        int[] myInput = getInput(5);
        int[] sortedInput = sortIntegers(myInput);
        printArray(sortedInput);
    }

    public static int[] getInput(int capacity) {
        int[] array = new int[capacity];
        System.out.println("Enter " + capacity + " integer values: \r");
        for(int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static void printArray(int[] array) {
        for(int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " input: " + array[i]);
        }
    }

    public static int[] sortIntegers(int[] array) {
        /**
         * Old fashion way to copy input array to sortedArray
         */
//        int[] sortedArray = new int[array.length];
//        for(int i = 0; i < array.length; i++) {
//            sortedArray[i] = array[i];
//        }

        /**
         * More efficient way
         */
        int[] sortedArray = Arrays.copyOf(array, array.length);

        boolean flag = true;
        int temp;
        while(flag) {
            flag = false;
            for(int i = 0; i < sortedArray.length - 1; i++) {
                //Sort algorithm
                if(sortedArray[i] < sortedArray[i+1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }

}
