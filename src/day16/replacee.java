package day16;

public class replacee {

    public static void main(String[] args) {

        String email= "Ysnkra1283@yahoo.com";

        email = email.replace("yahoo","gmail");

        System.out.println("email = " + email);

        String sentence = "The weather is hot";
        sentence = sentence.replace("weather", "girl");

        System.out.println("sentence = " + sentence);
    }
}
