package com.berlin.telran.homework.game.hero;

import com.berlin.telran.homework.game.constsnt.Constant;

public class Elf {

    private long id;
    private String name;
    private boolean gender;
    private int level;
    private int fortune;
    private String armor;

    private int power;
    private int charisma;
    private int magic;


    public Elf() {
    }

    //default constructor

    public Elf(long id) {
        this.id = id;
        this.power = Constant.ELF_POWER;
        this.charisma = Constant.ELF_CHARISMA;
        this.magic = Constant.ELF_MAGIC;
    }
//constructor with parameters


//    public Elf(long id, int power, int charisma, int magic) {
//        this.id = id;
//        this.power = power;
//        this.charisma = charisma;
//        this.magic = magic;
//    }

    public long getId() {
        return id;
    }

    public String getName()
    {
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

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getCharisma() {
        return charisma;
    }

    public void setCharisma(int charisma) {
        this.charisma = charisma;
    }

    public int getMagic() {
        return magic;
    }

    public void setMagic(int magic) {
        this.magic = magic;
    }
}
