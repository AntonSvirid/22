package by.itstep.antonsvirid.controller;

import by.itstep.antonsvirid.model.data.Student;

public class Main {
    public static void main(String[] args) {
        // через конструктор с параметрами (полными или частичными (нужно создать соответвующие))
        Student student1 = new Student("Alex", 19, 10, true);
        Student student2 = new Student("Anna");
        Student student3 = new Student(true);
        // через дефолтный контруктор
        Student student4 = new Student();
        // через конструктор копирования
        Student student5 = new Student(student1);
        Student student6 = new Student(student1);


        System.out.println(student1.getInfo());
        System.out.println(student2.getInfo());
        System.out.println(student3.getInfo());
        System.out.println(student4.getInfo());
        System.out.println(student5.getInfo());
        System.out.println(student6.getInfo());


    }
}
