package com.levelup.forestsandmonsters;

public class Position {
    int x = 5;
    int y = 5;

    public Position(){};

    public Position(int i, int j) {
        this.x=i; y=j;
    }

    public int getX() {
        return x;

    }

    public void setX(int newX) {
        this.x = newX;

    }

    public int getY() {
        return y;

    }

    public void setY(int newY) {
        this.y = newY;
    }
}
