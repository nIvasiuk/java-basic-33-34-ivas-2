package com.berlin.telran.homework.home220714;

import java.util.Scanner;

public class Main220714 {

    public static void main(String[] args) {

        /*
        enter 2 words, use a scanner consisting of an even number of letters
        (check for the number of letters in the word).
        Get a word consisting of the first half of the first word and the second half
        of the second word. print to console.
        */

        System.out.println("Enter the first word:");
        Scanner scannerWord1 = new Scanner(System.in);
        String word1= scannerWord1.nextLine();

        System.out.println("Enter the second word:");
        Scanner scannerWord2 = new Scanner(System.in);
        String word2= scannerWord1.nextLine();

        int beginWord1 = word1.length();
        int endWord1 = word1.length()/2;

        int beginWord2 = word2.length()/2;


//        System.out.println(endWord1);
//        System.out.println(beginWord2);


        System.out.println(word1.substring(word1.length() - beginWord1 , word1.length() - endWord1));
        System.out.println(word2.substring(word2.length() - beginWord2));

        System.out.println(word1.substring(word1.length() - beginWord1 , word1.length() - endWord1)+word2.substring(word2.length() - beginWord2));

    }
        /*
        Implement the program that prints to screen the results of addition, subtraction,
        multiplication and division of two numbers.
        Each of the arithmetic operations should be implemented as a separate method.
         */

    public static int addition(int a, int b) {
        return a + b;
    }

    public static int subtraction (int a, int b) {
        return a - b;
    }
    public static int multiplying (int a, int b) {
        return a * b;
    }

    public static int dividing (int a, int b){
        return a / b;
    }

    public static double euroToUsd (double euro) {
        double kurs = 0.98; // euro for 1 dollar
        double euroCent = euro * 100;
        double usdCent = Math.round( euroCent * kurs);
        return usdCent / 100;
    }


    /*
     * Write a program that calculates how many extra calories there
     * will be if you’ll buy a pizza with a diameter of 28 cm instead of a
     * pizza with a diameter of 24 cm. To solve this, let's assume that each
     * square centimeter of pizza is 40 calories.

     */
    public static int calcColories (double smallDiameter, double bigDiameter) {
        double firstSquare = Math.PI * (smallDiameter / 2) * (smallDiameter / 2);
        double secondSquare = Math.PI * (bigDiameter / 2) * (bigDiameter / 2);
        return (int) Math.round((bigDiameter - smallDiameter) / 40 );
    }


}