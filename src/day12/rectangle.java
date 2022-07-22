package day12;


import java.util.Scanner;

public class rectangle {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("enter the width of rect");
        int width = input.nextInt();
        System.out.println("enter your rectangle height");
        int height = input.nextInt();

        int area= width* height/2;

        System.out.println("area = " + area);
    }
}
