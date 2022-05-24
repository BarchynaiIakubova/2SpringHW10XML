package org.example;

public class Panda implements Animal{
    private String name;
    private String color;
    private int age;

    @Override
    public String animalPlus() {
        return "favorite animal is: " + name;
    }

    @Override
    public void animalMinus() {
        System.out.println("Panda's animal minus method is working");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
