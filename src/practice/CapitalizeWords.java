package practice;

public class CapitalizeWords {

    public static void main(String[] args) {

        String s = "gahesh reddy test ram";

        String[] words = s.split(" ");

        System.out.print(words[0]);

        for (int i = 1; i < words.length; i++) {

            System.out.print(" "
                    + Character.toUpperCase(words[i].charAt(0))
                    + words[i].substring(1));
        }
    }
}