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
    //age, weight - constants


    public String name;
public int age;
public int weight;
    public String address;
    public String colour;

    public Giraffe (String name) {
        this.name=name;

    }

    public Giraffe (String name, int age) {
        this.name=name;
        this.age=age;

        this.weight=100;
        this.colour="yellow";

    }
}
