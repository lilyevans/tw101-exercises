package com.thoughtworks.tw101.exercises.exercise8;

// Exercise #8: Create a new version of Exercise #7 where you also record all of the user’s guesses and print them out
// once they guess correctly. Use an ArrayList to store the guesses. Catch the NumberFormatException and handle the case
// where the user entered a String that is not parseable.

public class Main {
    public static void main(String[] args) {
        HiLoGame game = new HiLoGame();
        Player player1 = new Player();

        System.out.println("Guess a number between 1 and 100: ");

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
            System.out.println("Your guesses: " + player1.getGuessList());

    }
}
