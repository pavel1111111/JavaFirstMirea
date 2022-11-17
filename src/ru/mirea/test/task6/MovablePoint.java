package ru.mirea.test.task6;

public class MovablePoint implements Movabel{
    public int x, y, xSpeed, ySpeed;
    MovablePoint(int x, int y, int xSpeed, int ySpeed){
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public void moveUp(){
        this.y += this.ySpeed;
    }

    public void moveDown(){
        this.y -= this.ySpeed;
    }

    public void moveLeft(){
        this.x -= this.xSpeed;
    }

    public void moveRight(){
        this.x += this.xSpeed;
    }

    public String toString() {
        return "Movable point - x: " + this.x + ", y: " + this.y + ", xSpeed: " + this.xSpeed + ", ySpeed: " + this.ySpeed;
    }
}
