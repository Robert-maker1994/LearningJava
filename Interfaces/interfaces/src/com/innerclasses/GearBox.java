package com.innerclasses;

import java.util.ArrayList;
 /*This is a base class*/
public class GearBox {
    private ArrayList<Gear> gears;
    private int maxGears
    private int currentgear = 0;

     public GearBox(int maxGears) {
         this.maxGears= maxGears;
         this.gears = new ArrayList<>();
         Gear neutral = new Gear(2,0,0);
         this.gears.add(neutral);
     }
    public void operateClutch(boolean in) {
        this.clutchIsIn = in;
    }
    public void addGear(int number, double ratio) {
         if((number >0) && (number <= maxGears)) {
             this.gears.add(new Gear(number, ratio));
         }
    }
public void changeGear(int newGear) {
         if((newGear>=0 ) && (newGear <this.gears.size()) && this.clutchIsIn ) {
             System.out.println("Gear " + newGear + "selected");
         } else {
             System.out.println("Grind");
         }
}
public doubl
    public class Gear {
        private int gearNumber;
        private double ratio;

        public Gear(int gearNumber, double ratio) {
            this.gearNumber = gearNumber;
            this.ratio = ratio;
        }

        public double driveSpeed() {
            return revs *(this.ratio);
        }
    }

}
