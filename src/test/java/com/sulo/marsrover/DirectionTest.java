package com.sulo.marsrover;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.*;


public class DirectionTest {

    @ParameterizedTest
    @CsvSource(
            {"W, N", "N, E", "E, S", "S, W"})
    public void turnRightFollowingCompassPoints(String startingPoint, String finalPoint) {
        Direction point = new Direction(startingPoint);
        Direction expectedPoint = new Direction(finalPoint);
        Direction actualPoint = point.turnRight();

        assertThat(actualPoint, equalTo(expectedPoint));
    }

    @ParameterizedTest
    @CsvSource(
            {"W, S", "S, E", "E, N", "N, W"})
    public void turnLeftFollowingCompassPoints(String startingPoint, String finalPoint) {
        Direction point = new Direction(startingPoint);
        Direction expectedPoint = new Direction(finalPoint);
        Direction actualPoint = point.turnLeft();

        assertThat(actualPoint, equalTo(expectedPoint));
    }
}
