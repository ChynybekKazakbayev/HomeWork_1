package com.company;

public class Car {
    private int year;
    private Color color;

    public Car(int year, Color color) {
        this.year = year;

        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }



    public String info () {
        return getColor() + " " + getYear();

    }
    public void signal () {
        System.out.println("bi-bip");
    }



}
