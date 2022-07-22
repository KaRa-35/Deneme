package day10;

public class salaryAfterTax {
    public static void main(String[] args) {

        double salary = 100_000;

        double taxRate = 0;

        if (salary >= 130000) {
            taxRate = 0.35;
        } else if (salary >= 100000) {
            taxRate = 0.30;
        } else if (salary >= 80000) {
            taxRate = 0.25;
        } else {
            taxRate = 0.20;
        }

        boolean isMarried=true;
        if (isMarried){
            taxRate-=0.05;
        }
        System.out.println("taxRate = " + taxRate);
        double salaryAfterTax=salary*(1-taxRate);
        System.out.println("salaryAfterTax = " + salaryAfterTax);

    }
}
