package day24;

import java.util.Arrays;

public class ClassMate {

    public static void main(String[] args) {

        String[] classmates = {"gul","yener","jake","jay","kent","mike"};

        System.out.println(Arrays.toString(classmates));

        for (int i =0 ; i<= classmates.length-1; i++) {
            System.out.println(classmates[i].substring(0,2));
        }


    }
}
