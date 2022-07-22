package day22_loop;

import java.util.Scanner;

public class Credentials {

    public static void main(String[] args) {

        String correctUsername= "Tf141" ;
        String correctPassword = "1234567890";

        Scanner input = new Scanner(System.in);
        System.out.println("Username i giriniz");
        String u = input.next();

        System.out.println("Password u giriniz");
        String p =input.next();

        if(u.equals(correctUsername) && p.equals(correctPassword)){
            System.out.println(" System Logged in");
        }
        else{

            for (int i = 1;i<=3; i++) {
                System.out.println("username or password is incorrect");
                System.out.println("Enter your username :");

                u = input.next();
                System.out.println("Enter your password");
                p = input.next();

                if(u.equals(correctUsername) && p.equals(correctPassword)){
                    System.out.println(" System Logged in");
                    break;
                }
                if (i==3){
                    System.out.println("Your account locked");
                    System.exit(0);
                }
            }
        }

    }
}
