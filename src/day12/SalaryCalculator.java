package day12;

import java.util.Scanner;

public class SalaryCalculator {

    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);

        System.out.println("Waht is your Hourly Rate ?");
        int hourlyRate = input.nextInt();
        System.out.println("how many hours are u working ?");
        int hour = input.nextInt();
        System.out.println("what is your ratio for tax cut ?");
        double taxCut= input.nextDouble();

        double salary =  hourlyRate* hour  * ( 1  - taxCut);
        System.out.println("salary = " + salary);

    }
}
