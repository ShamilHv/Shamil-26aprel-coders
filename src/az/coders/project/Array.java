package az.coders.project;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter dimension:");
        int d= scan.nextInt();
        int arr[][] = new int[d][d];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[0][arr.length-1]=1;


            }
        }




//        0 0 0 0 0
//        0 0 0 0 0
//        0 0 0 0 0
//        0 0 0 0 0
//        0 0 0 0 0


    }
}
