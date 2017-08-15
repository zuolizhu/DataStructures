package com.zuolizhu.Encapsulation;

// This is a class without Encapsulation
// Any change inside this class will cause error in other place
public class Player {

    public String fullName;
    public int health;
    public String weapon;

    public void loseHealth(int damage) {
        this.health = this.health - damage;
        if(this.health <= 0) {
            System.out.println("Player knocked out");
        }
    }

    public int healthRemaining() {
        return this.health;
    }

}
