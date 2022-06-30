package com.berlin.telran.practice.number_system;

public class NumberSystem {
    public static void main(String[] args) {
        int a = 0b11110100;   // binary format 0b.....(0-2)

        int b = 0364; // okto format prefix 0.....(0-7)

        int c = 244; // decimal format .... (0-9)

        int d = 0xF4; // hex format prefix 0x ..... (0-9,A,B,C,D,E)

     //   String s = "0x141D12";
// char, doubl, long, float, short
        // byte = -127    +127
        // int = -214......    +214....    2

//        String s1 = Integer.toHexString(c);
//        System.out.println( "int to hex = " + Integer.toHexString(0b11));
//        System.out.println( "int to hex = " + Integer.toHexString(b));


        System.out.println("Binary =" + a);
        System.out.println("Okto =" + b);
        System.out.println("Decimal =" + c);
        System.out.println("Hex =" + d);
        //System.out.println("String Hex =" + s);

    }
}
