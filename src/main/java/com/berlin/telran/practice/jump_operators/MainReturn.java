package com.berlin.telran.practice.jump_operators;

public class MainReturn {
    public static void main(String[] args) {

//        boolean isTrue = true; // т.к. по умолчанию она фолс
//        System.out.println("befor return");
//
//        if (!isTrue) {
//            System.out.println("into if");
//            return;
//        }
//
//        System.out.println("after return");

        for (int i = 0; i < 10; i++) {
            System.out.println("i before return = " + i);
            if (i == 4) {
                return; // когда достигаем оператора ретерн, он закрывакт и работу иф и метода
            }
            System.out.println("i after return = " + i);
        }

        System.out.println("out for");  // никогда не распечатется. цикл заканчивается ретерном по любому
    }
}
