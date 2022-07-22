package Day15string;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class simpleCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println(" Enter your first number");
        double num1=input.nextDouble();

        System.out.println(" Enter your math operator");
        char mathOperator =input.next().charAt(0);

        System.out.println(" Enter your second number");
        double num2=input.nextDouble();

        double result=0;
        switch (mathOperator){

            case'-':
                result=num1-num2;
                break;

            case'+':
                result=num1+num2;
                break;

            case'*':
                result=num1*num2;
                break;

            case'/':
                result=num1/num2;
                break;

            default:
                System.out.println("invalid input");
        }
        System.out.println("result = " + result);
    }
}
