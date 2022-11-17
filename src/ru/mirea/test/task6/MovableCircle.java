package ru.mirea.test.task6;

public class MovableCircle implements Movabel{
    private int radius;
    private MovablePoint center;

    MovableCircle(int radius, int x, int y, int xSpeed, int ySpeed){
        this.center = new MovablePoint(x, y, xSpeed, ySpeed);
        if (radius > 0) {
            this.radius = radius;
        } else {
            this.radius = 1;
        }
    }
    public void moveUp(){
        this.center.moveUp();
        System.out.println(this);
    }

    public void moveDown(){
        this.center.moveDown();
        System.out.println(this);
    }

    public void moveLeft(){
        this.center.moveLeft();
        System.out.println(this);
    }

    public void moveRight(){
        this.center.moveRight();
        System.out.println(this);
    }

    public String toString() {
        return "Movable circle - center: (" + this.center.x + ";" + this.center.y + "), xSpeed: " + this.center.xSpeed + ", ySpeed: " + this.center.ySpeed + ", radius: " + this.radius;
    }
}
