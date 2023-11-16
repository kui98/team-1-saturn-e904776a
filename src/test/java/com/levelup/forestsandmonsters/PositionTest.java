package com.levelup.forestsandmonsters;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

public class PositionTest {
    @Test
    public void positionsCanBeCreatedAndAreNotNull() {
        //arrange
        //act
        Position position=new Position();
        //assert
        assertNotNull(position);
    }
    
}
