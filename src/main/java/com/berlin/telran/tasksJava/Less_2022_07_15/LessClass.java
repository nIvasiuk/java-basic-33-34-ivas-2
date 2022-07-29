package com.berlin.telran.tasksJava.Less_2022_07_15;

public class LessClass {



    // 1. Напимпть метод, принимающий и возвразающий строку "Hello <name> !"
    // public String helloName(String <name>) -> "Hello <name> !"

    public String nello = "Hello ";
    public String name;
    public String end = " !";

    public String helloName(String hello, String name, String end){
        String result1 = hello + name + end;
        return result1;
    }

    // 2. Написать метод, принимающий две строки и возвращающий их в таком виде:
    // public String joinString(String a String b) -> abba

    public String joinString(String a, String b){
        String joinString = a + b + b + a;
        return joinString;

    }

    //3. Написать метод, возвращающий первые два символа строки заглавными буквами
    // (hello->HE)

public String catName(String name){
        String catName = name.substring(0, 2).toUpperCase()
                ;
        return catName;
//
}




}
