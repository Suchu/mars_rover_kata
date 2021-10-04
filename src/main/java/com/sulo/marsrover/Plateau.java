package com.sulo.marsrover;

public class Plateau {

    public final int LOWER_LIMIT = 1;
    private int xMax;
    private int yMax;

    public Plateau(int xMax, int yMax) {
        this.xMax = xMax;
        this.yMax = yMax;
    }

    public boolean isInsideUpperXMax(int xCoordinate) {
        return xCoordinate <= xMax;
    }

    public boolean isInsideUpperYMax(int yCoordinate) {
        return yCoordinate <= yMax;
    }

    public boolean isInsideLowerXMax(int xCoordinate) {
        return xCoordinate >= LOWER_LIMIT;
    }
}
