package HomeWorkLesson5;

// 1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
public class Employee {

    private String name;
    private String position;
    private String email;
    private String phoneNumber;
    private int salary;
    private int age;

    public Employee() {
    }

    // 2.Конструктор класса должен заполнять эти поля при создании объекта.

    public Employee (String name, String position, String email, String phoneNumber, int salary, int age) {

        this.name = name;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    // 3. Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
    public void ShowEmployee() {  // не думаю, что я верно поняла это задание

        System.out.println("Name:" + name + "| Position:" + position + "| E-mail:" + email + "| Phone Number: +7" + phoneNumber + "| Salary:" + salary + "$ | Age:" + age + " y.o");

    }

     int getAge() {
        return this.age;
    }
    String getInformation() {
        return "Name:" + this.name + "| Position:" + this.position + "| E-mail:" + this.email + "| Phone Number: +7" + this.phoneNumber + "| Salary:" + this.salary + "$ | Age:" + this.age + " y.o";
    }

}
