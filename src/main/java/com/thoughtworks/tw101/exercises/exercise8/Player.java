package com.thoughtworks.tw101.exercises.exercise8;

import java.util.Scanner;

/**
 * Created by lilyevans on 8/5/16.
 */
public class Player {
    public int getGuess(){
        Scanner scanner = new Scanner(System.in);
        int guess;
        try{
            guess = Integer.parseInt(scanner.next());
            if (guess < 1 || guess > 100){
                throw new IndexOutOfBoundsException();
            }
        }
        catch (NumberFormatException e){
            System.out.print("Enter new guess in integer form: ");
            guess = getGuess();
        }
        catch (IndexOutOfBoundsException e) {
            System.out.println("Enter guess between 1 and 100: ");
            guess = getGuess();
        }
        return guess;
    }
}
