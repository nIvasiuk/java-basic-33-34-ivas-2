package com.berlin.telran.tasksJava.rectangle;

import java.util.Scanner;

public class MainRect {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the regtangle's length:");
        int lenght = sc.nextInt();

        System.out.println("Enter the regtangle's wight:");
        int wight = sc.nextInt();

        Rectangle rectangle1 = new Rectangle(lenght, wight);

        rectangle1.calcPerimeter();

        rectangle1.calcArea();
    }
}
