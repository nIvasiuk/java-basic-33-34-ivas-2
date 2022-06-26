package com.berlin.telran.homework;

import com.berlin.telran.homework.Cat;

public class Main {
    public static void main(String[] args) {

        Cat myCat = new Cat();
        myCat.setBreed("Tiger");

        System.out.println(myCat.getBreed());

        myCat.setAge(15);

        System.out.println(myCat.getAge());

        myCat.setName("Barsik");

        System.out.println(myCat.getName());

        myCat.setColour("Black");

        System.out.println(myCat.getColour());


        myCat.setHeight(30);

        System.out.println(myCat.getHeight());

        myCat.setWeight(5);

        System.out.println(myCat.getWeight());

        myCat.setEyeColour("Green");

        System.out.println(myCat.getEyeColour());

    }


}
