package com.berlin.telran.tasksJava.rectangle;

import java.util.Scanner;

public class MainRect {
    public static void main(String[] args) {
        // chech, that rectangles not created yet
        Rectangle.getCount();

        // ==================== get parameters =================
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the regtangle's length:");
        int lenght = sc.nextInt();

        System.out.println("Enter the regtangle's wight:");
        int wight = sc.nextInt();
        Rectangle.getCount();

        // ==================== first rectangle =================
        Rectangle rectangle1 = new Rectangle(lenght, wight);
        rectangle1.calcPerimeter();
        rectangle1.calcArea();
        rectangle1.checkQuad();
        Rectangle.getCount();

        // ==================== second rectangle =================
        Rectangle rectangle2 = new Rectangle(lenght, wight);
        Rectangle.getCount();
    }
}
