package com.thoughtworks.tw101.exercises.exercise2;

public class Accumulator {
    private int numIncrements;

    public Accumulator(){

         numIncrements = 0;

    }

    public void increment(){

        numIncrements++;

    }

    public void total(){

        System.out.println("Number of calls to increment(): " + numIncrements);

    }
}
