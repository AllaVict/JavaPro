package telran.lessons.Lesson2_16_02_HW;

//        1.Person
//        Создать класс Person, который содержит:
//        переменные fullName, age;
//        методы move() и talk(), в которых просто вывести на консоль сообщение -"Такой-то Person говорит".
//        Добавьте два конструктора  - Person() и Person(fullName, age).
//        Создайте два объекта этого класса. Один объект инициализируется конструктором Person(),
//        другой - Person(fullName, age)

//        2.Класс Phone.
//        Создайте класс Phone, который содержит переменные number, model и weight.
//        Создайте три экземпляра этого класса.
//        Выведите на консоль значения их переменных.
//        Добавить в класс Phone методы: receiveCall, имеет один параметр – имя звонящего.
//        Выводит на консоль сообщение “Звонит {name}”. Метод getNumber – возвращает номер телефона.
//        Вызвать эти методы для каждого из объектов.

public class Application {

    public static void main(String[] args) {

        Person personOne = new Person();
        Person personTwo = new Person("Jane Smith", 27);

        Phone phoneOne = new Phone(555663211,"Iphone",178);
        Phone phoneTwo = new Phone(777885433,"Xiaomi", 179 );
        Phone phoneThree = new Phone(333552884, "Samsung",177);

        System.out.println(phoneOne);
        System.out.println(phoneTwo);
        System.out.println(phoneThree);

        phoneOne.receiveCall("Jane");
        phoneTwo.receiveCall("Alla");
        phoneThree.receiveCall("King");

        phoneOne.getNumber();
        phoneTwo.getNumber();
        phoneThree.getNumber();



    }

}
