package az.coders.project.lesson19;

import javax.crypto.spec.PSource;
import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        float num1=scan.nextInt();
        System.out.println("Enter the second number: ");
        float num2=scan.nextInt();
        System.out.println("enter the operation you want: + , - , * , /");
        String op=scan.nextLine();
        calc(num1,num2,op);



    }
    public static void calc(float num1, float num2, String op){

        switch (op){
            case "+":
                System.out.println("Sum is: "+ num1+num2);;
            break;
            case "-":
                System.out.println("Difference is: "+(num1-num2));;
            break;
            case "*":
                System.out.println("Multiplication is: ");;
            break;
            case "/":
                System.out.println("Division is: "+ num1/num2);;
            break;
            default:
                System.out.println("Unvalid operation");
                break;


        }



    }

}
