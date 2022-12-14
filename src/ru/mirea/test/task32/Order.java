package ru.mirea.test.task32;

import java.io.Serializable;
import java.util.Arrays;

public class Order implements Serializable {

    private static final long serialVersionUID = 1L;

    private String[] name;
    private String[] surname;
    private String[] dish;

    public Order(String[] n, String[] s, String[] d){
        this.name = n;
        this.surname = s;
        this.dish = d;
    }

    public String[] getName() {
        return name;
    }

    public void setName(String[] name) {
        this.name = name;
    }

    public String[] getSurname() {
        return surname;
    }

    public void setDish(String[] dish) {
        this.dish = dish;
    }

    public String[] getDish() {
        return dish;
    }

    public void setSurname(String[] surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Order{" +
                "Name=" + Arrays.toString(name) +
                ", Surname=" + Arrays.toString(surname) +
                ", dish=" + Arrays.toString(dish) +
                '}';
    }
}