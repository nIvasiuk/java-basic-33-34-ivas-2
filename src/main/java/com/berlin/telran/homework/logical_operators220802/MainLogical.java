package com.berlin.telran.homework.logical_operators220802;

public class MainLogical {
    public static void main(String[] args) {

//                First level:
//                Logical AND operator (&&)

//        come up with an example with the laziness of the second condition for the AND operator
//
//        Logical operator "OR" (||)
//        Logical operator NOT (!)
//        independent practice, write several 'if' blocks with these logical operators.


        int a = 2;
        int b = 8;
        int c = 10;

        if ((a < b) && (b == c)) {
            System.out.println("true 1");
        } else {
            System.out.println("false 1");
        }

        a = a * 10;

        if ((a > b) || (a == c)) {
            System.out.println("true 2");
        } else {
            System.out.println("false 2");
        }

        b = b *10;

        if ((a < b) != (b == c) ) {
            System.out.println( "true 3");
        } else {
            System.out.println("false 3");
        }


    }
}
