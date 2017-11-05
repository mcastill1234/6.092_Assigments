package com.examples;

public class GravityCalculator {
    public static void main(String[] arguments){
        double time = 10; // Time in seconds
        double accel = -9.81; // Greavity in m/s^2
        double speed = 0; // speed in m/s
        double initpos = 0; // initial position
        double position = 0; // position in m/s
        position = 0.5*accel*time*time + speed*time + initpos;
        System.out.println("An object' position after " + time + "seconds is " + position + "m");
    }
}
