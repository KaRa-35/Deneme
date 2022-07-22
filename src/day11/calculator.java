package day11;

public class calculator {

    public static void main(String[] args) {

        double n1= 100;
        double n2=6;

        char mathOperator = '&';

        switch (mathOperator){

            case '-':
                System.out.println(n1-n2);
                break;

            case'+':
                System.out.println(n1+n2);
                break;

            case'*':
                System.out.println(n1*n2);
                break;

            case '/':
                System.out.println(n1/n2);
                break;

            default:
                System.out.println("invalid input");
                break;

        }
    }
}
