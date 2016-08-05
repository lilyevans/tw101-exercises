package com.thoughtworks.tw101.exercises.exercise6;

/**
 * Created by lilyevans on 7/31/16.
 */
public class Orc implements Monster {
    private String name;
    private int hitPoints;

    public Orc(){
        this.name = "Orc";
        this.hitPoints = 20;
    }

    public void takeDamage(int amount) {
        hitPoints -= amount;
    }

    public void reportStatus(){
        System.out.println("Name: " + name);
        System.out.println("Hit Points: " + hitPoints);
    }
}
