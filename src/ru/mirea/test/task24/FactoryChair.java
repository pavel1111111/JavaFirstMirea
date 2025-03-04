package ru.mirea.test.task24;

public class FactoryChair {
    public Chair createChair (ChairType type, String color, int size) {
        Chair chair = null;
        switch (type) {
            case VICTORIAN:
                chair = new Victorian(color, size);
                break;
            case MULTIFUNCTIONAL:
                chair = new Multifunctional(color, size);
                break;
            case MAGIC:
                chair = new Magic(color, size);
                break;
        }
        return chair;
    }
}
