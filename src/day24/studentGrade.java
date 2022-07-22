package day24;

public class studentGrade {

    public static void main(String[] args) {

        String[] names = {"ali", "veli","ceyda"};
        int[] scores = {95,75,35};
        char[] grades =new char[names.length];
        for (int i =0;i<=names.length-1;i++) {

            int score =scores[i];
            if(scores[i] >= 90){
            grades[i] = 'A';
            }
            else if(scores[i] >= 80) {
            grades[i] = 'B';
            }
            else if(scores[i] >= 70) {
            grades[i] = 'C';
            }
            else if(scores[i] >=60) {
            grades[i] ='D';
            }
            else {
            grades[i] = 'F';
            }

            System.out.println(names[i] + " " + scores[i] + " " + "grade = " + grades[i]);
        }
    }
}
