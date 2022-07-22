package day23Array;

import java.util.Scanner;

public class overall {

    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);
        System.out.println("How many number do you want to enter ?");
        int[] number = new int [input.nextInt() ];
        int sum = 0 ;


        for (int i =0 ; i<=number.length -1; i++){
            System.out.println("Enter a number");
            number[i] = input.nextInt();
            sum += number[i];

        }
        double average = sum/number.length;
        System.out.println("average = " + average);
        System.out.println("sum = " + sum);

    }
}
