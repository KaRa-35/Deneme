package day24;

import java.util.Arrays;

public class Stringmethods {
    public static void main(String[] args) {

        String sentence ="GaLatasaray is the biggest club in the world";
        String [] words= sentence.split(" ");

        System.out.println(Arrays.toString(words));

    }
}
