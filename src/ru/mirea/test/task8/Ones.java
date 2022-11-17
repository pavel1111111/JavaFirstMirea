package ru.mirea.test.task8;

import java.util.Scanner;

public class Ones {
    public static void main(String args[]){
        System.out.println("Введите числа");
        Scanner input = new Scanner(System.in);
        int num;
        System.out.println(recursion(num = input.nextInt()));
    }
    static int recursion(int num) {
        Scanner input = new Scanner(System.in);
        if (num == 0)
            if (input.nextInt() == 0)
                return 0;
        if (num == 1)
            return recursion(num = input.nextInt()) + 1;
        return recursion(num = input.nextInt());
    }
}

