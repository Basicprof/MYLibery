package com.javarush.task.task29.task2909.car;

public class Cabriolet extends Car {
    public Cabriolet(int numberOfPassengers) {
        super(numberOfPassengers);
    }

    public Cabriolet(int type, int numberOfPassengers) {
        super(type, numberOfPassengers);
    }

    @Override
    public int getMaxSpeed() {
        return MAX_CABRIOLET_SPEED;
    }
}
