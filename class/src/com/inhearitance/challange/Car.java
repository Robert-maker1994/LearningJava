package com.inhearitance.challange;

public class Car  extends Vechicle {
    private int wheels;
    private int doors;
    private int gears;
    private boolean isManual;
    private String name;

    private int currentGear;

    //Constroctor
    public Car( String name, int steering, int gears, int speed, int wheels, int doors, int gears1, boolean isManual) {
        super(steering, gears, speed);
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears1;
        this.isManual = isManual;
        this.currentGear = 1;
        this.name = name;
    }
    public void changeGear(int currentGear) {
        this.currentGear = currentGear;
        System.out.println("Car.setCurrentGear(): Changed to " + this.currentGear + " Gear");
    }

    public void changeVelocity(int speed, int direction) {

        System.out.println("Car.changeVelocity() : Velocity " + speed + " direction " + direction);

        move(speed, direction);
    }

    @Override
    //This overrides the vechicle class!
    public void stop() {
        super.stop();
    }
}
