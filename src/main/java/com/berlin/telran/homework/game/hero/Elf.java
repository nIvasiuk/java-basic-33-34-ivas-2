package com.berlin.telran.homework.game.hero;

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

   }
