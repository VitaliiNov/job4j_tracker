package ru.job4j.oop;

public class Error {
    private boolean active;
    private int status;
    private String message;

    public Error() {
    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void printInfo() {
        String str = active ? "Обнаружена ошибка" : "Нет ошибок";
        System.out.println(str);
        System.out.println("№ " + status);
        System.out.println(message);
    }

    public static void main(String[] args) {
        Error laptopLenovo = new Error();
        Error laptopHp = new Error(true, 8, "Неисправна видеокарта");
        Error laptopSamsung = new Error(false, 0, "Всё отлично работает");
        laptopHp.printInfo();
        System.out.println();
        laptopSamsung.printInfo();
    }
}
