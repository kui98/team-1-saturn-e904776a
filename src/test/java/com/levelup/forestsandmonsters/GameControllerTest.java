package com.levelup.forestsandmonsters;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import org.junit.Test;
import org.mockito.Mockito;

import com.levelup.forestsandmonsters.GameController.DIRECTION;

public class GameControllerTest {
    Character mockCharacter=mock(Character.class);

    @Test
    public void initializationCreatesResults() {
        GameController testObj = new GameController();
        assertNotNull(testObj.status);
    }

    @Test
    public void createCharacterNameNullTest(){
        GameController testObj = new GameController();
        testObj.createCharacter(null);
        assertNotNull(testObj.avatar);
        assertEquals(testObj.getStatus().characterName,GameController.DEFAULT_CHARACTER_NAME);
    }

    @Test
    public void createCharacterTest(){
        GameController testObj = new GameController();
        String name="Test";
        testObj.createCharacter(name);
        assertNotNull(testObj.avatar);
        assertEquals(testObj.getStatus().characterName,name);
    }

    @Test
    public void moveCharacterTest(){
        GameController testObj = new GameController();
        testObj.avatar=mockCharacter;
        Mockito.when(mockCharacter.getCurrentPosition()).thenReturn(new Position(1,2));
        Mockito.when(mockCharacter.getMoveCount()).thenReturn(20);
        testObj.move(DIRECTION.NORTH);
        verify(mockCharacter).move(any(DIRECTION.class));
        assertTrue(testObj.avatar.getCurrentPosition().x ==1);
        assertTrue(testObj.avatar.getCurrentPosition().y ==2);
         assertTrue(testObj.status.moveCount==20);
         assertTrue(testObj.status.currentPosition.getX()==1);
         assertTrue(testObj.status.currentPosition.getY()==2);
    }

}
