package com.berlin.telran.tasksJava.Giraffe;

import com.berlin.telran.tasksJava.Giraffe.Giraffe1.Giraffe;

public class Main {
    public static void main(String[] args) {

//        создать класс Giraffe и обьявить 5 различных конструкторов
//// 1.  самый простой контструктор содержит один параметр name
//// 2. конструктор, имеющий name and  age. weight для всех жирафов будет одинаковый
//        // 3. В третьем добавляется weight жирафа   name age weight
//        // 4.weight, color (name, address, and age неизвестны)
//        //5. weight,color, address
//
//        //есть обязательные параметры для конструкторов 2-5 : возраст, вес,цвет.
//        // Они присутствуют у всех создаваемых жирафов
//        // и есть не обязательные : имя и адрес


        Giraffe giraffe1 = new Giraffe("John");
        System.out.println("Girafe 1: ");
        System.out.println(" name : " + giraffe1.name);

        Giraffe giraffe2 = new Giraffe("Jack", 4);
            System.out.println("Girafe 2: ");
            System.out.println(" name: "+ giraffe2.name + ", " +
                    " age: " + giraffe2.age + ", " +
                    " weight: " + giraffe2.weight + ", " +
                    " colour: " + giraffe2.colour + ", " +
                    " aderess: " + giraffe2.address);

        Giraffe giraffe3 = new Giraffe("Mary", 5, 60);
        System.out.println("Girafe 3: ");
            System.out.println("name: "+ giraffe3.name + ", " +
                " age: " + giraffe3.age + ", " +
                " weight: " + giraffe3.weight + ", " +
                " colour: " + giraffe3.colour);

        Giraffe giraffe4  = new Giraffe(300,"Red");
        System.out.println("Girafe 4: ");
        System.out.println(" name: "+ giraffe4.name + ", " +
                " weight: " + giraffe4.weight + ", " +
                " colour: " + giraffe3.colour + ", " +
                " age: " + giraffe4.age);

        Giraffe giraffe5 = new Giraffe(150,"Green", "Berlin Zoo");
            System.out.println("Girafe 5: ");
        System.out.println(
                " weight: " + giraffe4.weight + ", " +
                " colour: " + giraffe3.colour + ", " +
                " age: " + giraffe4.age + ", " +
                " address: " + giraffe5.address);
    }
}
