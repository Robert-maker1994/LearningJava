package com.inhearitance;

public class Main {
    public static void main(String[] args) {

        Animal animal = new Animal(
                "Animal", 1,1, 5, 5
        );

        Dog dog = new Dog(
                "Staff", 5, 5,2,12,"soft",4
        );
        // You are able to get eat from the animal class!
        dog.eat();
    }
}
