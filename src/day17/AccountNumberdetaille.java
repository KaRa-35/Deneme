package day17;

import java.util.Scanner;

public class AccountNumberdetaille {

    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        System.out.println("Enter your account number");
        String account = input.next();
        char firstChar= account.charAt(0);

        String result =" ";

        switch (firstChar){
            case '2':
                if (account.length() == 7){
                    System.out.println(" valid account");
                }
                else {
                    System.out.println("invalid account should be 7 characters");
                }
                break;

            case '5':
                if(account.length() == 10){
                    System.out.println("valid account");
                }
                else {
                    System.out.println("invalid account should be 10  characters");
                }
                break;

            default:
                System.out.println("invalid account");
        }
        System.out.println("result = " + result);
    }
}
