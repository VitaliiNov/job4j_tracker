package ru.job4j.oop;

public class Train implements Vehicle {
    int speed(int speed) {
        return speed;
    }

    int numberPassengers(int numberPassengers) {
        return numberPassengers;
    }

    @Override
    public void move() {
        System.out.println("Поезд едет по рельсам");
    }
}
