package com.berlin.telran.practice.number_system;

public class NumberSystem {
    public static void main(String[] args) {
        int a = 0b11;   // binary format 0b.....(0-2)

        int b = 01234; // okto format prefix 0.....(0-7)

        int c = 4569; // decimal format .... (0-9)

        int d = 0x141D12; // hex format prefix 0x ..... (0-9,A,B,C,D,E)

        System.out.println("Binary =" + a);
        System.out.println("Okto =" + b);
        System.out.println("Decimal =" + c);
        System.out.println("Hex =" + d);

    }
}
