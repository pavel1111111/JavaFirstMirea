package ru.mirea.test.task11;
import java.util.Date;
import java.util.Scanner;

    public class First {
        static String fio;
        static Date getDateOfTask;
        static Date getDateOfFinishTask;
        static String ImputFio() {
            Scanner conin = new Scanner(System.in);
            System.out.println("Введите ФИО ");
            fio = conin.nextLine();
            System.out.println("ФИО разработчика " + fio);
            return fio;
        }
        static Date getDateOfBeginTask() {
            Date getDateOfTask = new Date();
            getDateOfTask.getDate();
            System.out.println("Дата начала: " + getDateOfTask);
            return getDateOfTask;
        }
        static Date getDateOfFinishTask() {
            Date getDateOfFinishTask = new Date();
            Long time = getDateOfFinishTask.getTime();
            long anotherDate = +7;
            time = time + (60 * 60 * 24 * 1000 * anotherDate);
            getDateOfFinishTask = new Date(time);
            System.out.println("Дата конца  :" + getDateOfFinishTask);
            return getDateOfFinishTask;
        }
        public static void main(String[] args) {
            ImputFio();
            getDateOfBeginTask();
            getDateOfFinishTask();
        }
    }
