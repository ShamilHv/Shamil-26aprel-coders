package az.coders.project.lesson5;

import java.util.Random;
import java.util.Scanner;

public class FindNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        int number = rand.nextInt(100);
        System.out.println("Take a guess between 0 and 100: ");
        int guess=-2;
        while (guess!=number) {
            System.out.println("Enter number:");
            guess = scan.nextInt();
            if (guess == number) {
                System.out.println("You have found the number " + number);
            } else if (guess < number) {
                System.out.println("higher");
            } else {
                System.out.println("lower");
            }
        }

    }
}
