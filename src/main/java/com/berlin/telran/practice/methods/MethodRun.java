package com.berlin.telran.practice.methods;

public class MethodRun {
    public static void main(String[] args) {
        UtilClass.printInt(4);  // .дай мне статичный метод

        UtilClass myClass = new UtilClass();
        myClass.printLong (5); // .дай мне НЕ статичнфй метода
    }
}
