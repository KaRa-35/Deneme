package Day29ReturnMethods;

public class PosNegZero {

    public static void main(String[] args) {

        def(0);

    }

    public static int def(int a){

        if(a> 0){
            System.out.println("a is positive " + a);
        }
        else if (a<0) {
            System.out.println("a is negative " + a);
        }
        else {
            System.out.println("a is zero " + a);
        }
        return a;
    }
}
