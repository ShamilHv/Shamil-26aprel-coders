package az.coders.project.lesson16;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Task3 {
    public static void main(String[] args) {
        Student2 st1 = new Student2("Samir", 25, "Java");
        Student2 st2 = new Student2("Kamil", 28, "Python");
        Student2 st3 = new Student2("Famil", 32, "Java");
        Student2 st4 = new Student2("akif", 32, "Python");
        Student2 st5 = new Student2("elmar", 32, "Java");
        Student2 st6 = new Student2("revan", 32, "C#");
        List<Student2> myList = List.of(st1, st2, st3, st4, st5, st6);
        Map<String, List<Student2>> groupedMap = myList.stream().collect(Collectors.groupingBy(Student2::getGroupName));

        groupedMap.forEach((key, value) -> System.out.println(key+ ": " + value));
    }

}


class Student2 {

    String name;
    int age;
    String groupName;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public Student2(String name, int age, String groupName) {
        this.name = name;
        this.age = age;
        this.groupName = groupName;
    }
}


