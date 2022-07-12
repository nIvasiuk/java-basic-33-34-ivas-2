package com.berlin.telran.practice.string;

import com.berlin.telran.homework.game.hero.Elf;

public class MainString {
    public static void main(String[] args) {

//        double d = 4.5;
//        Double f = 4.5;
//
//        int n = 3;
//        Integer num = 3;
//
//        test(n);
//
//        String name;
//        Elf hero;
//
//
//        name = "Aleks"; // create new String


//        hero = new Elf();
//
//        System.out.println(hero);
//
//        Elf elf2 = new Elf();


//        System.out.println(elf2);
//
//
//        String str1 = "str1";
//        String str2 = str1;
//        str2 = "r";
//        str1.charAt(0);
//
//        String cat = "Myrka";
//        String friend = cat + "my friend";
//        System.out.println(friend);
//        System.out.println(cat.charAt(0));
//        System.out.println(cat);
//
//        String dog = new String("dog");
//int length = cat.length();
//        System.out.println("length st = " + length);
//
//        System.out.println(cat.charAt(3));

        // String s1 = "telran";
//        String s1 = "telran I study here";
//        System.out.println(s1.substring(2, 4));
//        System.out.println(s1.substring(2));
//        System.out.println(s1.substring(3, 5));
//        System.out.println(s1.substring(0, 3));
//
//        //  lr
//        //  lran
//        //  ra
//        // tel
//        System.out.println(s1.length());
//        int length = s1.length();
//        System.out.println(s1.substring(length-3, length));
//
        // 19
        //ere


        String s1 = "abc";
        String s2 = "abc";

        // проверяем равенство
        if (s1 == s2) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        String s3 = new String("abc");
        String s4 = new String("abc");


        // сравниваем ссылки через ==
        if (s3 == s4) {
            System.out.println("YES");
        } else {
            System.out.println("NO");

        }

        // сравниваем обекты через equals

        if (s3.equals(s4)) {
            System.out.println("YES equals");
        } else {
            System.out.println("NO equals");

        }
 // просто слепили
        String number = "12";
        System.out.println("number = " + number + 1);

        // мат операция
        int intNum = Integer.parseInt(number);
        int res = intNum + 1;
        System.out.println("int result = " + res);

        // вызываем строку (через точку -  статически клас,
        // вызываем без создания класса)
        String strRes = String.valueOf(res);
        System.out.println(strRes);

        String strRes2 = Integer.toString(res);

        if (strRes == strRes2) {
            System.out.println("YES res");
        } else {
            System.out.println("NO res");

        }

        if (strRes.equals(strRes2)) {
            System.out.println("YES res equals");
        } else {
            System.out.println("NO res equals");

        }

    } }
//
//    public static void test(int l) {
//        // created new int l = 3;
//        int l2 = l;
//      //  System.out.println(l2);
//    }
//
//    public static void test(float l) {
//        // created new int l = 3;
//    //    System.out.println(l);
//    }
// }