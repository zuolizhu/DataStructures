package com.zuolizhu.Autoboxing;

import java.util.ArrayList;

public class WithAutoboxing {

    public static void main(String[] args) {

        Integer integer = new Integer(22);
        Double doubleValue = new Double(22.11);

        ArrayList<Integer> intArrayList =new ArrayList<>();
        for(int i = 0; i <= 10; i++) {
            /**
             * Code below Integer.valueOf(i) is autoboxing
             * Creating and converting a primitive variable
             * to an integer object
             */
            intArrayList.add(Integer.valueOf(i));
        }

        for(int i = 0; i <= 10; i++) {
            System.out.println(i + "-->" + intArrayList.get(i).intValue());
        }

        /**
         * Code below works because during compiling time
         * The Compiler runs Integer.valueOf(12) behind
         */
        Integer myIntValue = 12;

        /**
         * myint.intValue(); runs behind
         */
        int myint = myIntValue;


    }
}
