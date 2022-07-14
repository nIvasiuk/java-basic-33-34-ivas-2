package com.berlin.telran.homework.simple_string;

import java.util.Locale;

public class SinpleStringMain {

    public static void main(String[] args) {


        String str1 = "str";
        String str = new String("I study Basic Java!");

        printString(str);

        System.out.println("Last symbol = " + str.charAt(str.length() - 1));
        System.out.println(str.contains("Java"));
        System.out.println("replace 'a' to 'o' = " + str.replace('a', 'o'));
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str.substring(str.length() - 5, str.length() -1));


    }

public static void printString(String str) {
    System.out.println(str);
}

}
