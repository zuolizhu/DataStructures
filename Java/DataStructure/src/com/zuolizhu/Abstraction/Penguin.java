package com.zuolizhu.Abstraction;

public class Penguin extends Bird {
    public Penguin(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println("I can not fly yo bro");
    }
}
