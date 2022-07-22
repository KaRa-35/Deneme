package day16;

import java.util.Scanner;

public class StringPractise {

    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        System.out.println("Enter two words");
        String word1 =input.next();
        String word2=input.next();

        String result = word1.substring(1)+ word2.substring(1);

    }
}
