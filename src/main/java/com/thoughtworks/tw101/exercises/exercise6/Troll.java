package com.thoughtworks.tw101.exercises.exercise6;

/**
 * Created by lilyevans on 7/31/16.
 */
public class Troll implements Monster{
    private String name;
    private int hitPoints;

    public Troll(){
        this.name = "Troll";
        this.hitPoints = 40;
    }

    public void takeDamage(int amount) {
        hitPoints -= amount/2;
    }

    public void reportStatus(){
        System.out.println("Name: " + name);
        System.out.println("Hit Points: " + hitPoints);
    }
}
