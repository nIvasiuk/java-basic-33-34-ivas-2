package com.berlin.telran.practice.set_get_veriables;

public class Data {
    private static int id = 1;

    public static int getId() {
        return id++; // id++ - increment
        // or ++id - preincrement
    }
}
