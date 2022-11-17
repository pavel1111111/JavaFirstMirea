package ru.mirea.test.task3;

public class rand {
    public static void main(String[] args) {
        int n, arr[];
        n = (int) ((Math.random() * 10) + 1);
        arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = (int) (Math.random() * 100);
        System.out.println("Случайный массив");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");

        boolean needIteration = true;
        while (needIteration) {
            needIteration = false;
            for (int i = 1; i < n; i++) {
                if (arr[i] < arr[i - 1]) {
                    int tmp = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = tmp;
                    needIteration = true;
                }
            }
        }

        System.out.println("\nОтсортированный массив");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}
