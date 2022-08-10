
package com.berlin.telran.homework.home220804_operators;

import java.util.Scanner;

public class MainHome {
    public static void main(String[] args) {

        System.out.println("Can go to Walk - " + goWalk());
        System.out.println( "I can buy the food. It’s " + canBuy (true, false));
        System.out.println("This device work's is " + checkDevice(120, 80));

        System.out.println("Enter the 1-st number:");
        Scanner scannerNumber= new Scanner(System.in);
        int number1 = scannerNumber.nextInt();
        System.out.println("Enter the 2-nd number:");
        int number2 = scannerNumber.nextInt();
        System.out.println("Enter the 3-rd num" +
                "ber:");
        int number3 = scannerNumber.nextInt();
        System.out.println("Max number is " + (getMax( 25, 14, 120)));

        System.out.println("Is this film allowed for the person? - " + getPermission(18, 18) + " ");

        System.out.println(getLeapYear(1800));





    }
            //First level: - Create two variables isWeekend and isRain.
            // Create the variable canWalk whose value should be true if it's a day off (isWeekend=true)
            // and it's not raining (isRain=false).
    private static boolean goWalk(  ) {
       // boolean isWeekend = true;  // it's a day off
        // boolean isRain = false;   // it's not raining
        boolean isWeekend = true;
        boolean isRain = false;
        boolean canWalk = isWeekend && !isRain;

//        if (isWeekend && !isRain) {
//            canWalk = true;
//        }
        return canWalk;

    }

            //Create two variables isEdekaOpen and isReweOpen,
            // the values of which depend on the fact if the stores open or not.
            // Implements a method boolean canBuy, that returns true **
            // The value of this variable must be true if at least one store is open, otherwise false.
            // Display the string “I can buy the food It’s ……“ and the value.

    private static boolean canBuy ( boolean isEdekaOpen, boolean isReweOpen ) {



        if ((isEdekaOpen == true) || (isReweOpen == false)) {
            return true;

        } else {
            return false;
        }
    }

            //Let’s imagine that we have a device, which has two flasks.
            // The device works correct if temperature of the first flask is above 100 degrees
            // and the temperature of the second flask is less than 100 degree.
            // You should write the method that checks this device.
            // Your program has to variables temperature1 and temperature2.
            // As a result it prints the message true or false.


    private static boolean checkDevice (int temperature1, int temperature2){
//        int temperature1 = 120;
//        int temperature2 = 80;

        if ((temperature1 > 100) && (temperature2 < 100)) {
            return true;
        } else {
            return false;
        }
    }
            //Implement the program that ask user to input three integers (use Scanner),
            // and print the maximum of three numbers. 19,10,1 ->19

    private static int getMax(int a, int b, int c){
        return a > b ? (a > c ?  a : c) : (b > c ? b : c);
    }

            //Imagine, you are writing the program for cinema.
            // The method you should create takes two arguments.
            // The first is the age of the person; the second is an age limit of the film.
            // The method should print if this film allowed for the person or not

    private static boolean getPermission (int age, int ageLimit) {

        if (age >= ageLimit) {
            return true;

        } else {
            return false;
        }
    }

            //Implement the program that ask user to input the year,
            // and print the is this year leap or no

    private static boolean getLeapYear (int year) {
        if (((year % 4) == 0) ||((year % 100) == 0) || ((year % 400) == 0)) {
            return true;
        } else {
            return false;
        }
    }

    //int year = Input.readInt();
   // boolean leapyear = (year > 1584 &&
                   // (
//                            (year % 400 == 0) ||
//                                    (year %4 == 0 && year % 100 != 0)
//                    )
//    );
//    if (leapyear)
//            System.out.println("Год " + year + " високосный");
//    else
//            System.out.println("Год " + year + " не високосный");

}
