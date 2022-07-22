package day12;

import java.util.Scanner;
public class scanner {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num1= input.nextInt();
        int num2= input.nextInt();

        int addition = num1 +num2 ;
        int substraction = num1 - num2;
        int multipication = num1 * num2;
        int division = num1 / num2 ;

        System.out.println("addition = " + addition);
        System.out.println("substraction = " + substraction);
        System.out.println("multipication = " + multipication);
        System.out.println("division = " + division);
    }

}
