package az.coders.project.lesson4;

import az.coders.project.lesson4.String;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Fibonacci {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean check = false;
        int arr[] = new int[5];
        System.out.println("Enter elements of array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            if (i > 1) {
                if (arr[i] == arr[i - 1] + arr[i - 2]) {
                    check = true;
                } else {
                    check = false;
                }
            }
        }
        if (check) {
            System.out.println("it is fibonacci");
        } else {
            System.out.println("it is not fibonacci");
        }


    }
}