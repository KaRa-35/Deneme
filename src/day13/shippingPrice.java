package day13;

import java.util.Scanner;

public class shippingPrice {

    public static void main(String[] args) {


        Scanner input= new Scanner(System.in);
        System.out.println("urun fiyatini giriniz");
        double price = input.nextDouble();

        System.out.println("Are u a prime member ?");
        boolean member=input.nextBoolean();
        double totalPrice = (member)? price:(price>=25) ? price: price + 3.99;
        System.out.println("totalPrice =  $ " + totalPrice);


    }
}
