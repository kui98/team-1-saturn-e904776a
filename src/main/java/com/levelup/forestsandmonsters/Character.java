package com.levelup.forestsandmonsters;

public class Character {
    String name;
    static String DEFAULT_NAME = "TeamSaturn";
    Position currentPosition = new Position();
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
    
}
