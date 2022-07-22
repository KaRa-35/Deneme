package day33Methods;

import java.util.Arrays;

public class Warmup1 {

    public static void main(String[] args) {
        int[] numbers={10,20,30,40};
        numbers=reverse(numbers);
        System.out.println(Arrays.toString(numbers));

        char[] characters= {'a','j','k','m','t'};
        characters=reverse(characters);
        System.out.println(Arrays.toString(characters));

        double[] doubler={1.2,3.2,6.9,8.0};
        doubler=reverse(doubler);
        System.out.println(Arrays.toString(doubler));
    }

    public static int[] reverse(int[] arr1){
        int[] result = new int[arr1.length];
        for (int i= arr1.length-1 , j=0;i>=0; i--,j++){
            result[j]=arr1[i];
        }
        return result;
    }
    public static char[] reverse(char[] arr1){
        char[] result = new char[arr1.length];
        for (int i = arr1.length-1 , j=0;i>=0; i--,j++){
            result[j]=arr1[i];
        }
        return result;

    }
    public static double[] reverse(double[] arr1){
        double[] result=new double[arr1.length];
        for(int i = arr1.length-1,j=0;i>=0;i--,j++){
            result[j]=arr1[i];
        }
        return result;
    }
}
