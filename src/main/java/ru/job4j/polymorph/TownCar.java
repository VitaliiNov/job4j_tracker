package ru.job4j.polymorph;

public class TownCar implements Vehicle, Fuel {
    public void changeGear() {
        System.out.println("Коробка передач автомат. Поставить селектор в режим D.");
    }

    @Override
    public void accelerate() {
        System.out.println("Нажатие на педаль газа механически открывает дроссельную заслонку");
    }

    @Override
    public void steer() {
        System.out.println("Стандартное рулевое управление");
    }

    @Override
    public void refill() {
        System.out.println("Заправить 100л бензина");
    }

    @Override
    public void brake() {
        System.out.println("Стандартная тормозная система");
    }

    public static void main(String[] args) {
        TownCar sportCar = new TownCar();
        Vehicle vehicle = sportCar;
        Fuel fuel = sportCar;
        vehicle.changeGear();
        vehicle.accelerate();
        vehicle.steer();
        vehicle.brake();
        fuel.refill();
    }
}
