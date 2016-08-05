package com.thoughtworks.tw101.exercises.exercise8;

import java.util.Random;

/**
 * Created by lilyevans on 8/5/16.
 */
public class HiLoGame {
    private int secretNum;
    public HiLoGame(){
        Random rand = new Random();
        this.secretNum = rand.nextInt(100) + 1;
        //System.out.println("secret num is: " + this.secretNum);
    }

    public int checkGuess(int guess){
        if (guess == secretNum){
            return 0;
        }
        else if (guess > secretNum){
            return 1;
        }
        else {
            return -1;
        }
    }
}
