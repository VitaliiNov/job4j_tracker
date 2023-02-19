package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public void go() {
        System.out.println("Едем домой");
    }

    @Override
    public void passengers(int quantity) {
        System.out.println("в автобусе " + quantity + " человек");
    }

    @Override
    public double priseFuel(int fuel) {
        return fuel * 50;
    }
}
