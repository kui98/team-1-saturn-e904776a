package com.levelup.forestsandmonsters;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.atLeast;

import org.junit.Test;
import org.mockito.Mockito;

import com.levelup.GameMap;

public class CharacterTest {
    @Test
    public void IWantToSeeThatANewlyCreatedCharacterIsNotNull() {
        Character testObj = new Character();
        assertNotNull(testObj.name);
    }

    @Test
    public void IWantToBeAbleToSetMyCharactersName(){
        String charName = "New Name Saturn";
        Character testObj = new Character(charName);
        assertEquals(testObj.name, charName);
    }

    @Test
    public void iWantToSeeThatMyCharactersNameIsRecordedAndICanRetreiveIt(){
        String charName = "New Name Saturn";
        Character testObj = new Character(charName);
        assertEquals(testObj.getName(), charName);
    }

    @Test
    public void iWantToSeeThatMyBlankCharactersPositionIsNotNull(){
        Character testObj = new Character();
        assertNotNull(testObj.getCurrentPosition());
    }

    @Test
    public void iWantToSetANewPositionForMyCharacter(){
        Character testObj = new Character();
        Position pos=new Position();
        pos.x=2;
        pos.y=3;
        testObj.setCurrentPosition(pos);
        int newX = testObj.getCurrentPosition().getX();
        int newY = testObj.getCurrentPosition().getY();
        assertEquals(newX, pos.x);
        assertEquals(newY, pos.y);
        

    
    }

    @Test
    public void iWantToSeeThatMyCharacterCanMove(){
        Character testObj = new Character();
        testObj.gameMap=new GameMapDouble();
       testObj.move(GameController.DIRECTION.NORTH);
       assertEquals(testObj.getCurrentPosition().x,5);
     assertEquals(testObj.getCurrentPosition().y,6);
    }
    @Test
    public void setInitialMoveCount(){
        int anyCount=5;
        Character testObj = new Character();
        testObj.gameMap=new GameMap();
        testObj.setMoveCount(anyCount);
        assertEquals(testObj.getMoveCount(), anyCount);
    }

    @Test
    public void ICanGetMyCharactersMoveCount(){
        Character newCharacter = new Character();
        GameMapDouble gameMap = new GameMapDouble();
        newCharacter.gameMap=gameMap;
        assertEquals(newCharacter.getMoveCount(), gameMap.getMoveCount());
        assertEquals(4, gameMap.getMoveCount());
    }

    

}