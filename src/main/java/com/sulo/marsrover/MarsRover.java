package com.sulo.marsrover;

public class MarsRover {
    private Plateau plateau;
    private final Coordinate coordinate;
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

    protected void move(String moveCommand) {
        if (moveCommand.equalsIgnoreCase("L")) {
            turnLeft();
        } else if (moveCommand.equalsIgnoreCase("R")) {
            turnRight();
        } else if (moveCommand.equalsIgnoreCase("M")) {
            moveForward();
        }
    }

    private void moveForward() {
        if (direction == Direction.WEST) {
            this.coordinate.xCoordinate -= 1;
        } else if (direction == Direction.NORTH) {
            this.coordinate.yCoordinate += 1;
        } else if (direction == Direction.EAST) {
            this.coordinate.xCoordinate += 1;
        } else {
            this.coordinate.yCoordinate -= 1;
        }
    }
}
