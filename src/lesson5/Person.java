package lesson5;

public class Person {
    private String fio;
    private String position;
    private String email;
    private String telefon;
    private int salary;
    private int age;

    public Person(String fio, String position, String email, String telefon, int salary, int age) {
        this.fio = fio;
        this.position = position;
        this.email = email;
        this.telefon = telefon;
        this.salary = salary;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "fio='" + fio + '\'' +
                ", position='" + position + '\'' +
                ", email='" + email + '\'' +
                ", telefon='" + telefon + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }

    public int getAge() {
        return age;
    }
}
