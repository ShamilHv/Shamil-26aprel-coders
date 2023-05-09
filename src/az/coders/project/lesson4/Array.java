package az.coders.project.lesson4;

import az.coders.project.lesson4.String;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter dimension:");
        int d= scan.nextInt();

        int[][] matrix = new int[d][d];

                for (int i = 0; i < matrix.length; i++) {
                    for (int j = 0; j < matrix[i].length; j++) {
                        if (j > i + 1) {
                            matrix[i][j] = 1;
                        }
                    }
                }
                for (int i = 0; i < matrix.length; i++) {
                    for (int j = 0; j < matrix[i].length; j++) {
                        System.out.print(matrix[i][j] + " ");
                    }
                    System.out.println();
                }

            }
        }




//        0 0 0 0 0
//        0 0 0 0 0
//        0 0 0 0 0
//        0 0 0 0 0
//        0 0 0 0 0




