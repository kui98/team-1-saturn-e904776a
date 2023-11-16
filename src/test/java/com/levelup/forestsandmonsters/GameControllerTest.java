package com.levelup.forestsandmonsters;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import org.junit.Test;

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
        testObj.move(DIRECTION.NORTH);
        verify(mockCharacter).move(any(DIRECTION.class));
        
    }

}
