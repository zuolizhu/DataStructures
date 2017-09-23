package com.zuolizhu.Generics;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList items = new ArrayList();
        items.add(1);
        items.add(2);
        items.add(3);
        items.add(4);
        items.add(5);
        items.add("ZZ");
        items.add(6);

        printDoubled(items);
    }

    private static void printDoubled(ArrayList n) {
        for(Object i : n) {
            System.out.println((Integer) i * 2);
        }
    }
}
