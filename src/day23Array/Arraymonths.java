package day23Array;

import java.util.Scanner;

public class Arraymonths {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayı gırınız");
        int number = input.nextInt();

        String[] month= {"january","february","march", "april","may","june","july","august","september","october","november","december"};
        System.out.println(month[number-1]);


    }
}
