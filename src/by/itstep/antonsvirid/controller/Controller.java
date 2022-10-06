package by.itstep.antonsvirid.controller;

import by.itstep.antonsvirid.model.data.Student;
import by.itstep.antonsvirid.model.logic.Manager;

public class Controller {
    public static void main(String[] args) {
        Student student1 = new Student("Alex", 20, 10, true);
        Student student2 = new Student("Alex", 20, 9, true);
        Student student3 = new Student("Alex", 20, 9, true);


        Student[] students = {student1, student2, student3};

        double result = Manager.calcAvgStudentMark(students);

        System.out.printf("Average student's mark is %.2f", result);
    }
}
