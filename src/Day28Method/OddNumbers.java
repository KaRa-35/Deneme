package Day28Method;

public class OddNumbers {
    public static void main(String[] args) {
        ooddNumbers(20,80);
    }


    public static void ooddNumbers(int from,int to){

        for (int i=from ;i<=to;i++){
            if (i%2 != 0 ){
                System.out.println(i);
            }
        }

    }


}
