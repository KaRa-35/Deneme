package day24;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] array = {1,2,2,3,4,5};
    int[] ReversedArray=new int[array.length];

    for (int i = array.length-1,j=0;i>=0 ;i--,j++){
        ReversedArray[j]=array[i];
    }
        System.out.println( Arrays.toString(array));
        System.out.println(Arrays.toString(ReversedArray));


    }
}
