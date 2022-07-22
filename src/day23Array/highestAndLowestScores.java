package day23Array;

public class highestAndLowestScores {

    public static void main(String[] args) {

        int[] scores = {85, 70, 90, 98, 100};
        String[] students = {"Layla", "kim", "andrew", "jr", "ali"};

        int maxScore=scores[0];
        int minScores=scores[0];
        String maxName=students[0];
        String minName=students[0];


        for (int i = 0; i <= students.length - 1; i++) {
            System.out.println(students[i] + ":" + scores[i]);
            String eachName= students[i];
            int eachScores= scores[i];

            if (eachScores >= maxScore){
                maxScore=eachScores;
                maxName=eachName;
            }
            if (eachScores<=minScores){
                minScores=eachScores;
                minName=eachName;
            }
        }
        System.out.println(maxName+" has maxScore = " + maxScore);
        System.out.println(minName+" has minScores = " + minScores);
    }
}