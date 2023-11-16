package com.levelup.forestsandmonsters;

import com.levelup.GameMap;

public class GameMapDouble extends GameMap{

    public GameMapDouble(){}
    @Override
    public Position calculateNewPosition(Position currentPosition,GameController.DIRECTION direction){
        Position pos= new Position();
        pos.y=6;
        return pos;
    }
    @Override
    public int getMoveCount() {
        return 4;
    }

}
