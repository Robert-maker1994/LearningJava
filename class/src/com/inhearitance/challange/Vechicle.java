package com.inhearitance.challange;

import com.company.Car;
// Challenge.
// Start with a base class of a Vehicle, then create a Car class that inherits from this base class.
// Finally, create another class, a specific type of Car that inherits from the Car class.
// You should be able to hand steering, changing gears, and moving (speed in other words).
// You will want to decide where to put the appropriate state and behaviours (fields and methods).
// As mentioned above, changing gears, increasing/decreasing speed should be included.
// For you specific type of vehicle you will want to add something specific for that type of car.

public class Vechicle {

    private int steering;
    private int gears;
    private int speed;

    private int currentSpeed;
    private int currentDirection;

// Setting the constructor
    public Vechicle(int steering, int gears, int speed) {
        this.steering = steering;
        this.gears = gears;
        this.speed = speed;

            this.currentDirection = 0;
            this.currentSpeed = 0;
    }
     public void steer(int direction) {
        this.currentDirection += direction;
         System.out.println("Vehicle.steer(): Steering at " + currentDirection + "degrees");
    }
    public void move(int velocity, int direction) {
        currentDirection = direction;
        currentSpeed = velocity;
        System.out.println("Vehicle.move():  Moving at " + currentSpeed + "in direction "+ currentDirection);
    }
    public void stop() {
        currentSpeed = 0;
        System.out.println("You have come to a stop");


    }


    public int getSteering() {
        return steering;
    }

    public void setSteering(int steering) {
        this.steering = steering;
    }

    public int getGears() {
        return gears;
    }

    public void setGears(int gears) {
        this.gears = gears;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}

