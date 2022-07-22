package day03;

public class SalaryCalculator {

    public static void main(String[] args) {

        short hourlyRate = 50 ;
        short weeklyHours = 40 ;
        short salary = (short) (hourlyRate * weeklyHours);

        System.out.println(salary);

    }
}
