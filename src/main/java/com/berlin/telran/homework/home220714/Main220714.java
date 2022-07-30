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
}
