package ru.mirea.test.task1;

public class harmon {
    public harmon(){
        System.out.println("Первые 10 чисел гармноческого ряда: ");
        double res;
        for (int i = 1; i < 11; i++) {
            res = 1./i;
            System.out.printf("%.4f\s", res);
        }
        System.out.println();
    }
}
