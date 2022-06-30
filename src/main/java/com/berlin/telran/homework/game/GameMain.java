package com.berlin.telran.homework.game;

import com.berlin.telran.homework.game.hero.Elf;

public class GameMain {
    public static void main(String[] args) {
        Elf elf1 = new Elf();

        Elf elf2 = new Elf(2);

        Elf elf3 = new Elf(3);

        Elf elf4 = new Elf(4);

     //  Elf elf3 = new Elf(3, 5, 10, 10)
        System.out.println(elf2.getId());

    }


}
