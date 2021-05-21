package com.inhearitance;

public class Animal {

    private String name;
    private int weight;
    private int brain;
    private int body;
    private int size;

    public Animal(String name, int weight, int brain, int body, int size) {
        this.name = name;
        this.weight = weight;
        this.brain = brain;
        this.body = body;
        this.size = size;
    }

    public void eat() {
        System.out.println("eating");
    }

    public void move(int speed) {

    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public int getBrain() {
        return brain;
    }

    public int getBody() {
        return body;
    }

    public int getSize() {
        return size;
    }
}
