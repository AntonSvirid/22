package by.itstep.antonsvirid.model.logic;

import by.itstep.antonsvirid.model.data.Student;

public class Manager {
    public static double calcAvgStudentMark(Student[] students) {
        double s = 0;

        for (Student student : students) {  //foreach!!!
            s += student.mark;      // экстремальный  алгоритм нахожд сред ариф
        }

        return s / students.length;
    }
}
