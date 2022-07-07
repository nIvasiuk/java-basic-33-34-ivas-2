package com.berlin.telran.practice.casting;

public class Casting  {
    public static void main(String[] args) {
       //  int a = 5;
        // byte b = (byte) a; // явное преобоазование

        //automatic type conversion
       int i = 100;
       //automatic type conversion
       long l = i;

       float f = l;

       System.out.println("int value = " + i);
       System.out.println("long value = " + l);
        System.out.println("float value = " + f);

        int a = 5;
        byte b = (byte) a; // -128 -> 127
        System.out.println(b);

        a = 258;  // 00000000 00000000 00000001 00000010  - четыре байта = так представленно в пк в бинари коде
        b = (byte) a; // -> 00000010  = 8 bit
        System.out.println(b);

        double d = 74.9867;
        int e = (int) d;
        System.out.println(e);

        double d1 = 74.9867;
        int e1 = (int) Math.round(d1);
        System.out.println(e1);





    }
}
