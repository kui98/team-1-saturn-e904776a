package com.levelup;

import com.levelup.forestsandmonsters.GameController;
import com.levelup.forestsandmonsters.Position;
import com.levelup.forestsandmonsters.GameController.DIRECTION;

public class GameMap {
    int moveCount=0;
    public Position calculateNewPosition(Position currentPosition,GameController.DIRECTION direction){
        Position newPosition=new Position(currentPosition.getX(),currentPosition.getY());
        if (direction==DIRECTION.NORTH) {
            newPosition.setY(newPosition.getY()+1);
        }
        if (direction==DIRECTION.SOUTH) {
            newPosition.setY(newPosition.getY()-1);
        }
        if (direction==DIRECTION.WEST) {
            newPosition.setX(newPosition.getX()-1);
        }
        if (direction==DIRECTION.EAST) {
            newPosition.setX(newPosition.getX()+1);
        }
        
        if(this.isPositionValid(newPosition)) {
            return newPosition;
        }
        else{
            return currentPosition;
        }
        
    }

    public int getMoveCount() {
        return moveCount;
    }

    public int getMinOfX() {
        return 0;
    }

    public int getMinOfY() {
        return 0;
    }

    public int getMaxOfY() {
        return 9;
    }

    public int getMaxOfX() {
        return 9;
    }

    public boolean isPositionValid(Position position) {
        if (position.getX()<this.getMinOfX()) return false;
        if (position.getY()<this.getMinOfY()) return false;
        if (position.getX()>this.getMaxOfX()) return false;
        if (position.getY() > this.getMaxOfY()) return false;

        return true;
        
    }
}
