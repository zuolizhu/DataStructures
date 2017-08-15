package com.zuolizhu.Polymorphism;

import java.util.concurrent.ThreadLocalRandom;

/**
 * Polymorphism implementation
 * Example 1
 */

class Movie {
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String plot() {
        return "No plot here";
    }

    public String getName() {
        return name;
    }
}

class FastAndFurious extends Movie {
    public FastAndFurious() {
        super("FastAndFurious");
    }

    @Override
    public String plot() {
        return "People drive cars super crazy";
    }
}

class IndependenceDay extends  Movie {
    public IndependenceDay() {
        super("Independence Day");
    }

    @Override
    public String plot() {
        return "Aliens attempt to take over planet earth";
    }
}

class StarWars extends Movie {
    public StarWars() {
        super("Star Wars");
    }

    // No plot method
}


/**
 * Polymorphism implementation
 * Example 2
 */

class Car {

    private String name;
    private int cylinders;
    private boolean engine;
    private int wheels;

    public Car(String name, int cylinders) {
        this.name = name;
        this.cylinders = cylinders;
        this.engine = true;
        this.wheels = 4;
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String startEngine() {
        return "Car -> startEngine()";
    }

    public String accelerate() {
        return "Car -> accelerate()";
    }

    public String brake() {
        return "Car -> brake()";
    }
}

class Mitsubishi extends Car {
    public Mitsubishi(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine() {
        return "Mitsubishi -> startEngine()";
    }

    @Override
    public String accelerate() {
        return "Mitsubishi -> accelerate()";
    }

    @Override
    public String brake() {
        return "Mitsubishi -> brake()";
    }
}

class Ford extends Car {
    public Ford(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine() {
        return "Ford -> startEngine()";
    }

    @Override
    public String accelerate() {
        return "Ford -> accelerate()";
    }

    @Override
    public String brake() {
        return "Ford -> brake()";
    }
}

class Toyota extends Car {
    public Toyota(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine() {
        return "Toyota -> startEngine()";
    }

    @Override
    public String accelerate() {
        return "Toyota -> accelerate()";
    }

    @Override
    public String brake() {
        return "Toyota -> brake()";
    }
}



public class Main {

    public static void main(String[] args) {

        /**
         * Test for Example 1
         */
//        for(int i = 0; i< 10; i++) {
//            Movie movie = randomMovie();
//            System.out.println("Movie #" + i
//                    + " : " + movie.getName() + "\n"
//                    + "Plot: " + movie.plot() + "\n");
//        }

        /**
         * Test for Example 2
         */

        Car car = new Car("Base Car",8);
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        Mitsubishi mitsubishi = new Mitsubishi("Lancer", 4);
        System.out.println(mitsubishi.startEngine());
        System.out.println(mitsubishi.accelerate());
        System.out.println(mitsubishi.brake());

        Ford ford = new Ford("F150", 6);
        System.out.println(ford.startEngine());
        System.out.println(ford.accelerate());
        System.out.println(ford.brake());

        Toyota toyota = new Toyota("Tacoma", 8);
        System.out.println(toyota.startEngine());
        System.out.println(toyota.accelerate());
        System.out.println(toyota.brake());

    }

//    public static Movie randomMovie() {
//        int randomNumber = ThreadLocalRandom.current().nextInt(1, 4);
//        System.out.println("Random number generated was : " + randomNumber);
//        switch (randomNumber) {
//            case 1:
//                return new FastAndFurious();
//            case 2:
//                return new IndependenceDay();
//            case 3:
//                return new StarWars();
//        }
//        return null;
//    }
}
