package az.coders.project.lesson18;

public class Task3 {

    public static void main(String[] args) {
        User user1= new User("Shamil","Shamil123");
        User user2= new User("Samir","Samir123");
        User user3= new User("Arif","Arif123");
        User user4= new User("Metin","Metin123");



    }




}

  class User{
    String username;
    String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }
}


