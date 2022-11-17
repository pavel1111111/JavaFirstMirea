package ru.mirea.test.task3;

public class main {
    public static void main(String[] args) {
        Double n1 = Double.valueOf("9");
        String str = "12.345";
        double n2 = Double.parseDouble(str);
        String d = Double.toString(3.14);
        byte b = (byte) n2;
        short s = (short) n2;
        int i = (int) n2;
        long l = (long) n2;
        float f = (float) n2;
        char c = (char) n2;
        System.out.println("Obj valueOf() = " + n1);
        System.out.println("\ndouble:" + n2);
        System.out.println("byte:" + b);
        System.out.println("short:" + s);
        System.out.println("int:" + i);
        System.out.println("long:" + l);
        System.out.println("float:" + f);
        System.out.println("char:" + c);
        System.out.println("literal:" + d);
    }
}
