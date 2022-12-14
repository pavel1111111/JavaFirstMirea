package ru.mirea.test.task24;

public class ChairTest {
    public static void main(String[] args) {
        // Factory
        FactoryChair myFactory = new FactoryChair();
        // Chairs
        Chair victorian = myFactory.createChair(ChairType.VICTORIAN, "Black", 12);
        Chair multifunctional = myFactory.createChair(ChairType.MULTIFUNCTIONAL, "Gray", 10);
        Chair magic = myFactory.createChair(ChairType.MAGIC, "Purple", 17);
        // Client
        Client client = new Client("Alexey", 47);
        client.sit(multifunctional);
        client.sit(magic);
        client.sit(victorian);
    }
}