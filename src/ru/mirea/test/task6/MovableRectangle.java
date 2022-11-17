package ru.mirea.test.task6;

public class MovableRectangle implements Movabel{
    private MovablePoint topLeft;
    private MovablePoint buttonRight;

    MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed){
        this.topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        this.buttonRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }
    public void moveUp(){
        this.topLeft.moveUp();
        this.buttonRight.moveUp();
        System.out.println(this);
    }

    public void moveDown(){
        this.topLeft.moveDown();
        this.buttonRight.moveDown();
        System.out.println(this);
    }

    public void moveLeft(){
        this.topLeft.moveLeft();
        this.buttonRight.moveLeft();
        System.out.println(this);
    }

    public void moveRight(){
        this.topLeft.moveRight();
        this.buttonRight.moveRight();
        System.out.println(this);
    }

    public String toString() {
        return "Movable rectangle - top left: (" + this.topLeft.x + ";" + this.topLeft.y+"), button right: ("+ this.buttonRight.x + ";" + this.buttonRight.y+")";
    }
}
