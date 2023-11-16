package com.levelup.forestsandmonsters;

import static org.junit.Assert.assertNotNull;
import org.junit.Test;

public class CharacterTest {
    @Test
    public void initializationCreatesResults() {
        Character testObj = new Character();
        assertNotNull(testObj.name);
    }

}