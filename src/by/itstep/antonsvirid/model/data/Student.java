package by.itstep.antonsvirid.model.data;

// класс-сущность  (entity-class)
public class Student {
    public String name;
    public int age;
    public double mark;
    public boolean alive;

    // дефолтный конструктор
    public Student() {
        name = "no Name";
        age = 16;
        mark = 4.0;
        alive = true;
    }

    // использование конструктора с параметрами (_перегрузка_()_)

            // создано в авто-режиме через alt+insert:
    public Student(String name, int age, double mark, boolean alive) {
        this.name = name;
        this.age = age;
        this.mark = mark;
        this.alive = alive;
    }       // this - не явная ссылка на объект!!!


//    public Student(String name, int age, double mark, boolean alive){
//        this.name = name;
//        this.age = age;
//        this.mark = mark;
//        this.alive = alive;
//    }

    public Student(String n) {
        name = n;
    }

    public Student(boolean al) {
        alive = al;
    }
    // конструктор копирования
    public Student(Student student){
        name = student.name;
        age = student.age;
        mark = student.mark;
        alive = student.alive;
    }

    public String getInfo() {

        return name
                + ": age = " + age
                + ", mark = " + mark
                + ", is alive = " + (alive ? "yes" : "no");
    }
}
