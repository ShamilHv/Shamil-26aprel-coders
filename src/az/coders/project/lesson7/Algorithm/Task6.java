package az.coders.project.lesson7.Algorithm;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        System.out.println(findEbob(a, b));

    }

    public static int findEbob(int a, int b) {
        int ebob = 1;
        if(a<b){
            for (int i = 1; i < a; i++) {
                if (a % i == 0 && b % i == 0) {
                    ebob = i;
                }
            }
            return ebob;
        }else{
            for (int i = 1; i <b; i++) {
                if (a % i == 0 && b % i == 0) {
                    ebob = i;
                }
            }
            return ebob;
        }
        }

}
