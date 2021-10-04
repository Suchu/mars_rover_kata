package com.sulo.marsrover;

public class MarsRover {
    private Plateau plateau;
    private Coordinate coordinate;
    private Direction direction;

    protected MarsRover(Plateau plateau, Coordinate coordinate, Direction direction) {
        this.coordinate = coordinate;
        this.direction = direction;
    }

    protected boolean isPosition(int positionX, int positionY) {
        return coordinate.xCoordinate == positionX && coordinate.yCoordinate == positionY;
    }

    protected boolean isDirection(Direction direction) {
        return this.direction.equals(direction);
    }

    private void turnLeft() {
        direction = direction.turnLeft();
    }

    private void turnRight() {
        direction = direction.turnRight();
    }

    protected void  move(String moveCommand) {
        if (moveCommand.equalsIgnoreCase("L")) {
            turnLeft();
        } else if (moveCommand.equalsIgnoreCase("R")) {
            turnRight();
        }
    }
}
