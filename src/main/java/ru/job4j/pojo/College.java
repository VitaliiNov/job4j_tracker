package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFullName("Иванов Иван Иванович");
        student.setGroup("4и");
        student.setDate(new Date());
        System.out.println("студент: " + student.getFullName() + " поступил в группу № "
                + student.getGroup() + " " + student.getDate());
    }
}
