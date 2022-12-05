package ru.mirea.test.task4;

public class TransportTest {
    public static void main(String[] args)
    {
        Car car = new Car();
        Plane plane = new Plane();
        Train train = new Train();

        car.setPTime(25.5);
        car.setPPrice(250);
        car.setPWeight(1050);

        car.setWTime(34.2);
        car.setWPrice(300);
        car.setWWeight(5000);

        plane.setPTime(75.5);
        plane.setPPrice(25);
        plane.setPWeight(10);

        plane.setWTime(94.2);
        plane.setWPrice(30);
        plane.setWWeight(25);

        train.setPTime(45.5);
        train.setPPrice(250);
        train.setPWeight(100);

        train.setWTime(54.2);
        train.setWPrice(390);
        train.setWWeight(207);

        System.out.println("Car: ");
        System.out.println("Pasajur time: " + car.getPTime());
        System.out.println("Pasajur price: " + car.getPPrice());
        System.out.println("Pasajur weight: " + car.getPWeight());

        System.out.println("--------------------------------------");

        System.out.println("Gryz time: " + car.getWTime());
        System.out.println("Gryz price: " + car.getWPrice());
        System.out.println("Gryz weight: " + car.getWWeight());

        System.out.println();
        System.out.println("Bicycle: ");
        System.out.println("Pasajur time: " + plane.getPTime());
        System.out.println("Pasajur price: " + plane.getPPrice());
        System.out.println("Pasajur weight: " + plane.getPWeight());

        System.out.println("--------------------------------------");

        System.out.println("Gryz time: " + plane.getWTime());
        System.out.println("Gryz price: " + plane.getWPrice());
        System.out.println("Gryz weight: " + plane.getWWeight());

        System.out.println();
        System.out.println("Povozka: ");
        System.out.println("Pasajur time: " + train.getPTime());
        System.out.println("Pasajur price: " + train.getPPrice());
        System.out.println("Pasajur weight: " + train.getPWeight());

        System.out.println("--------------------------------------");

        System.out.println("Gryz time: " + train.getWTime());
        System.out.println("Gryz price: " + train.getWPrice());
        System.out.println("Gryz weight: " + train.getWWeight());
    }
}
