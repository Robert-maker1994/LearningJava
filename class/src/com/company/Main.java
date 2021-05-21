package com.company;

public class Main {

    public static void main(String[] args) {
        Car porsche  = new Car();
        Car Tesla = new Car();
        System.out.println("Model is " + Tesla.getModel());

        Tesla.setModel("modal11");
        System.out.println("Model is " + Tesla.getModel());


    }
}
