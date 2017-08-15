package com.zuolizhu.Polymorphism;


import java.util.concurrent.ThreadLocalRandom;

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







public class Main {
    public static void main(String[] args) {
        for(int i = 0; i< 10; i++) {
            Movie movie = randomMovie();
            System.out.println("Movie #" + i
                    + " : " + movie.getName() + "\n"
                    + "Plot: " + movie.plot() + "\n");
        }
    }

    public static Movie randomMovie() {
        int randomNumber = ThreadLocalRandom.current().nextInt(1, 4);
        System.out.println("Random number generated was : " + randomNumber);
        switch (randomNumber) {
            case 1:
                return new FastAndFurious();
            case 2:
                return new IndependenceDay();
            case 3:
                return new StarWars();
        }
        return null;
    }
}
