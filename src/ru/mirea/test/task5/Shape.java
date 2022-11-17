package ru.mirea.test.task5;

import java.awt.*;

public abstract class Shape {
    Color clr;
    int x;
    int y;
    public abstract void GetShape();

    public void GetCoords(){
        this.x =  0 + (int)(Math.random()*((600 - 0) + 1));
        this.y =  0 + (int)(Math.random()*((600 - 0) + 1));
    }
}
