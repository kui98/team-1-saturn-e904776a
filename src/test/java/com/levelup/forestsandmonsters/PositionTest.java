package com.levelup.forestsandmonsters;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

public class PositionTest {
    @Test
    public void positionsCanBeCreatedAndAreNotNull() {
        // arrange
        // act
        Position position = new Position();
        // assert
        assertNotNull(position);
    }

    @Test
    public void theStartingPostionOfXIs5() {
        // arrange
        // act
        Position position = new Position();
        // assert
        assertEquals(position.getX(), 5);

    }

    @Test
    public void theStartingPostionOfYIs5() {
        // arrange
        // act
        Position position = new Position();
        // assert
        assertEquals(position.getY(), 5);

    }

    @Test
    public void whenISetYItChanges() {
        // arrange
        Position position = new Position();
        // act
        position.setY(9);
        // assert
        assertEquals(position.getY(), 9);


    }
     @Test
    public void whenISetXItChanges() {
        // arrange
        Position position = new Position();
        // act
        position.setX(9);
        // assert
        assertEquals(position.getX(), 9);

    }
}

