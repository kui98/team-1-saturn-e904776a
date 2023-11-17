package com.levelup.forestsandmonsters.cli;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.levelup.forestsandmonsters.Character;
import com.levelup.forestsandmonsters.GameController;
import com.levelup.forestsandmonsters.GameController.GameStatus;

import org.springframework.shell.Availability;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellMethodAvailability;
import org.springframework.shell.standard.ShellOption;
import org.springframework.shell.standard.commands.Quit;
import org.springframework.util.StringUtils;

@ShellComponent
public class LevelUpGame {

  private final GameController gameController;
  // private List<GameStatus> gameHistory;
  private boolean isGameStarted = false;

  public LevelUpGame() {
    super();
    this.gameController = new GameController();
    System.out.println(
        "-------------------------------------------------------------\n" + //
            "Start LEVEL UP GAMES\n" + //
            "-------------------------------------------------------------\n" + //
            "Welcome to Level Up Games\n" + //
            "Enter option 1 to create character\n" + //
            "Note:  Press X to exit game\n" + //
            "-------------------------------------------------------------\n" + //
            "");
    print("Enter your option: ");
    String inputFromKeyboard = getUserInput();

    if (inputFromKeyboard.equals("1")) {

      this.createCharacterScreen();
    }
    if (inputFromKeyboard.equalsIgnoreCase("X")) {
      this.endGame();
    }
  }

  public void print(String textToShow) {
    System.out.println(textToShow);
  }

  public void endGame() {// TODO
  }

  public String getUserInput() {
    Scanner keyboard = new Scanner(System.in);
    return keyboard.nextLine();
  }

  public void clearscreen() {
    // TODO
  }

  public void createCharacterScreen() {
    this.clearscreen();
    print("Player has selected option 1");
    print("Note: Press X to exit the game");
    print("Only alpha-numeric characters allowed");
    print("Type name of your character and press Enter: ");
    String characterNameFromKeyboard = getUserInput();

    if (characterNameFromKeyboard.equalsIgnoreCase("X")) {
      this.endGame();

    }
    if (validatecharactername(characterNameFromKeyboard)) {
      Character NewCharacter = new Character(characterNameFromKeyboard);
      this.startGameScreen(NewCharacter);
    }
  }

  public boolean validatecharactername(String providedcharactername) {
    Pattern PATTERN = Pattern.compile("A-Za-z0-9 ");
    Matcher matcher = PATTERN.matcher(providedcharactername);
    return matcher.matches();
  }

  public void startGameScreen(Character newCharacter) {
    // TODO
  }
}