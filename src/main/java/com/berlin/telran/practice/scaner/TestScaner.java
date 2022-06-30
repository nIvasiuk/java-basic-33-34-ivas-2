package com.berlin.telran.practice.scaner;

import java.util.Scanner;

public class TestScaner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //  System.in - insert from keypad
        System.out.println("Enter the number:");
        int number = sc.nextInt(); // waiting for your taping...
        System.out.println("Thank you! You entred a number " + number);
        sc.close();
    }


}
