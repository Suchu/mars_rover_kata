package com.sulo.marsrover;

import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.*;

public class MarsRoverTest {

    private final int defaultCoordinateX = 1;
    private final int defaultCoordinateY = 2;

    private final Plateau plateau = new Plateau(5, 5);
    private final Coordinate coordinate = new Coordinate(defaultCoordinateX, defaultCoordinateY);

    @ParameterizedTest
    @CsvSource(
            {"0, 0", "2, 2", "2, 3", "3, 2", "5, 5"})
    public void returnFalseIfPositionIsDifferent(int xPosition, int yPosition) {
        MarsRover rover = new MarsRover(plateau, coordinate, Direction.NORTH);
        assertThat(rover.isPosition(xPosition, yPosition), is(false));
    }

    @Test
    public void returnTrueIfPositionIsTheSame() {
        MarsRover rover = new MarsRover(plateau, coordinate, Direction.NORTH);
        assertThat(rover.isPosition(1, 2), is(true));
    }

    @Test
    public void returnTrueIfDirectionIsNorthOtherwiseFalse() {
        MarsRover rover = new MarsRover(plateau, coordinate, Direction.NORTH);
        assertThat(rover.isDirection(Direction.NORTH), is(true));
        assertThat(rover.isDirection(Direction.EAST), is(false));
        assertThat(rover.isDirection(Direction.WEST), is(false));
        assertThat(rover.isDirection(Direction.SOUTH), is(false));
    }

    @Test
    public void returnTrueIfDirectionIsEastOtherwiseFalse() {
        MarsRover rover = new MarsRover(plateau, coordinate, Direction.EAST);
        assertThat(rover.isDirection(Direction.EAST), is(true));
        assertThat(rover.isDirection(Direction.NORTH), is(false));
        assertThat(rover.isDirection(Direction.WEST), is(false));
        assertThat(rover.isDirection(Direction.SOUTH), is(false));
    }

    @Test
    public void whenLeftCommandGiven() {
        MarsRover rover = new MarsRover(plateau, coordinate, Direction.NORTH);
        rover.move("L");
        assertThat(rover.isDirection(Direction.WEST), is(true));
    }

    @Test
    public void whenRightCommandGiven() {
        MarsRover rover = new MarsRover(plateau, coordinate, Direction.EAST);
        rover.move("R");
        assertThat(rover.isDirection(Direction.SOUTH), is(true));
    }

    @Test
    public void returnTrueIfForwardToWestChangeXCoordinate() {
        MarsRover rover = new MarsRover(plateau, coordinate, Direction.WEST);
        rover.move("M");
        assertThat(rover.isPosition(0, 2), is(true));
    }

    @Test
    public void returnTrueIfForwardToNorthChangeXCoordinate() {
        MarsRover rover = new MarsRover(plateau, coordinate, Direction.NORTH);
        rover.move("M");
        assertThat(rover.isPosition(1, 3), is(true));
    }

    @Test
    public void returnTrueIfForwardToEastChangeXCoordinate() {
        MarsRover rover = new MarsRover(plateau, coordinate, Direction.EAST);
        rover.move("M");
        assertThat(rover.isPosition(2, 2), is(true));
    }

    @Test
    public void returnTrueIfForwardToSouthChangeXCoordinate() {
        MarsRover rover = new MarsRover(plateau, coordinate, Direction.SOUTH);
        rover.move("M");
        assertThat(rover.isPosition(1, 1), is(true));
    }
}
