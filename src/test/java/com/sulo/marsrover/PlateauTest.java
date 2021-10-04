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
}
