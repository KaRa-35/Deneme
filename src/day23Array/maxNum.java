package day23Array;

public class maxNum {

    public static void main(String[] args) {

        int[] numbers = {10,5,6,21,200,-1};
        int max = numbers [0];
        int min = numbers[0];


        for (int i =0; i<= numbers.length-1;i++){

            int each = numbers[i];

            if (each > max){
                max = each ;

            }
            if (each<min){
                min = each ;
            }
        }
        System.out.println("max number is => " + max);
        System.out.println("min = " + min);
    }
}
