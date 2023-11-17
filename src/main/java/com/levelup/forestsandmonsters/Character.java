package com.levelup.forestsandmonsters;

import com.levelup.GameMap;

public class Character {
    String name;
    static String DEFAULT_NAME = "TeamSaturn";
    Position currentPosition = new Position();
    GameMap gameMap=new GameMap();
    public Character()
    {
        this.name = DEFAULT_NAME;
    }

    public Character(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public Position getCurrentPosition(){
        return currentPosition;
    }

    public void setCurrentPosition(Position position){
        this.currentPosition=position;
    }

    public void move(GameController.DIRECTION direction){
        setCurrentPosition(gameMap.calculateNewPosition(currentPosition, direction));
    }

    public int getMoveCount() {
        return gameMap.getMoveCount();
    }
    public void setMoveCount(int initialMoveCount) {
         gameMap.setMoveCount(initialMoveCount);
    }
    
}
