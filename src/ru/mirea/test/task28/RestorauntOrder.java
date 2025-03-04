package ru.mirea.test.task28;

import java.util.ArrayList;
import java.util.List;

public class RestorauntOrder implements Order
{
    private int size;

    List<Item> dishList = new ArrayList<>();

    public String[] getDishes(){
        String[] str = new String[dishList.size()];
        for (int i = 0; i < dishList.size(); i++){
            str[i] = dishList.get(i).getName() + " " + dishList.get(i).getDescription() + " " + dishList.get(i).getCost();
        }
        return str;
    }

    @Override
    public int count() {
        return dishList.size();
    }

    @Override
    public boolean remove(String dishName){
        return dishList.remove(dishName);
    }

    @Override
    public void deleteAll(String name) {
        dishList.clear();
    }
    public String[] dishesName(){
        String[] str = new String[0];
        for(int i = 0; i < dishList.size(); i++)
            str[i] = dishList.get(i).getName();
        return str;
    }

    @Override
    public boolean addPosition(Item dishName){
        return dishList.add(dishName);
    }
    public int DishQuantity(){
        return dishList.size();
    }
    public int DishQuantity(String dishName){
        int k = 0;
        while (dishList.contains(dishName)){
            k++;
        }
        return k;
    }

    @Override
    public int costAll(){
        int sum = 0;
        for(int i = 0; i < dishList.size(); i++)
            sum += dishList.get(i).getCost();
        return sum;
    }

    @Override
    public int orderName(String p) {
        int k = 0;
        while (dishList.contains(p)){
            k++;
        }
        return k;
    }
}