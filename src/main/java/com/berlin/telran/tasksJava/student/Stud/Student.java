package com.berlin.telran.tasksJava.student.Stud;

public class Student {

//        Create a class named 'Student' with String variable 'name',
//        integer variable 'age' and String variable "address".

       public String  name;
       public int age;
       public String address;



//                Create two constructors in the class.

//                The first constructor should accept two variables-name and age

       public Student (String name, int age) {
              this.name = name;
              this.age = age;
       }

//                The second should accept three variables -name, age and address.

       public Student (String name, int age, String address) {
              this.name = name;
              this.age = age;
              this.address = address;
       }
}
