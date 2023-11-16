package com.levelup.forestsandmonsters;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CharacterTest {
    @Test
    public void initializationCreatesResults() {
        Character testObj = new Character();
        assertNotNull(testObj.name);
    }

    @Test
    public void setName(){
        String charName = "New Name Saturn";
        Character testObj = new Character(charName);
        assertEquals(testObj.name, charName);
    }

    @Test
    public void getName(){
        String charName = "New Name Saturn";
        Character testObj = new Character(charName);
        assertEquals(testObj.getName(), charName);
    }

    @Test
    public void getPosition(){
        Character testObj = new Character();
        assertNotNull(testObj.getCurrentPosition());
    }

    @Test
    public void setPosition(){
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
    public void moveTest(){
        Character testObj = new Character();
       // testObj.move(GameController.DIRECTION.NORTH);
    
    }

    

}