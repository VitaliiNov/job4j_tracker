package ru.job4j.oop;

public class Bus implements Vehicle {
    int speed(int speed) {
        return speed;
    }

    int numberPassengers(int numberPassengers) {
        return numberPassengers;
    }

    @Override
    public void move() {
        System.out.println("Автобус едет по трассе");
    }
}
