package com.inhearitance.challange;

public class Focus extends Car {
    private int roadServiceMonths;

    public Focus( int steering) {
        super("Focus", steering, 4, 6, 5, 5, 6, false);
        this.roadServiceMonths = 5;
    }
    public void accelerate(int rate) {
        int newVelocity = getSpeed() + rate;
        if(newVelocity == 0 ) {
            stop();
            changeGear(1);
        } else if (newVelocity >0 && newVelocity <= 10) {
            changeGear(2);
        } else if (newVelocity > 20 && newVelocity <= 30) {
            changeGear(3);
        } else if (newVelocity > 30 && newVelocity <= 40) {
            changeGear(4);
        } else changeGear(5);
        if (newVelocity > 0) {
            changeVelocity(newVelocity, getSteering());
        }
    }
}
