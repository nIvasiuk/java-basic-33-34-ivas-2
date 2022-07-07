package com.berlin.telran.practice.casting;

public class Casting  {
    public static void main(String[] args) {
//       //  int a = 5;
//        // byte b = (byte) a; // явное преобоазование
//
//        //automatic type conversion
//       int i = 100;
//       //automatic type conversion
//       long l = i;
//
//       float f = l;
//
//       System.out.println("int value = " + i);
//       System.out.println("long value = " + l);
//        System.out.println("float value = " + f);
//
//        int a = 5;
//        byte b = (byte) a; // -128 -> 127
//        System.out.println(b);
//
//        a = 258;  // 00000000 00000000 00000001 00000010  - четыре байта = так представленно в пк в бинари коде
//        b = (byte) a; // -> 00000010  = 8 bit
//        System.out.println(b);
//
//        double d = 74.9867;
//        int e = (int) d;
//        System.out.println(e);
//
//        double d1 = 74.9867;
//        int e1 = (int) Math.round(d1);
//        System.out.println(e1);
//
//

//            int a = 3;
//            double b = 4.7;
//            double c = a + b;
//
//            System.out.println("double = " + c);
//
//            int s = 3;
//            float f = 4.7f;
//            float res = s + f;
//        System.out.println("float = " + res);
//
//        float w = 5.6f;
//        double g = 3.5;
//        double h = w + g; // float h = (float) (w + g);
//
//        System.out.println("float -> doubel = " + h);
//
//        int r = 7;
//        long l = 10;
//        long j = r + l;
//
//        System.out.println("long = "  + j);
//
//
//        int k = 6;
//        float fg = 45.3f;
//        long df = 5;
//        double ty = 4.5;
//        double de = k +fg+df+ty;
//
//        byte rt = 34;
//        short st = 67;
//        int sg = rt + st;

            char a = 'a';
            String b = "a";

            int c = a + 5;
        System.out.println("char = " +c);

        char ch = '3'; // ch = 51 (accordin  ASCII table)
        System.out.println("char value + " + ch);

        int f = ch - '0'; // 51-48 (accordin  ASCII table)
        System.out.println("int value = " + f);

        // valueOf()

        int r = Integer.parseInt(String.valueOf(ch));
        System.out.println("int value from method valueOf() = " +r);




    }
}
