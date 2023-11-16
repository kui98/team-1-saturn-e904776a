package com.levelup.forestsandmonsters;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
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

}