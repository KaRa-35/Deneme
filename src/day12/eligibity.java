package day12;

import java.util.Scanner;

public class eligibity {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your Age :");
        int age = input.nextInt();

        if (age>=21) {
            System.out.println(" you re eligible");

        }
        else  {
            System.out.println(" you cant !");
        }
    }
}
