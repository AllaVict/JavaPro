package telran.lessons.Lesson2_16_02_HW;

//        1.Person
//        Создать класс Person, который содержит:
//        переменные fullName, age;
//        методы move() и talk(), в которых просто вывести на консоль сообщение -"Такой-то Person говорит".
//        Добавьте два конструктора  - Person() и Person(fullName, age).
//        Создайте два объекта этого класса. Один объект инициализируется конструктором Person(),
//        другой - Person(fullName, age)


public class Person {
    private String fullName;
    private int age;

    public Person() {
    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public void move() {
        System.out.println("This Person move");
    }

    ;

    public void talk() {
        System.out.println("This Person talk");
    }

    ;


}
