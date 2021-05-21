package com.inhearitance;

public class Dog extends Animal {

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;


    public Dog(
            String name, int weight ,  int size, int eyes
            ,int teeth, String coat, int legs
            ) {
        super(name, weight, 1, 1, size);
        this.eyes = eyes;
        this.coat = coat;
        this.tail = tail;
        this.teeth = teeth;
        this.legs = legs;

    }
    private void chew() {
        System.out.println("Dog chewing");
    }

    @Override
    public void eat() {
        System.out.println("Dog chewing");
        chew();
        super.eat();
    }

}
