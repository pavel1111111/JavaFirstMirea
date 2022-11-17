package ru.mirea.test.task3;

public class Circle {
    public Point center;
    public double radius;
    public double size;
    public Circle(Point center){
        this.center = center;
        this.radius = (int)((Math.random() * 10) + 1);
        SetSize();
    }
    public void SetSize(){
        this.size = 2 * 3.14 * this.radius;
    }
    public double GetSize() {
        return this.size;
    }

    public String toString(){
        return "центр (" + this.center + ")" + ", радиус: " + this.radius + ", длина: " + this.size;
    }
}
