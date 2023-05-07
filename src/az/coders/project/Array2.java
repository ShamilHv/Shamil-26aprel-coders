package az.coders.project;

import java.util.Arrays;
import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {
        int index = -1;
        int arr[] = {2, 4, 5, 8, 12};
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scan.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > num) {
                index = i;
                break;
            }

        }
        System.out.println(index);
        int arr2[] = new int[arr.length + 1];
        if (index > 0) {
            for (int i = 0; i < arr.length + 1; i++) {
                if (i < index) {
                    arr2[i] = arr[i];
                } else if (i == index) {
                    arr2[i] = num;
                } else {
                    arr2[i] = arr[i - 1];
                }
            }
        } else {
            for (int i = 0; i < arr2.length; i++) {
                if (i != arr2.length - 1)
                    arr2[i] = arr[i];
                else arr2[i] = num;
            }
        }

        System.out.println(Arrays.toString(arr2));

    }
}
