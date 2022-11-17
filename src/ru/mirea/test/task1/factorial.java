package ru.mirea.test.task1;

public class factorial {
    public int res = 1;
    public factorial(int num){
        int i = num;
        while(i>0){
            res *= i;
            i--;
        }
        System.out.printf("Факториал числа %d равен %d\n", num, res);
    }
}
