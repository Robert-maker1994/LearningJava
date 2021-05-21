package com.inhearitance;

public class Fish extends Animal {

    private int gills;
    private int eyes;
    private int fins;

    public Fish(String name, int weight,  int size, int gills, int eyes, int fins) {
        super(name, weight, 1, 1, size);
        this.gills = gills;
        this.eyes = eyes;
        this.fins = fins;
    }

    private void moveMuscles() {

    }
    private void moveBackFin() {

    }
    private void swim(int speed) {
        moveMuscles();
        moveBackFin();
        super.move(speed);
    }
}
