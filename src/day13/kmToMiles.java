package day13;

import java.util.Scanner;

public class kmToMiles {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("sayi giriniz ");
        int number= input.nextInt();
        if (number>= 1){
            System.out.println("km yi giriniz");
            double km= input.nextDouble();
            System.out.println("km = " + km);
            double mile= km*1.609;
            System.out.println("mile = " + mile);

        }
        else
        {
            System.out.println(" mil degerini giriniz");
            double miles = input.nextDouble();
            System.out.println("miles = " + miles);
            double kilometer= miles*0.62137;
            System.out.println("kilometer = " + kilometer);

        }
    }
}
