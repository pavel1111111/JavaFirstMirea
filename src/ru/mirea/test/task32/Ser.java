package ru.mirea.test.task32;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Ser {

    public static void main(String[] args) throws IOException {

        //создаем наш объект
        String[] name = {"Павел ", "Данил", "Влад"};
        String[] surname = {"Киселев", "Чикилев", "Горбушин"};
        String[] dish = {"мясо", "рыба", "курица"};

        Order saved = new Order(name, surname, dish);

        //создаем 2 потока для сериализации объекта и сохранения его в файл
        FileOutputStream outputStream = new FileOutputStream("C:\\Users\\lslks\\Desktop\\save.ser");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);

        // сохраняем игру в файл
        objectOutputStream.writeObject(saved);

        //закрываем поток и освобождаем ресурсы
        objectOutputStream.close();
    }
}