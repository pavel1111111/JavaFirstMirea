package ru.mirea.test.task8;

import java.util.Scanner;

public class A_andB {
    public static void main(String args[]){
        System.out.println("Введите a и b");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println(recursion(a,b));
    }
    static int recursion(int a, int b){
        if(a>(b+1))
            return 0;
        if(a==0 || b==0)
            return 1;
        return recursion(a,b-1)+ recursion(a-1,b-1);
    }
}
