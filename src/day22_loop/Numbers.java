package day22_loop;

import java.util.Scanner;

public class Numbers {

    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        System.out.println(" Sayi giriniz");
        int n= input.nextInt();

        if (n<= 0){
            System.out.println("invalid number");
            System.exit(0);
        }

        String result1 = " Divisible by 5=";
        String result2 = " divisible by 7=";
        String result3 = " Divisible by 3=";


        for (int i = 1; i <=n; i++){
            if (i%5 == 0){
                result1 += i +" ";
            }
            else if (i%7==0){
                result2+= i+ " ";
            }
            else if (i%3==0){
                result3+= i+ " ";
            }


        }
        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);
        System.out.println("result3 = " + result3);
    }
}
