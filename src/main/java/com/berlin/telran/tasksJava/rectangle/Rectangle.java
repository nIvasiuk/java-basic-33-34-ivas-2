package com.berlin.telran.tasksJava.rectangle;

public class Rectangle {
    int lenght;
    int widht;

    public Rectangle (int lenght, int widht){
        this.lenght = lenght;
        this.widht = widht;
    }

    public void calcPerimeter () {
        int perim = 2 * (lenght + widht);

       System.out.println("The perimeter of the rectangl is: " + perim);
    }






}
