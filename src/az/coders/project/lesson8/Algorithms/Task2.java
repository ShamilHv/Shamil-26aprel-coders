package az.coders.project.lesson8.Algorithms;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int arr[] = {1, 4, 7, 9, 23};
        System.out.println("Enter the number: ");
        int num = scan.nextInt();
        int indexAt = (arr.length - 1) / 2;
        int leftIndex = 0;
        int rightIndex = arr.length - 1;

        while(rightIndex>leftIndex){
            int midIndex=(leftIndex+rightIndex)/2;
            if(num==arr[midIndex]){


            }




        }


    }


}

