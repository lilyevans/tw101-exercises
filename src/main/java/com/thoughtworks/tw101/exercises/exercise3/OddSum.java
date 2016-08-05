package com.thoughtworks.tw101.exercises.exercise3;

public class OddSum {

    public int of(int start, int end) {

        int counter;
        int sum = 0;

        for (counter = start; counter <= end; counter++){
            if ((counter % 2) == 1) {
                sum += counter;
            }
        }

        return sum;
    }
}
