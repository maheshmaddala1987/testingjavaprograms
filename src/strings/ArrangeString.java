package strings;

public class ArrangeString {

    public static void main(String[] args) {

        String str = "Mahesh@123Reddy!";

        String vowels = "";
        String consonants = "";
        String symbols = "";

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (Character.isLetter(ch)) {

             

                if (ch == 'a' || ch == 'e' ||
                    ch == 'i' || ch == 'o' ||
                    ch == 'u') {

                    vowels += ch;
                } else {
                    consonants += ch;
                }

            } else {
                symbols += ch;
            }
        }

        System.out.println(vowels + consonants + symbols);
    }
}