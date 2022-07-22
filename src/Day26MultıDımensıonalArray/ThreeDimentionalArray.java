package Day26MultıDımensıonalArray;

import java.util.Arrays;

public class ThreeDimentionalArray {

    public static void main(String[] args) {

        int[][][] Array3D= {{{1,2,3},{8,7,9}},{{4,5,6},{95,1,7}}};

        System.out.println(Arrays.deepToString(Array3D));

        System.out.println(Arrays.deepToString(Array3D[1]));

        System.out.println(Arrays.toString(Array3D[1][1]));

        System.out.println(Array3D[1][1][2]);

    }
}
