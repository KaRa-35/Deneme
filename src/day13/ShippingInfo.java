package day13;

import java.util.Scanner;

public class ShippingInfo {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Building numberi giriniz");
        int buildingNum= input.nextInt();

        input.nextLine();

        System.out.println("street adini giriniz");
        String streetAddress= input.nextLine();

        System.out.println("City name i giriniz");
        String cityName= input.nextLine();

        System.out.println("State adi giriniz");
        String state= input.nextLine();

        System.out.println("zip code u giriniz");
        String zipCode=input.next();
        input.nextLine();

        System.out.println("adinizi giriniz");
        String fullName=input.nextLine();

        String shippingInfo = fullName + "\n"+ buildingNum + " "+ streetAddress + "\n" +cityName + " , " + state +" " + zipCode ;
        System.out.println("shippingInfo = " + shippingInfo);

    }
}
