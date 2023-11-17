package com.levelup.forestsandmonsters;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

import com.levelup.GameMap;
import com.levelup.forestsandmonsters.GameController.DIRECTION;

public class GameMapTest {
    @Test 
    public void gameMapIsCreatable() {
        GameMap TestGameMap = new GameMap();
        assertNotNull(TestGameMap);
    }
    @Test
    public void iCanGetMoveCount() {
        GameMap TestGameMap = new GameMap();
        assertEquals(TestGameMap.getMoveCount(),0);
        
    }

    @Test
    public void iCanGetMinOfX() {
        GameMap TestGameMap = new GameMap();
        assertEquals(TestGameMap.getMinOfX(),0);
        
    }

     @Test
    public void iCanGetMinOfY() {
        GameMap TestGameMap = new GameMap();
        assertEquals(TestGameMap.getMinOfY(),0);
        
    }
    
     @Test
    public void iCanGetMaxOfX() {
        GameMap TestGameMap = new GameMap();
        assertEquals(TestGameMap.getMaxOfX(),9);
        
    }
     @Test
    public void iCanGetMaxOfY() {
        GameMap TestGameMap = new GameMap();
        assertEquals(TestGameMap.getMaxOfY(),9);
        
    }
    @Test
    public void ifICallIsValidPositionWithAValidPositionItReturnsTrue() {
        GameMap TestGameMap = new GameMap();
        Position position=new Position();
        boolean ValidPosition=TestGameMap.isPositionValid(position);
        assertTrue(ValidPosition);
    
    }
@Test
    public void ifICallIsValidPositionWithAOverMaxXPositionItReturnsFalse() {
        GameMap TestGameMap = new GameMap();
        Position position=new Position(10,0);
        boolean ValidPosition=TestGameMap.isPositionValid(position);
        assertFalse(ValidPosition);
    
    }
    @Test
    public void ifICallIsValidPositionWithAOverMaxYPositionItReturnsFalse() {
        GameMap TestGameMap = new GameMap();
        Position position=new Position(9,10);
        boolean ValidPosition=TestGameMap.isPositionValid(position);
        assertFalse(ValidPosition);
    
    }
    @Test
    public void ifICallIsValidPositionWithAUnderMinXPositionItReturnsFalse() {
        GameMap TestGameMap = new GameMap();
        Position position=new Position(-1,0);
        boolean ValidPosition=TestGameMap.isPositionValid(position);
        assertFalse(ValidPosition);
    
    }
        @Test
    public void ifICallIsValidPositionWithAUnderMinYPositionItReturnsFalse() {
        GameMap TestGameMap = new GameMap();
        Position position=new Position(1,-2);
        boolean ValidPosition=TestGameMap.isPositionValid(position);
        assertFalse(ValidPosition);
    
    }
 @Test
    public void calculate_North_Increments_Y_or_j_ForAValidPosition() {
        GameMap TestGameMap = new GameMap();
        TestGameMap.setMoveCount(2);
        Position currentPosition=new Position(2,3);
        Position NewPosition=TestGameMap.calculateNewPosition(currentPosition, DIRECTION.NORTH);
        assertEquals(NewPosition.getY(),4);
        assertTrue(TestGameMap.getMoveCount()==3);
    
    }
    
    @Test
    public void calculate_South_Decrements_Y_or_j_ForAValidPosition() {
        GameMap TestGameMap = new GameMap();
        TestGameMap.setMoveCount(2);
        
        Position currentPosition=new Position(2,3);
        Position NewPosition=TestGameMap.calculateNewPosition(currentPosition, DIRECTION.SOUTH);
        assertEquals(NewPosition.getY(),2);
    assertTrue(TestGameMap.getMoveCount()==3);
    }

    @Test
    public void calculate_East_Increments_X_or_i_ForAValidPosition() {
        GameMap TestGameMap = new GameMap();
        TestGameMap.setMoveCount(2);
        Position currentPosition=new Position(4,7);
        Position NewPosition=TestGameMap.calculateNewPosition(currentPosition, DIRECTION.EAST);
        assertEquals(NewPosition.getX(),5);
        assertTrue(TestGameMap.getMoveCount()==3);
    }
    
    @Test
    public void calculate_West_Decrements_X_or_i_ForAValidPosition() {
        GameMap TestGameMap = new GameMap();
        TestGameMap.setMoveCount(2);
        Position currentPosition=new Position(4,7);
        Position NewPosition=TestGameMap.calculateNewPosition(currentPosition, DIRECTION.WEST);
        assertEquals(NewPosition.getX(),3);
        assertTrue(TestGameMap.getMoveCount()==3);
    }

    @Test
    public void isNewPositionAfterCalculationValid(){
        GameMap TestGameMap = new GameMap();
        Position currentPosition = new Position(9,9);
        Position newPosition = TestGameMap.calculateNewPosition(currentPosition, DIRECTION.NORTH);
        assertEquals(newPosition.getY(), currentPosition.getY());
    }

    @Test
    public void icansetTheMoveCount(){
        GameMap testGameMap = new GameMap();
        testGameMap.setMoveCount(5);
        assertEquals(testGameMap.getMoveCount(), 5);

    }

}
