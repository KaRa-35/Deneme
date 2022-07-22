package day13;

import java.util.Scanner;

public class tekrar {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("lutfen sayi giriniz");
        int number = input.nextInt();
        System.out.println("lutfen bolmek istediginiz rakami giriniz");
        int diviseur= input.nextInt();

        switch (diviseur){

            case 1:
                System.out.println("number = " + number);
                break;

            case 2:
                System.out.println("number = "+ number/2+" kalani "+ number%2);
                break;

            case 3 :
                System.out.println("number = " + number/3 +" kalani "+ number%3);
                break;

            case 4 :
                System.out.println("number = " + number+" kalani "+ number%4 );
                break;

            default:
                System.out.println("invalid input");
        }
    }
}
