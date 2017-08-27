package com.zuolizhu.Autoboxing;

import java.util.ArrayList;

class IntClass {
    private int myValue;

    public IntClass(int myValue) {
        this.myValue = myValue;
    }

    public int getMyValue() {
        return myValue;
    }

    public void setMyValue(int myValue) {
        this.myValue = myValue;
    }
}

public class WithoutAutoboxing {
    public static void main(String[] atgs) {
        String[] strArray = new String[10];
        int[] intArray = new int[10];

        /**
         * String is a class(or object)
         */
        ArrayList<String> strArrayList = new ArrayList<>();
        strArrayList.add("ZZ");

        /**
         * primitive type is not a class(or object), cannot
         * use Arraylist directly
         */
//        ArrayList<int> intArrayList = new ArrayList<int>();

        /**
         * Create a intclass and we can work with int variable
         */
        ArrayList<IntClass> intclassArrayList = new ArrayList<>();
        intclassArrayList.add(new IntClass(22));
    }
}
