package com.company;

import org.w3c.dom.ls.LSOutput;

public class SpeedConverter {

    public static void main(String[] args) {
        toMilesPerHour( 50);
        printConversion(10.25);
    }
    public static long toMilesPerHour (double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            return -1;
        }
        double mile = kilometersPerHour / 1.609;
        long milesPerHour = Math.round(mile);
        System.out.println(milesPerHour);
        return milesPerHour;
    }
    public static void printConversion(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
             System.out.println("Invalid bro");
        }
        double mile = kilometersPerHour / 1.609;
        long milesPerHour = Math.round(mile);
        System.out.println(kilometersPerHour + "km/h = " + milesPerHour + "mi/h");
    }

}
