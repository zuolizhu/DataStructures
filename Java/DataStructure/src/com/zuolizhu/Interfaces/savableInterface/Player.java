package com.zuolizhu.Interfaces.savableInterface;

import java.util.ArrayList;

public class Player implements ISaveable {
    private String name;
    private int damage;
    private int health;
    private String weapon;

    public Player(String name, int damage, int health) {
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weapon = "Sniper";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", damage=" + damage +
                ", health=" + health +
                ", weapon='" + weapon + '\'' +
                '}';
    }

    @Override
    public ArrayList<String> write() {
        return null;
    }

    @Override
    public void read(ArrayList<String> savedValues) {

    }
}
