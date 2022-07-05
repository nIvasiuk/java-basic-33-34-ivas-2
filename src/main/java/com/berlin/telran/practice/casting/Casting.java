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

    }
}
