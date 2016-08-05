package com.thoughtworks.tw101.exercises.exercise7;

// Write a program that chooses a random number between 1 and 100. Then asks the user to enter a guess. If they guess
// right then tell them they win, otherwise tell them if they guessed too high or low. Keep asking the user to guess
// until they get the right answer. Use classes to separate the different concerns of this program.

public class Main {

    public static void main(String[] args) {
        HiLoGame game = new HiLoGame();
        Player player1 = new Player();

        System.out.println("Welcome to High/Low! Guess a number between 1 and 100: ");
        int guess = player1.getGuess();
        int guessCheck = game.checkGuess(guess);
        while (guessCheck != 0){
            if (guessCheck > 0){
                System.out.println("Too high! Guess again: ");
            }
            else if (guessCheck < 0){
                System.out.println("Too low! Guess again: ");
            }
            guess = player1.getGuess();
            guessCheck = game.checkGuess(guess);
        }
        System.out.println("Great job! The correct number was: " + guess);
    }
}
