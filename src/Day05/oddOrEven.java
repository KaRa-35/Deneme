package Day05;


public class oddOrEven {

    public static void main(String[] args) {

        int number= 2100;

        boolean isEven = number%2 == 0 ;
        boolean isOdd =  number%2 > 0 ;

        System.out.println(number+ "is an even number "+ isEven);
        System.out.println(number + "is an odd number "+ isOdd);

    }
}
