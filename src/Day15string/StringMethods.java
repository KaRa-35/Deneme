package Day15string;

import java.util.Locale;
import java.util.Scanner;

public class StringMethods {

    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);

        char ch1=input.next().charAt(0);

        System.out.println("ch1 = " + ch1);

        String word= "cybertek School";

        char ch2=word.charAt(11);

        System.out.println("ch2 = " + ch2);

        String s="cybertek";
        s = s.toUpperCase();
        System.out.println(s);

        String s2="DDDDDDUUUMMMMDOOM";
        s2=s2.toLowerCase();
        System.out.println(s2);
    }
}
