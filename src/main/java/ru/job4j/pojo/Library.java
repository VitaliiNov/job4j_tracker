package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book history = new Book("Цезарь", 100);
        Book biology = new Book("Животные", 250);
        Book programming = new Book("Clean code", 500);
        Book music = new Book("Ноты", 88);
        Book[] books = new Book[4];
        books[0] = history;
        books[1] = biology;
        books[2] = programming;
        books[3] = music;
        for (int i = 0; i < books.length; i++) {
            Book pr = books[i];
            System.out.println(pr.getName() + " - " + pr.getNumberPages() + " стр.");
        }
        Book temporarily = books[0];
        books[0] = books[3];
        books[3] = temporarily;
        System.out.println();
        for (int i = 0; i < books.length; i++) {
            Book pr = books[i];
            System.out.println(pr.getName() + " - " + pr.getNumberPages() + " стр.");
        }
        System.out.println();
        for (int index = 0; index < books.length; index++) {
            Book pr = books[index];
            if ("Clean code".equals(pr.getName())) {
                System.out.println(pr.getName() + " - " + pr.getNumberPages() + " стр.");
            }
        }
    }
}
