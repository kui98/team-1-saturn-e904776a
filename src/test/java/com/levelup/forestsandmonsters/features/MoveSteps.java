package com.levelup.forestsandmonsters.features;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.awt.Point;

import com.levelup.forestsandmonsters.GameController;
import com.levelup.forestsandmonsters.Position;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MoveSteps {

    GameController testObj = new GameController();
    //int startX, startY, endX, endY;
    GameController.DIRECTION direction;
  //  Point currentPosition;

    @Given("the character starts at position with XCoordinates {int}")
    public void givenTheCharacterStartsAtX(int startX) {
        testObj.createCharacter(null);
        //this.startX = startX;
        this.testObj.getAvatar().getCurrentPosition().setX(startX);
    }

    @Given("starts at YCoordinates {int}") 
    public void givenTheCharacterStartsAtY(int startY) {
        //this.startY = startY;
        this.testObj.getAvatar().getCurrentPosition().setY(startY);
    }

    @Given("the player chooses to move in {word}")
    public void givenCharacterChoosesDirection(String direction) {
        this.direction = GameController.DIRECTION.valueOf(direction);
    }

    @Given("the current move count is {int}")
    public void givenTheCurrentMoveCountIs(int currentMoveCount) {
    
        testObj.getAvatar().setMoveCount(currentMoveCount);
        
    }

    @When("the character moves")
    public void theCharacterMoves() {
        //testObj.setCharacterPosition(new Point(this.startX, this.startY));
        //testObj.getAvatar().setCurrentPosition(new Position(this.startX, this.startY));
        testObj.move(this.direction);
       
        GameController.GameStatus status = testObj.getStatus();
        //this.currentPosition = status.currentPosition;
    }

    @Then("the character is now at position with XCoordinates {int}")
    public void checkXCoordinates(int endX) {
        //assertNotNull("Expected position not null", this.currentPosition) ;
        //assertEquals(endX, this.currentPosition.x);
        assertNotNull("Expected position not null", this.testObj.getAvatar().getCurrentPosition()) ;
        assertEquals(endX, this.testObj.getAvatar().getCurrentPosition().getX());
    }

    @Then("YCoordinates {int}")
    public void checkYCoordinates(int endY) {
        /*assertNotNull("Expected position not null", this.currentPosition);
        assertEquals(endY, this.currentPosition.y);
        assertEquals(endX, this.currentPosition.x);assertEquals(endX, this.currentPosition.x);*/

        assertNotNull("Expected position not null", this.testObj.getAvatar().getCurrentPosition());
        assertEquals(endY, this.testObj.getAvatar().getCurrentPosition().getY());
        //assertEquals(endX, this.testObj.getAvatar().getCurrentPosition().getX());
        
    }

    @Then("the new move count is {int}")
    public void checkMoveCount(int endingMoveCount) {
        assertEquals(endingMoveCount, testObj.getStatus().moveCount);
    }

}
