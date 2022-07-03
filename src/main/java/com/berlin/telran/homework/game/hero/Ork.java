package com.berlin.telran.homework.game.hero;

import com.berlin.telran.homework.game.constsnt.Constant;

public class Ork {

    private long id;
    private String name;
    private boolean gender;
    private int level;
    private int fortune;
    private String armor;


    private int power;
    private int charisma;
    private int magic;

    public Ork () {

    }

public Ork (long id) {
        this.id = id;
        this.power = Constant.ORK_POWER;
        this.charisma = Constant.ORK_CHARISMA;
        this.magic = Constant.ORK_MAGIC;

}

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getFortune() {
        return fortune;
    }

    public void setFortune(int fortune) {
        this.fortune = fortune;
    }

    public String getArmor() {
        return armor;
    }

    public void setArmor(String armor) {
        this.armor = armor;
    }
}
