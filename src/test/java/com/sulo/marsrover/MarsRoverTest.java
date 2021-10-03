package com.sulo.marsrover;

import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.*;

public class MarsRoverTest {

    private final int defaultCoordinateX = 5;
    private final int defaultCoordinateY = 5;

    @ParameterizedTest
    @CsvSource({"0, 0", "1, 2", "2, 3", "3, 2", "3, 3"})

    public void returnFalseIfPositionIsDifferent(int xPosition, int yPosition) {
        MarsRover rover = new MarsRover(new Coordinate(defaultCoordinateX, defaultCoordinateY), Direction.NORTH);
        assertThat(rover.isPosition(xPosition, yPosition), is(false));
    }

    @Test
    public void returnTrueIfPositionIsTheSame() {
        MarsRover rover = new MarsRover(new Coordinate(defaultCoordinateX, defaultCoordinateY), Direction.NORTH);
        assertThat(rover.isPosition(5, 5), is(true));
    }

    @Test
    public void returnTrueIfDirectionIsNorthOtherwiseFalse() {
        MarsRover rover = new MarsRover(new Coordinate(defaultCoordinateX, defaultCoordinateY), Direction.NORTH);
        assertThat(rover.isDirection(Direction.NORTH), is(true));
        assertThat(rover.isDirection(Direction.EAST), is(false));
        assertThat(rover.isDirection(Direction.WEST), is(false));
        assertThat(rover.isDirection(Direction.SOUTH), is(false));
    }

    @Test
    public void returnTrueIfDirectionIsEastOtherwiseFalse() {
        MarsRover rover = new MarsRover(new Coordinate(defaultCoordinateX, defaultCoordinateY), Direction.EAST);
        assertThat(rover.isDirection(Direction.EAST), is(true));
        assertThat(rover.isDirection(Direction.NORTH), is(false));
        assertThat(rover.isDirection(Direction.WEST), is(false));
        assertThat(rover.isDirection(Direction.SOUTH), is(false));
    }

    @Test
    public void whenLeftCommandGiven() {
        MarsRover rover = new MarsRover(new Coordinate(defaultCoordinateX, defaultCoordinateY), Direction.NORTH);
        rover.move("L");
        assertThat(rover.isDirection(Direction.WEST), is(true));
    }

    public void whenRightCommandGiven() {
        MarsRover rover = new MarsRover(new Coordinate(defaultCoordinateX, defaultCoordinateY), Direction.EAST);
        rover.move("R");
        assertThat(rover.isDirection(Direction.SOUTH), is(true));
    }
}
