package by.itstep.antonsvirid.controller;

import by.itstep.antonsvirid.model.data.Student;

public class SecondMain {
    public static void main(String[] args) {
//        int a = 10;
//        int b = a;
//        a = 20;

        Student student1 = new Student("Alex");
        Student student2 = student1;       // присваивается ссылка на один и тот же объект

    }
}
