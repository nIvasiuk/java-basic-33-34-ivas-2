package com.berlin.telran.practice.scaner;

import java.util.Scanner;

public class TestScaner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //  System.in - insert from keypad
       // System.out.println("Enter the number:");

//        int number = sc.nextInt(); // waiting for your taping... (only ones)
//        System.out.println("Thank you! You entred a number " + number);
//        System.out.println("Enter the number:");
//        int number2 = sc.nextInt();
//        System.out.println("sum = " + (number + number2));

        System.out.println("Enter the name:");
       String name= sc.nextLine();

        System.out.println("Enter the gender:");
        char gener = sc.next().charAt(0);  //оторавть первый символ от строки которую ты вводишь

        System.out.println("Enter the age:");
        int age = 0;
        if (sc.hasNextInt()) {
            age = sc.nextInt();
        } else {
            System.out.println("Sorry, but this is wrong format age!");
           age=0;
           sc.next();
        }

        System.out.println("Enter the mobile phone:");
        long phone = sc.nextLong();


        System.out.println("Name = " + name);
        System.out.println("Gender = " + gener);
        System.out.println("Age = " + age);
        System.out.println("Mobile phone = " + phone);


        sc.close();
    }


}
