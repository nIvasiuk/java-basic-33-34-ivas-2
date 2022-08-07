package com.berlin.telran.practice.jump_operators;

public class MainBreak {
    public static void main(String[] args) {

       int a = 10;

        // int i = 0;
        // if (i < 10);
        // i = i + 1


        for (int i = 0; i < 10; i++) { // это цикл (добавлять +1)  повторяется до тех пор, пока не достигнет 10
            System.out.println("i = " + i);

            a = a + a;
            if (a > 128 ) { // как толькло а достигнет больше 128 - выполнение прирвется
                break; // прирывает цикл после первого раза, но не прерывает работу аплекации
            }
            System.out.println("after break");
       }

        if (a == 10) {
            a = a + 1;
        }
        System.out.println("a = " + a);
    }
}



