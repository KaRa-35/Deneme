package Day29ReturnMethods;

import java.util.Arrays;

public class Combination {

    public static void main(String[] args) {
        MergeArrrays(new int[]{25, 23, 5, 6}, new int[]{5, 9, 6, 7, 6});

    }
    public static void MergeArrrays(int[] arr1, int[] arr2){

        int[] arr3= new int[arr1.length+ arr2.length];
        int i =0;

        for (int each : arr1){
            arr3[i++]=each;
        }
        for (int each : arr2){
            arr3[i++]=each;
        }

        System.out.println(Arrays.toString(arr3));
    }
}
