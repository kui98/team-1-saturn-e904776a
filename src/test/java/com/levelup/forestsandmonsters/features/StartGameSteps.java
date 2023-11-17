package com.levelup.forestsandmonsters.features;

import static org.junit.Assert.assertEquals;

import com.levelup.forestsandmonsters.GameController;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StartGameSteps {

    GameController testObj;

    @When("the game is started")
    public void whenTheCharacterSetsTheirName() {
        testObj = new GameController();
        testObj.createCharacter(null);
        testObj.startGame();
    }

    @Then("the Game has {int} positions")
    public void thenTheGameSetsTheCharactersName(int numPositions) {
        assertEquals(numPositions, testObj.getTotalPositions());
    }

    @Then("the Game sets the character's X position to {int}")
    public void checkXPosition(int xPosition)
    {
        testObj.getAvatar().getCurrentPosition().setX(xPosition);
        assertEquals(xPosition, testObj.getAvatar().getCurrentPosition().getX());
    }

    @Then("the Game sets the character's Y position to {int}")
    public void checkYPosition(int yPosition) 
    {
        testObj.getAvatar().getCurrentPosition().setY(yPosition);
        assertEquals(yPosition, testObj.getAvatar().getCurrentPosition().getY());
    }

    @Then("the move count is {int}")
    public void checkMoveCount(int moveCount) 
    {
        testObj.getAvatar().setMoveCount(moveCount);
        assertEquals(moveCount, testObj.getAvatar().getMoveCount());
    }

}
