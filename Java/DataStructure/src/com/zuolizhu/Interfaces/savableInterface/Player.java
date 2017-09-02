package com.zuolizhu.Interfaces.savableInterface;

import java.util.ArrayList;
import java.util.List;

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
    public List<String> write() {
        List<String> values = new ArrayList<>();
        values.add(0, this.name);
        values.add(1, "" + this.damage);
        values.add(2,"" + this.health);
        values.add(3, this.weapon);

        return values;
    }

    @Override
    public void read(List<String> savedValues) {
        if(savedValues != null && savedValues.size() > 0) {
            this.name = savedValues.get(0);
            this.damage = Integer.parseInt(savedValues.get(1));
            this.health = Integer.parseInt(savedValues.get(2));
            this.weapon = savedValues.get(3);
        }
    }
}
