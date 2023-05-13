package az.coders.project.lesson7.Date;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class FindAge {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter your birth Date: 'yyyy-mm-dd' ");
        String birthDate=scan.nextLine();
        LocalDate dateNow= LocalDate.now();
        DateTimeFormatter date= DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate bDate= LocalDate.parse(birthDate,date);
        Period period=Period.between(bDate,dateNow);
        System.out.println("Your age is" + period.getYears());


    }
}
