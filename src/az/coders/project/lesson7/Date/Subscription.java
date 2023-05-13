package az.coders.project.lesson7.Date;

import java.time.LocalDate;
import java.util.Scanner;

public class Subscription {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the price: ");
        int amount = scan.nextInt();
       boolean cond=true;
        while(true){
          if(amount==5||amount==15||amount==25||amount==60){
              break;
          }else{
              System.out.println("Enter again: ");
              amount=scan.nextInt();
          }
        }
        System.out.println(getSubscription(amount));

    }
    public static LocalDate getSubscription(int amount) {
        LocalDate currentDate = LocalDate.now();
        if (amount == 5) {
            return currentDate.plusDays(7);
        } else if (amount == 15) {
            return currentDate.plusDays(30);
        } else if (amount == 25) {
            return currentDate.plusDays(60);
        } else if (amount == 60) {
            return currentDate.plusDays(365);
        } else {
            return currentDate;
        }
    }
}
