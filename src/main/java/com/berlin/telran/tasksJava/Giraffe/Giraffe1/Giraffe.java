package com.berlin.telran.tasksJava.Giraffe.Giraffe1;

public class Giraffe {


    //создать класс Giraffe и обьявить 5 различных конструкторов
// 1.  самый простой контструктор содержит один параметр name
// 2. конструктор, имеющий name and  age. weight для всех жирафов будет одинаковый
    // 3. В третьем добавляется weight жирафа   name age weight
    // 4.weight, color (name, address, and age неизвестны)
    //5.weight,color, address
    // есть обязательные параметры для конструкторов 2-5 : возраст, вес, цвет.
    // Они присутствуют у всех создаваемых жирафов
    // и есть не обязательные : имя и адрес



    public String name;
    public int age;
    public  int weight;
    public String address;
    public String colour;


    // 1.  самый простой контструктор содержит один параметр name
    public Giraffe (String name) {
        this.name = name;
    }

    // 2. конструктор, имеющий name and  age. weight для всех жирафов будет одинаковый
    public Giraffe (String name, int age) {
        this.name = name;
        this.age = age;
        this.weight = 100;
    }

    // 3. В третьем добавляется weight жирафа   name age weight
    public Giraffe (String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    // 4.weight, color (name, address, and age неизвестны)

    public Giraffe (int weight, String colour) {
        this.weight = weight;
        this.colour = colour;
    }

    //5.weight,color, address

    public Giraffe (int weight, String colour, String address) {
        this.weight = weight;
        this.colour = colour;
        this.address = address;

    }

}
