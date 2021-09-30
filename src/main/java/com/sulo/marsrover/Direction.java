package com.sulo.marsrover;

import java.util.Objects;

public class Direction {

    public static final Direction WEST = new Direction("W");
    public static final Direction NORTH = new Direction("N");
    public static final Direction EAST = new Direction("E");
    public static final Direction SOUTH = new Direction("S");
    private final String direction;

    public Direction(String direction) {
        this.direction = direction;
    }

    public Direction turnRight() {
        return switch (direction) {
            case "W" -> NORTH;
            case "N" -> EAST;
            case "E" -> SOUTH;
            case "S" -> WEST;
            default -> throw new RuntimeException("Wrong Direction!");
        };
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Direction direction1 = (Direction) o;
        return Objects.equals(direction, direction1.direction);
    }

    @Override
    public int hashCode() {
        return Objects.hash(direction);
    }

    public Direction turnLeft() {
        return switch (direction) {
            case "W" -> SOUTH;
            case "S" -> EAST;
            case "E" -> NORTH;
            case "N" -> WEST;
            default -> throw new RuntimeException("Wrong Direction!");
        };
    }
}
