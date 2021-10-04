package com.sulo.marsrover;

public class Plateau {

    public static final int LOWER_LIMIT = 0;
    private final int xMax;
    private final int yMax;

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

    public boolean isInsideLowerYMax(int yCoordinate) {
        return yCoordinate >= LOWER_LIMIT;
    }

    public int getXMax() {
        return xMax;
    }

    public int getYMax() {
        return yMax;
    }
}
