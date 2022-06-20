package com.berlin.telran.practicesecond;

public class Cat {
    //  Для большей защиты требуется определить свойства как private
    private String breed;
    private int age;
    private String name;
    private String colour;
    private int height;
    private int weight;
    private String eyeColour;

    // задание значения должно быть через this, означающее экземпляр класса
    public void setBreed(String text) {
        this.breed = text;
    }
    
    // возврат значения экземпляра тоже через this
    public String getBreed() {
        return this.breed;
    }

    public void setAge(int number) {
        this.age = number;
    }

    public int getAge() {
        return this.age;
    }

    public void setName(String text) {
        this.name = text;
    }

    public String getName() {
        return this.name;
    }

    public void setColour(String text) {
        this.colour = text;
    }

    public String getColour() {
        return this.colour;
    }

    public void setHeight(int number) {
        this.height = number;
    }

    public int getHeight() {
        return this.height;
    }

    public void setWeight(int number) {
        this.weight = number;
    }

    public int getWeight() {
        return this.weight;
    }


    public void setEyeColour(String text) {
        this.eyeColour = text;
    }

    public String getEyeColour() {
        this.return eyeColour;
    }

}

