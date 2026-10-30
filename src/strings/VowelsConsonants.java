package strings;

public class VowelsConsonants {

    public static void main(String[] args) {
        String s = "maheshgtgtgt";

        int vowelCount = 0;
        int consonantCount = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vowelCount++;
                System.out.println("Vowel: " + c);
            } else  
            {
                consonantCount++;
                System.out.println("Consonant: " + c);
            }
        }

        System.out.println("Total vowels: " + vowelCount);
        System.out.println("Total consonants: " + consonantCount);
    }
}
