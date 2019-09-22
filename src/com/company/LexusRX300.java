package com.company;

public final class LexusRX300 extends Lexsus {
    private int seat;

    public LexusRX300(int year, Color color, double volume, int wheel, int seat) {
        super(year, color, volume, wheel);
        this.seat = seat;
    }

    @Override
    public void signal() {
        super.signal();
        System.out.println("bip");
    }
}
