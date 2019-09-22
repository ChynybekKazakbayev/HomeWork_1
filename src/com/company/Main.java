package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here


        Lexsus l = new Lexsus(2005,Color.BLASK,1.8, 4);

        System.out.println(l.info());

        l.signal();

        Car car = new Car(2005, Color.BROWN);

        System.out.println(car.info());
        car.signal();

        LexusRX300 lexusRX300 = new LexusRX300(2006,Color.WHITE,2.2,4,5);
        System.out.println(car.info());
        car.signal();
    }

}
