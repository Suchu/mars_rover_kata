package com.sulo.marsrover;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.*;

public class PlateauTest {

    @Test
    public void returnTrueIfInsideUpperXMax() {
        Plateau plateau = new Plateau(5, 5);
        assertThat(plateau.isInsideUpperXMax(5), is(true));
    }

    @Test
    public void returnFalseIfNotInsideXMax() {
        Plateau plateau = new Plateau(5, 5);
        assertThat(plateau.isInsideUpperXMax(6), is(false));
    }

    @Test
    public void returnTrueIfInsideUpperYMax() {
        Plateau plateau = new Plateau(5, 5);
        assertThat(plateau.isInsideUpperYMax(5), is(true));
    }

    @Test
    public void returnFalseIfNotInsideYMax() {
        Plateau plateau = new Plateau(5, 5);
        assertThat(plateau.isInsideUpperYMax(6), is(false));
    }

    @Test
    public void returnTrueIfInsideLowerXMax() {
        Plateau plateau = new Plateau(5, 5);
        assertThat(plateau.isInsideLowerXMax(1), is(true));
    }

    @Test
    public void returnFalseIfNotInsideLowerXMax() {
        Plateau plateau = new Plateau(5, 5);
        assertThat(plateau.isInsideLowerXMax(0), is(false));
    }



}
