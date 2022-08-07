package com.berlin.telran.practice.if_else_if;

public class MainElse {
    public static void main(String[] args) {
        int a = 10;
//        if (a > 15) {                              // иф не прерывает выполнение метода
//            System.out.println("10 is less than 15");
//            System.out.println("10 is less than 15");
//            System.out.println("10 is less than 15");
//            System.out.println("10 is less than 15");
//            System.out.println("10 is less than 15");
//            System.out.println("10 is less than 15");
//        } else {
//
//            System.out.println("number 15 is greater than 10");
//        }
//        System.out.println("I am not in if");
//        System.out.println("I am not in if, second time");
//
//        boolean isMinus = a == -1;
//
//        if (a < 15 || isMinus) {
//            System.out.println("It is true!");
//            System.out.println("It is true!");
//            System.out.println("It is true!");
//            a = a + 10;
//
//
//            checkNumber(a);    // делаем (выносим часть кода в) отдельный метод. выделяем код (напр. с иф)
//                               // и нажимаемконтл+альт+м
//        }
//
//    }

        if (a == 15) {
            System.out.println("a is 15"); // а = 10, по этому мы не попадаем в этот иф
        } else if (a == 13) {
            System.out.println("a is 13");  // а = 10, по этому мы не попадаем в этот иф
        } else if (a == 10) {
            System.out.println("a is 10"); // а = 10, по этому мы попадаем в этот иф и печатаем строку.
        } else {
            System.out.println("a is not present");
        }


    }


        private static void checkNumber(int a) {
        if (a > 18) {
            System.out.println("number is greater than 18");
        } else {

        }
        if (a == 18) {
            System.out.println("number is equals than 18");
        } else {

        }
    }
}
