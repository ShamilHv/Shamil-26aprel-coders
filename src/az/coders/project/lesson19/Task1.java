package az.coders.project.lesson19;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = scan.nextInt();
        System.out.println(reverseNumber(num));


    }
  public static int reverseNumber(int num){
      String reverse = String.valueOf(num);
      String reversed = new StringBuilder(reverse).reverse().toString();
      num = Integer.parseInt(reversed);
      return num;
  }

}
