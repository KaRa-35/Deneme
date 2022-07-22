package day24;

public class frequency {
    public static void main(String[] args) {
        int [] arr={1,2,3,1,2,5,4,6,2,2};

        for (int j=0; j< arr.length;j++) {
            int count = 0;
            int element = arr[j];

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == element) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println("element is unique " + element);
            }

        }
    }
}
