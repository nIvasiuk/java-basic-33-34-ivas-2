package com.berlin.telran.tasksJava.student;

import com.berlin.telran.tasksJava.student.Stud.Student;

public class MainStudent {
    public static void main(String[] args) {

        //        In method main of the class Main create two objects of the class Student.
//        One object with name and age and the other having name, age and address.

        Student einstein = new Student("Einstein", 20);
        System.out.println("Student 1 :");
        System.out.println("name " + einstein.name + ", age " + einstein.age);


        Student maria = new Student("Maria Curie", 22, "France");
        System.out.println("Student 2 :");
        System.out.println("name " + maria.name + ", age " + maria.age + ", address: " + maria.address );
    }
}
