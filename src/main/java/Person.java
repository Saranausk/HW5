/**
 *
 * Java 1. Homework 5
 *
 * @author Sarana Uskeeva
 * @version 26.09.2021
 */
public class Person {
    private String name;
    private String post;
    private String email;
    private int phone;
    private int salary;
    private int age;

     Person(String name, String post, String email, int phone, int salary, int age) {
        this.name = name;
        this.post = post;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public int getAge() {
        return age;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", post='" + post + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }
    public void printInfo(){
        System.out.println( "name "+ name + " Post:" + post + " email" + email + " Salary: " + salary + " age: " + age);
    }
}
