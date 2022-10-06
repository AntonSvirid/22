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
    public Student(String n, int a, double m, boolean al){
        name = n;
        age = a;
        mark = m;
        alive = al;
    }

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
