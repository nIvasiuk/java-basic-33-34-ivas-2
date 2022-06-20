package com.berlin.telran.practicesecond;

public class Main {
    public static void main(String[] args) {

        Cat myCat = new Cat();
        
        // для большей упорядоченности кода я бы разделил код
        // в первой части - только задание параметров, во второй - только чтение.
        // это облегчит чтение и понимание того, какой код был создан
        
        // Set parameters
        myCat.setBreed("Tiger");
        myCat.setAge(15);
        myCat.setName("Barsik");
        myCat.setColour("Black");
        myCat.setHeight(30);
        myCat.setWeight(5);
        myCat.setEyeColour("Green");
        
        // Print parameters
        System.out.println(myCat.getBreed());
        System.out.println(myCat.getAge());
        System.out.println(myCat.getName());
        System.out.println(myCat.getColour());
        System.out.println(myCat.getHeight());
        System.out.println(myCat.getWeight());
        System.out.println(myCat.getEyeColour());
        
        }
}
