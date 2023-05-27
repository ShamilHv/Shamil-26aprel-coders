package az.coders.project.lesson10;

import java.util.Scanner;

public class FactRecursion {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int fac=scan.nextInt();
        System.out.println(Fact(fac));

    }
    static int Fact(int fact){
        if(fact==2){
            return 2;
        }

        return fact*=(Fact(fact-1));
    }
}
