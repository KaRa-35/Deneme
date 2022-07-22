package day13;

import java.util.Scanner;

public class dollarToCents {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("enter cents");
        double cents =input.nextDouble();
        double dollars ;

        System.out.println("cents = " + cents);
        System.out.println("dollars = " + cents/100);

    }
}
