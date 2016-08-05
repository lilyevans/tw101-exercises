package com.thoughtworks.tw101.exercises.exercise7;

import java.util.Scanner;

/**
 * Created by lilyevans on 8/5/16.
 */
public class Player {
    public int getGuess(){
        Scanner scanner = new Scanner(System.in);
        int guess = 0;
        if (scanner.hasNextInt()){
            guess = scanner.nextInt();
        }
        return guess;
    }
}
