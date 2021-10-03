package com.sulo.marsrover;

public class MarsRover {
    private Coordinate coordinate;
    private Direction direction;

    protected MarsRover(Coordinate coordinate, Direction direction) {
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

    private void moveForward() {
        if (direction == Direction.WEST)  {
            this.coordinate.xCoordinate -= 1;
        } else if (direction == Direction.EAST) {
            this.coordinate.xCoordinate += 1;
        } else if (direction == Direction.NORTH) {
            this.coordinate.yCoordinate += 1;
        }else {
            this.coordinate.yCoordinate -= 1;
        }
    }

    protected void  move(String moveCommand) {
        if (moveCommand.equalsIgnoreCase("L")) {
            turnLeft();
        } else if (moveCommand.equalsIgnoreCase("R")) {
            turnRight();
        } else {
            moveForward();
        }
    }
}
