/**
 *
 * Java 1. Homework 5
 *
 * @author Sarana Uskeeva
 * @version 26.09.2021
 */
public class Main {
    public static void main(String[] args) {
        Person[] person = new Person[5];
        person[0] = new Person("Petrov", "Engineer", "petrov@mail.ru", 12321334, 46000, 51);
        person[1] = new Person("Salnokov", "Engineer1", "salnokov@mail.ru", 245643, 43000, 43);
        person[2] = new Person("Medvedev", "Engineer2", "medvedev@mail.ru", 34352, 25000, 45);
        person[3] = new Person("Ivanov", "IT-specialist", "ivanov@mail.ru", 34551, 49000, 49);
        person[4] = new Person("Sidorov", "IT-specialist1", "sidorov@mail.ru", 654240, 27000, 27);
        for (int i = 0; i < person.length; i++) {
            if (person[i].getAge() > 40) {
                person[i].printInfo();
            }
        }
    }
}
