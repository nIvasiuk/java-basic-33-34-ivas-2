package com.berlin.telran.practice.set_get_veriables;

public class Test {
    public static void main(String[] args) {
        Minimarket edeca = new Minimarket(Data.getId());

        Supermarket edeca2 = new Supermarket(Data.getId()); //take from class Data

        edeca.setCompany("Edeka");
        edeca2.setCompany("Edeka2");



        System.out.println(edeca.getCompany());
        System.out.println(edeca.getIdM());


        System.out.println(edeca2.getCompany());
        System.out.println(edeca2.getIdS());





    }
}
