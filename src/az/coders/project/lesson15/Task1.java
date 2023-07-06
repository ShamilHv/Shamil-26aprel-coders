package az.coders.project.lesson15;

import java.util.Date;
import java.util.Optional;
import java.util.stream.Stream;

public class Task1 {
    public void main(String[] args) {
    User user1=new User();
    User user2=new User();
    user1.setName("Shamil");
    user1.setBalance(2000);
    user1.setSurname("Heydarov");
    user1.setCardNumber("1234567891234567");
    user2.setName("Vagif");
    user2.setSurname("Ehmedov");
    user2.setCardNumber("6738940284736475");
    user2.setBalance(1000);



                }
       public static boolean transfer(String sender, String reciever, int amount, User user1, User user2){

            return true;
    }



}
class Card{


}

class User {
    String name;
    String surname;
    String cardNumber;
    int balance;

    public String getCardNumber() {
        return cardNumber;
    }
    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }
    public int getBalance() {
        return balance;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
}
