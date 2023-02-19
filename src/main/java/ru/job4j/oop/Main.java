package ru.job4j.oop;

public class Main {
    public static void main(String[] args) {
        Vehicle plane = new Plane();
        Vehicle train = new Train();
        Vehicle bus = new Bus();
        Plane plane1 = new Plane();
        Train train1 = new Train();
        Bus bus1 = new Bus();
        Vehicle[] vehicles = {plane, train, bus};
        for (Vehicle a : vehicles) {
            a.move();
        }
        System.out.println(plane1.numberPassengers(10) + " " + plane1.speed(100));
        System.out.println(train1.numberPassengers(20) + " " + train1.speed(1000));
        System.out.println(bus1.numberPassengers(30) + " " + bus1.speed(250));
    }
}
