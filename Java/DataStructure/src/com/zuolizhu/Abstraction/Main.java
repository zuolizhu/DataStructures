package com.zuolizhu.Abstraction;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Popcorn");
        dog.breath();
        dog.eat();

        Parrot parrot = new Parrot("BB");
        parrot.breath();
        parrot.eat();
        parrot.fly();

        Penguin penguin = new Penguin("BadBad");
        penguin.fly();
    }
}
