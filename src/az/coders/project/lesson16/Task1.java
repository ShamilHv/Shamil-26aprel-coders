package az.coders.project.lesson16;

import az.coders.project.lesson5.User;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Task1 {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();

        Student st1 = new Student("Samir", "Mammadov", 25);
        Student st2 = new Student("Vagif", "Cafarov", 30);
        Student st3 = new Student("Aslan", "Necefov", 28);
        list.add(st1);
        list.add(st2);
        list.add(st3);
        Optional<Student> biggest = list.stream().max(Comparator.comparingInt(x -> x.getAge()));
        biggest.ifPresent(x -> System.out.println(x.getName() + " " + x.getSurname()));
    }
}
class Student {
    String name;
    String surname;
    int age;


    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }



    public Student(String name, String surname, int age) {
        this.name = name;
        this.surname=surname;
        this.age = age;
    }



}
