package lesson5;

public class Main {
    public static void main(String[] args) {

        Person[] personArray = new Person[5];
        personArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
        personArray[1] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
        personArray[2] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 41);
        personArray[3] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 40);
        personArray[4] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);

        for (int i = 0; i < 5; i++) {
            if (personArray[i].getAge() > 40) {
                System.out.println(" Сотрудник старше 40 лет " +personArray[i].toString());
            }
            //System.out.println(" Сотрудник " +personArray[i].toString());
        }


    }
}
