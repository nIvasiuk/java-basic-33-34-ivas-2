package com.berlin.telran.practice.variables;

import com.berlin.telran.practice.introduction.Dog;

public class Main {
    public static void main(String[] args) {
        VariablesMain.main2();
        System.out.println("static var = " + VariablesMain.getVar());

        VariablesMain variable1 = new VariablesMain();
        variable1.setVar2(3);
        System.out.println(variable1.getVar2());

        VariablesMain variable2 = new VariablesMain();
        System.out.println(variable2.getVar2());



    }
}
