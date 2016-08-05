package com.thoughtworks.tw101.introductory_programming_exercises;

//  Prime Factors Exercise
//  Write a method generate(int n) that given an integer N will return a list of integers such that the numbers
//  are the factors of N and are arranged in increasing numerical order.
//
//  For example, generate(1) should return an empty list and generate(30) should return the numbers: 2,3,5.

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {

    private static List<Integer> generate(int n) {
        List<Integer> primeFactors = new ArrayList<Integer>();
        //first step: find first prime factor
        int first = findFirstPrime(n);
        //if
        //step 2: add prime factor to list
        if (first != 1){
            primeFactors.add(first);
            //step 3: recursively find remaining prime factors and add to list
            List<Integer> primeFactorsTemp = generate(n/first);
            primeFactorsTemp.removeAll(primeFactors);
            primeFactors.addAll(primeFactorsTemp);
        }

        return primeFactors;
    }

    private static int findFirstPrime(int n){
        if (n % 2 == 0){
            return 2;
        }
        else{
            for (int i = 3; i <= n; i+=2){
                if (n % i == 0){
                    return i;
                }
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        List<Integer> primeFactors = generate(30);
        System.out.println(primeFactors);
    }

}
