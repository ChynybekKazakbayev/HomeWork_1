package com.company;

public class Lexsus extends Car {
    private double volume;
    private int wheel;


    public Lexsus(int year, Color color, double volume, int wheel) {
        super(year, color);
        this.volume = volume;
        this.wheel = wheel;
    }

    public double getVolume() {
        return volume;
    }

    public int getWheel() {
        return wheel;
    }

    @Override
    public final String info() {
        return super.info() +" "+ getVolume() + " " + getWheel();
    }

    @Override
    public void signal() {
        super.signal();
        System.out.println("joldon kach");
    }
}
