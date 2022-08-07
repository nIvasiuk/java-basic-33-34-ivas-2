package com.berlin.telran.homework.home220714;

import java.util.Scanner;

public class Main220714 {

    public static void main(String[] args) {

        System.out.println(combiWords());
        System.out.println(addition(10, 5));
        System.out.println(subtraction(10, 5));
        System.out.println(multiplication(10, 5));
        System.out.println(dividing(10, 5));
        System.out.println(euroToUsd(100.00));
        System.out.println(calcColories(28, 24) + " Cal");
    }

    public static  String combiWords (){
                /*
                enter 2 words, use a scanner consisting of an even number of letters
                (check for the number of letters in the word).
                Get a word consisting of the first half of the first word and the second half
                of the second word. print to console.
                */

            System.out.println("Enter the first word:");
            Scanner scannerWord1 = new Scanner(System.in);
            String word1 = scannerWord1.nextLine();

            System.out.println("Enter the second word:");
            Scanner scannerWord2 = new Scanner(System.in);
            String word2 = scannerWord1.nextLine();


            int midleIndexWord1 = word1.length() / 2;
            int midleIndexWord2 = word2.length() / 2;
            String combiWord = word1.substring(0, midleIndexWord1) + word2.substring(midleIndexWord2);

//        System.out.println(endWord1);
//        System.out.println(beginWord2);
          System.out.println(word1.substring(0, midleIndexWord1));
          System.out.println(word2.substring(midleIndexWord2));
//        System.out.println(word1.substring(0, midleIndexWord1) + word2.substring(midleIndexWord2));
        return combiWord;
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
    public static int multiplication (int a, int b) {
        return a * b;
    }

    public static int dividing (int a, int b){
        return a / b;
    }


                /*
                implement the method that convert the given amount in EUR to amount in USD
                */

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
        return (int) Math.round((bigDiameter - smallDiameter) * 40 );
    }


}
