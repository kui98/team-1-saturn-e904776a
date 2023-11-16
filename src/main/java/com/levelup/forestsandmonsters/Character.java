package com.levelup.forestsandmonsters;

public class Character {
    String name;
    static String DEFAULT_NAME = "TeamSaturn";
    public Character()
    {
        this.name = DEFAULT_NAME;
    }
    public Character(String name){
        this.name = name;
    }
}
