package ru.mirea.test.task7;

interface MathCalculable
{
    public void stepen(int n);
    public void mod();
    double PI = 3.14;
}
class MathFunc implements  MathCalculable
{
    int x,y;
    //double fi;
    MathFunc(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
    public void mod()
    {
        System.out.println("Модуль комплексного числа = " + Math.sqrt(x*x + y*y));
    }
    public void stepen(int n)
    {
        double fi = 0, Z;
        if(x>0)
        {
            fi = Math.atan2(y,x);
        }
        else if(x<0 && y>0)
        {
            fi = Math.atan2(y,x) + PI;
        }
        else if(x<0 && y<0)
        {
            fi = Math.atan2(y,x) - PI;
        }
        Z = Math.pow(Math.sqrt(x*x + y*y),n);
        //double a = n*fi;
        System.out.println("Ваше число в степени "+n + " = " +Z +"* (" + Math.cos(n*fi) +" + i*" +Math.sin(n*fi) +")");
    }

}