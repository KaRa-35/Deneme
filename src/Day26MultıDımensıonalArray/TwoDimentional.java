package Day26MultıDımensıonalArray;

import java.util.Arrays;

public class TwoDimentional {
    public static void main(String[] args) {

        int [][] array2D = {  {1,2,3}, {7,8,9},{5,4,6 } };

        System.out.println("array2D.length = " + array2D.length);

        System.out.println("deepToString = " + Arrays.deepToString(array2D));

        System.out.println((array2D[1][1]));

        System.out.println(Arrays.toString(array2D[1]));


    }
}
