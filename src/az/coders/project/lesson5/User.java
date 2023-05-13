package az.coders.project.lesson5;

public class User {
    private String name;
    private String surname;
    private int age;

    public String getName() {
        return name;
    }

    public boolean setName(String name) {
        if (name.matches(".*\\d.*") || name.matches(".*[!@#$%^&*()_=+{}|;':\"<>,.?/\\\\-].*") || name.length() <= 3) {
            return false;
        }
        this.name = name;
        return true;
    }

    public String getSurname() {
        return surname;
    }

    public boolean setSurname(String surname) {
        if (surname.matches(".*\\d.*") || surname.matches(".*[!@#$%^&*()_=+{}|;':\"<>,.?/\\\\-].*") || surname.length() <= 3) {
            return false;
        }
        this.surname = surname;
        return true;
    }

    public int getAge() {
        return age;
    }

    public boolean setAge(int age) {
        if (age < 18 || age > 100) {
            return false;
        }
        this.age = age;
        return true;
    }
}
