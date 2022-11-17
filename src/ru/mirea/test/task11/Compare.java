package ru.mirea.test.task11;
import java.text.SimpleDateFormat;
import java.util.*;

public class Compare {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Введите день:");
        int day = input.nextInt();
        System.out.println("Введите месяц :");
        int month  = input.nextInt();
        System.out.println("Введите год:");
        int year = input.nextInt();
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-YYYY");
        Date date2 = new Date();
        Date date1 = new Date(year - 1900, month - 1, day);
        int result = date1.compareTo(date2);
        String formatted1 = formatter.format(date1);
        String formatted2 = formatter.format(date2);
        if(date1.getMonth() == date2.getMonth() && date1.getDay() == date2.getDay() && date1.getYear() == date2.getYear())
            System.out.println("Даты совпадают");
        else if(date1.after(date2))
            System.out.println(String.format("%s позже %s", formatted1, formatted2));
        else if(date1.before(date2))
            System.out.println(String.format("%s раньше, чем %s", formatted1, formatted2));
    }
}
