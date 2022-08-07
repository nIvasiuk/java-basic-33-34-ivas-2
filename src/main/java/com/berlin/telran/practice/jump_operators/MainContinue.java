package com.berlin.telran.practice.jump_operators;

public class MainContinue {
    public static void main(String[] args) {

        int a = 12;

        for (int i = 0; i < 10; i++ ) {

            if (i % 2 == 0) {  // и = четное - остаток от деления на 2 будет НОЛЬ ... т.е. проверяем индекс на четность
                continue; // оператор продолжает цикл. печатаем все  не четные
            }

            System.out.println("i = " + i);
        }
        System.out.println("a = " + a);
    }
}
