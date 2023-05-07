package az.coders.project;

import java.util.Scanner;

public class Degree {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter hour: ");
        double hour=scan.nextInt();
        System.out.println("Enter minute: ");
        double minute=scan.nextInt();
        double hourAt=0;
        if(hour>12){
            hour=hour-12.0;
        }
        switch((int)hour) {
            case 1: hourAt=5;
            break;
            case 2: hourAt=10;
                break;
            case 3: hourAt=15;
                break;
            case 4: hourAt=20;
                break;
            case 5: hourAt=25;
                break;
            case 6: hourAt=30;
                break;
            case 7: hourAt=35;
                break;
            case 8: hourAt=40;
                break;
            case 9: hourAt=45;
                break;
            case 10: hourAt=50;
                break;
            case 11: hourAt=55;
                break;
            case 12: hourAt=0;
                break;
        }
        hourAt+=(minute*(1/12.0));
        System.out.println(hourAt);
        System.out.println(minute);
 double degree= Math.abs(minute-hourAt)*6;
        System.out.println(degree);
    }
}

