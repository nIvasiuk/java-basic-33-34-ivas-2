package com.berlin.telran.practice.introduction;

import com.berlin.telran.homework.Cat;
import com.berlin.telran.practice.introduction.Dog;

public class Main {
    public static void main(String[] args) {
        // boolean - Логический тип данных представляет только (true, false) - один бит информации: либо истина, либо ложь
        boolean a = false;
        boolean b = true;
        boolean c = true;

        // byte - представляет собой число (-128 to 127) - 8 bits
        byte age = 2;
        String dogAge = "Dog age = ";

        System.out.println(dogAge + age);


        // short - представляет собой число (-32 768 до 32 767) – 16 bits
        short short1 = 2;

        System.out.println("Dog age" + short1);

        // int - представляет собой число (-2147483648 до 2147483647) – 32 bits
        int int1 = 2;


        System.out.println(int1);

        // long – большое целое число (-9223372036854775808 до 9223372036854775807) – 64 bits
        long long1 = 44444444444447L;

        // float - число с плавающей запятой (до 7 десятичных цифр) – 32 bits
        // double - число с плавающей запятой (до 16 десятичных цифр) – 64 bits

        float float1 = 9.87f;
        double double1 = 2.34;

        // char - символ Unicode (от '\u0000' (0) до '\uffff' (65535)) – 16 bits
        // одинарные кавычки '

        char g = 'g';
        char f = 'f';
        char L = 'L';
        char one = '1';

        Dog myDog = new Dog();
        myDog.setBreed("kolli");
        Cat cat = new Cat();
        System.out.println(cat.getName());
        System.out.println(cat.getAge());
        cat.setName("Murka");
        cat.setAge((int) 4.5);
        System.out.println(cat.getName());
        System.out.println(cat.getAge());

        System.out.println(myDog.getBreed());

    }
}