package az.coders.project.lesson7.Algorithm;

import java.util.Arrays;


public class Task1 {

    public static void main(String[] args) {

        int arr1[] = {1, 2, 3, 4, 5};
        int arr2[] = {4, 5, 6, 7, 8};

        String conj = "";
        String disc = "";
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    conj += String.valueOf(arr1[i]);
                } else {

                    disc += String.valueOf(arr1[i]);
                }


            }


        }

        System.out.println(conj);
        System.out.println(disc);


    }


}
