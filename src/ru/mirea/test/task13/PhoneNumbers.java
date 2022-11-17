package ru.mirea.test.task13;

import java.util.Scanner;

public class PhoneNumbers {
    private String code, city, triplet, quadruple;

    public PhoneNumbers(String phone){
        if(phone.startsWith("8")){
            code = "+7";
        }else{
            code = phone.substring(0, phone.length()-10);
        }
        city = phone.substring(phone.length()-10, phone.length()-7);
        triplet = phone.substring(phone.length()-7, phone.length()-4);
        quadruple = phone.substring(phone.length()-4);
    }

    @Override
    public String toString() {
        return code + city + "-" + triplet + "-" + quadruple;
    }

    public static void main(String[] args) {
        System.out.println(new PhoneNumbers("88005553535"));
        System.out.println(new PhoneNumbers("+78005553535"));
        System.out.println(new PhoneNumbers("+1238005553535"));
        System.out.println(new PhoneNumbers("+118005553535"));
        System.out.println("Введите номер телефона: ");
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        System.out.println(new PhoneNumbers(str));
    }
}