package day33Methods;

import java.util.Arrays;

public class Warmup {

    public static void main(String[] args) {
        int[] array={5,7,8,9,10};
        System.out.println(" =>" + Arrays.toString(array));
        array=removeItem(array,3);
        System.out.println(" =>" + Arrays.toString(array));

        String[] students = {"kemal","nazim","ahmet","burcu"};
        System.out.println("=> " + Arrays.toString(students));
        students= removeItem(students,1);
        System.out.println("=> " + Arrays.toString(students));

        double[] arr1={8.5,7.3,4.2,1.0};
        System.out.println("=>> " + Arrays.toString(arr1));
        arr1=removeItem(arr1,3);
        System.out.println(" =>>> " + Arrays.toString(arr1));


    }

    public static int[] removeItem(int[] array, int index){

        if (index<0 || index> array.length){
            System.out.println("invalid");
        }
        int[] result = new int[array.length-1] ;

        for(int i = 0,j=0; i< array.length;i++){
            if(i == index){
                continue;
            }
            else {
                result[j++]=array[i];
            }

        }
        return result;
    }
    public static String[] removeItem(String[] array, int index){

        if (index<0 || index> array.length){
            System.out.println("invalid");
        }
        String[] result = new String[array.length-1] ;

        for(int i = 0,j=0; i< array.length;i++){
            if(i == index){
                continue;
            }
            else {
                result[j++]=array[i];
            }

        }
        return result;
    }
    public static double[] removeItem(double[] array, int index){

        if (index<0 || index> array.length){
            System.out.println("invalid");
        }
        double[] result = new double[array.length-1] ;

        for(int i = 0,j=0; i< array.length;i++){
            if(i == index){
                continue;
            }
            else {
                result[j++]=array[i];
            }

        }
        return result;
    }

}
