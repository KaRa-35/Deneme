package Day32OverLoading;

import java.util.Arrays;

public class WarmUpTask2 {

    public static int[] addInteger(int[] array,int number) {
        int[] result= Arrays.copyOf(array,array.length+1);
        result[result.length-1]= number;
        return result;

    }
    public static double[] addDouble(double[] array, double number) {
        double[] result = Arrays.copyOf(array, array.length+1);
        result[result.length-1]=number;
        return result;

    }

    public static String[] addString(String[] array, String str) {
        String[] result = Arrays.copyOf(array, array.length+1);
        result[result.length-1]=str;
        return result;
    }

}
