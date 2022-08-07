package com.berlin.telran.homework.student_counter;

import java.util.Scanner;

public class MainStudentCounter {
    public static void main(String[] args) {
        //
//                Second level: Organize input through the scanner.
//                Write a method that takes as an argument the number of students in the class, implement a random selection from this number, starting with the second student.
//        Print the result to the console.
//        Example:
//        entrance 18
//        We make a choice in the range 2 - 18
//        exit 6

        System.out.println("Enter the number of students");
        Scanner scannerStudents= new Scanner(System.in);


            int a = 2; // Начальное значение диапазона - "от"
            int numberOfStusent = 0; // Конечное значение диапазона - "до"
        numberOfStusent = scannerStudents.nextInt();

        if (numberOfStusent < a) {
            System.out.println("Wrong input. Good luck next time!");

        } else {
            int randomStudent = a + (int) (Math.random() * (numberOfStusent + 1 - a)); // generate 1st number
            System.out.println("Lucky Student is number " + randomStudent);
        }


    }
}
