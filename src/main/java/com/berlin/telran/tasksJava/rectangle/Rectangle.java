package com.berlin.telran.tasksJava.rectangle;

public class Rectangle {
    int lenght;
    int widht;

    public static int counter = 0;

    /**
     *
     * @param lenght
     * @param widht
     */
    public Rectangle (int lenght, int widht){
        this.lenght = lenght;
        this.widht = widht;
        counter += 1;
    }

    /**
     * Calculates perimeter of the rectangle
     * @return Print rectangle perimeter
     */
    public void calcPerimeter () {
        int perim = 2 * (lenght + widht);

       System.out.println("The perimeter of the rectangl is: " + perim);
    }

    public void calcArea () {
        int area = lenght * widht;

        System.out.println("The area of the rectangl is: " + area);
    }

    public void checkQuad () {
        boolean isQuad = lenght == widht;

        System.out.println("This rectangle is quad - " + isQuad);
    }

    public static void getCount () {

        System.out.println("Number of rectangels created: " + counter);

    }

}
