package com.berlin.telran.practice.methods;

import com.berlin.telran.homework.game.hero.Elf;

public class UtilClass {
//    public static void main(String[] args) {
//        int idx = 1;
//    }

    /*
    синтаксис метода
    <модификатор> <static - опция> <тип данных или ничего(void)>

    <static - опция> - есть -> можем обращаться без создания экземпляра класса.
    .............. опция -> обращаемся (получаем доступ) через создание экземпляра класса (объекта, через 'new').
     */

    public static void printInt (int num) {
        num = num + 1;                             // num++ (add 1)
        String res = String.valueOf(num);  // интродьюсим инт в стринг
        System.out.println("result = " + res);
    }

    public void printLong (long num){
        String res = String.valueOf(num);
        System.out.println(res);
        printDouble(num);

    }

    private void printDouble(double num){
        String res = String.valueOf(num);
        System.out.println("result double = " + res);
    }

   protected void printBoolean(boolean isNum){
       String res = String.valueOf(isNum);
       System.out.println("result boolean = " + res);
   }


    void printChar(char ch) {
        String res = String.valueOf(ch);
        System.out.println("result char = " + res);
    }

    public int getSum(int num1, int num2) {
        int res = num1 + num2;

        Elf elf = new Elf();
        int elfLevel = elf.getLevel();

        int resLevelElf = res + elfLevel;

        return resLevelElf;
    }

}
