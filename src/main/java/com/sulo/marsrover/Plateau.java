package com.sulo.marsrover;

public class Plateau {

    private int xMax;
    private int yMax;

    public Plateau(int xMax, int yMax) {
        this.xMax = xMax;
        this.yMax = yMax;
    }

    public boolean isInsideUpperXMax(int xCoordinate) {
        return xCoordinate <= xMax;
    }
}
