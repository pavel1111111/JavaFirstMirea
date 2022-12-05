package ru.mirea.test.task7;

interface Movable
{
    public void moveUp();
    public void moveDown();
    public void moveLeft();
    public void moveRight();

    public void SpeedTest(int ySpeed, int xSpeed);
}

class MovablePoint implements Movable
{
    int x;
    int y;
    int xSpeed;
    int ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed)
    {
        this.x =x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint() {}

    public void moveUp()
    {
        y+=ySpeed;
    }

    public void moveDown()
    {
        y-=ySpeed;
    }

    public void moveLeft()
    {
        x-=xSpeed;
    }

    public void moveRight()
    {
        x+=xSpeed;
    }
    public void SpeedTest(int ySpeed, int xSpeed)
    {
        if (ySpeed == xSpeed)
            System.out.println("Скорости равны " + xSpeed + " " + ySpeed);
        else
            System.out.println("Скорости разные "+ xSpeed + " " + ySpeed);
    }

}

class MovableRectangle extends MovablePoint
{
    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    public MovableRectangle(int x1, int y1,int x2, int y2, int xSpeed, int ySpeed)
    {
        super();
        this.topLeft = new MovablePoint(x1,y1,xSpeed,ySpeed);
        this.bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }

    public void moveLeft()
    {
        topLeft.moveLeft();
        bottomRight.moveLeft();
    }

    public void moveRight()
    {
        topLeft.moveRight();
        bottomRight.moveRight();
    }

    public void moveUp()
    {
        topLeft.moveUp();
        bottomRight.moveUp();
    }

    public void moveDown()
    {
        topLeft.moveDown();
        bottomRight.moveDown();
    }
    public void SpeedTest(int ySpeed, int xSpeed)
    {
        super.SpeedTest(ySpeed,xSpeed);
    }
    public String toString()
    {
        return "topLeft (" + topLeft.x +", " +topLeft.y + ")\nbottomRight (" + bottomRight.x + ", " + bottomRight.y + ")";
    }
}
