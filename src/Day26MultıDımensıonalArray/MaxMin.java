package Day26MultıDımensıonalArray;

public class MaxMin {
    public static void main(String[] args) {

        int [][] arr1={{20,30,40,30},{78,98,4,5,63}};

        int max = arr1[0][0];
        int min = arr1[0][0] ;

        for (int[] each1D: arr1){
             for (int element :each1D) {
                 if (element> max){
                     max=element;
                 }
                 if (element<min) {
                     min=element;
                 }
             }
            System.out.println(min);
            System.out.println(max);
        }

    }
}
