package com.Poly;

class Car {
    private int doors;
    private Boolean engine;
    private int cylinders;
    private int wheelDrive;
    private int wheels;
    private String name;

    public Car(String name, int cylinders, int wheelDrive, int wheels) {
        this.doors = 4;
        this.engine = true;
        this.cylinders = cylinders;
        this.wheelDrive = wheelDrive;
        this.wheels = wheels;
        this.name = name;
    }


    public int getCylinders() {
        return cylinders;
    }

    public int getWheelDrive() {
        return wheelDrive;
    }
    public void startEngine() {
        System.out.println("Switch on " + Car.this.name);
    }
    public void accelerate() {
        System.out.println("accelrating");
    }
    public void stop() {
        System.out.println("Stopping");
    }

}

class Ford extends Car {
    public Ford(String name, int cylinders, int wheelDrive, int wheels) {
        super(name, cylinders, wheelDrive, wheels);

    }

    @Override
    public void startEngine() {
        super.startEngine();
    }

    @Override
    public void accelerate() {
        super.accelerate();
    }

    @Override
    public void stop() {
        super.stop();
    }

    @Override
    public int getCylinders() {
        return 4;
    }
}

public class Main {
    public static void main(String[] args) {
         Car Ford = new Ford("focus", 4, 3, 4);

        Ford.startEngine();
        Porche porche = new Porche("shit", 7,3,4);

        porche.startEngine();

    }
}
