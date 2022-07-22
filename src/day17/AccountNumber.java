package day17;

import java.util.Scanner;

public class AccountNumber {

    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        System.out.println("Enter your accoun number");
        String accountNumber=input.next();

        if (accountNumber.charAt(0) =='2' && accountNumber.length() ==7 ) {
            System.out.println(" Valid Account");
        } else if (accountNumber.charAt(0)=='5' && accountNumber.length() ==10) {
            System.out.println(" Valid Account");

        }else{
            System.out.println(" invalid account");
        }


    }
}
