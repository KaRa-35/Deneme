package Day26MultıDımensıonalArray;

import java.util.Arrays;

public class MoveTheItems {

    public static void main(String[] args) {

        int[] array ={ 0,0,30,4,0};

        int[] result= new int[array.length];

        for (int i=0, j=0;i< array.length;i++){

            if(array[i] != 0){
                result[j]=array[i];
                j++;
            }
        }

        System.out.println(" = " + Arrays.toString(result));
    }
}
