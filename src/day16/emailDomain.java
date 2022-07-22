package day16;

public class emailDomain {

    public static void main(String[] args) {

        String email= "ykara1626@gmail.com";

        int beginningIndex = email.indexOf("@") +1;
        int endingIndex=email.indexOf(".");
        String domain = email.substring(beginningIndex,endingIndex);

        System.out.println("domain = " + domain);
    }
}
