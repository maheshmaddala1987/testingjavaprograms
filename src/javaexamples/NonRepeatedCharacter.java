package javaexamples;

public class NonRepeatedCharacter {

    public static void main(String[] args) {

        String s = "maheshreddy";

        int nonRepeatedCount = 0;
        char secondNonRepeated = '\0';
        char lastNonRepeated = '\0';

        for (int i = 0; i < s.length(); i++) {

            int count = 0;

            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    count++;
                }
            }

            if (count == 1) {
                nonRepeatedCount++;

                if (nonRepeatedCount == 2) {
                    secondNonRepeated = s.charAt(i);
                }

                lastNonRepeated = s.charAt(i);
            }
        }

        System.out.println("2nd Non-Repeated Character : " + secondNonRepeated);
        System.out.println("Last Non-Repeated Character: " + lastNonRepeated);
    }
}