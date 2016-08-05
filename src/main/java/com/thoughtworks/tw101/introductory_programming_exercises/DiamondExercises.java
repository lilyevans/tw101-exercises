package com.thoughtworks.tw101.introductory_programming_exercises;

import java.util.ArrayList;

public class DiamondExercises {
    public static void main(String[] args) {
        drawAnIsoscelesTriangle(3);
        drawADiamond(8);
        drawADiamondWithYourName(3);
    }

//    Isosceles Triangle
//    Given a number n, print a centered triangle. Example for n=3:
//              *
//             ***
//            *****
    private static void drawAnIsoscelesTriangle(int n) {
        ArrayList<String> stars = starBuilder(n);
        triangleTop(stars);
        triangleFullest(stars);
    }

//    Diamond
//    Given a number n, print a centered diamond. Example for n=3:
//              *
//             ***
//            *****
//             ***
//              *
    private static void drawADiamond(int n) {
        ArrayList<String> stars = starBuilder(n);
        triangleTop(stars);
        triangleFullest(stars);
        triangleBottom(stars);

    }

//    Diamond with Name
//    Given a number n, print a centered diamond with your name in place of the middle line. Example for n=3:
//
//             *
//            ***
//           Bill
//            ***
//             *
    private static void drawADiamondWithYourName(int n) {
        ArrayList<String> stars = starBuilder(n);
        triangleTop(stars);
        System.out.printf("%10s%-10s\n","Lil", "y");
        triangleBottom(stars);
    }

    private static ArrayList<String> starBuilder(int n){
        ArrayList<String> stars = new ArrayList<String>();
        StringBuilder right = new StringBuilder("*");
        StringBuilder left = new StringBuilder("");

        stars.add(right.toString());
        stars.add(left.toString());

        for (int i = 0; i < n-1; i++){
            right.append("*");
            left.append("*");
            stars.add(right.toString());
            stars.add(left.toString());
        }

        return stars;

    }

    private static void triangleTop(ArrayList<String> stars){
        for (int i = 0; i < stars.size()-2; i+=2){
            System.out.printf("%10s%-10s\n",stars.get(i), stars.get(i+1));
        }
    }

    private static void triangleBottom(ArrayList<String> stars){
        for (int i = stars.size()-4; i >= 0; i-=2){
            System.out.printf("%10s%-10s\n",stars.get(i), stars.get(i+1));
        }
    }

    private static void triangleFullest(ArrayList<String> stars){
        System.out.printf("%10s%-10s\n",stars.get(stars.size()-2), stars.get(stars.size()-1));
    }
}
