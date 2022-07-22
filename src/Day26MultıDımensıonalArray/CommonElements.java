package Day26MultıDımensıonalArray;

public class CommonElements {

    public static void main(String[] args) {

        int[] Array={ 1,5,16,7,8};

        int[] Arr1= {5,6,1,16,7,656,52,6,0};

        for( int element :Arr1){
            for (int each:Array){
                if (element == each) {
                    System.out.println(element);
                }
            }
        }
    }
}
