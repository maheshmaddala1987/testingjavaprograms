package practice;

public class StringCaseConversion {
    public static void main(String[] args) {
        String s = "Gahesh reddy test ram";

        char[] chars = s.toCharArray();  // convert to char array manually

        boolean newWord = true; // flag to detect word boundaries

        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];

            if (c == ' ') {
                newWord = true; // next character starts a new word
            } else {
                if (newWord) {
                    // First character of word → Uppercase
                    if (c >= 'a' && c <= 'z') {
                        chars[i] = (char)(c - 32); // convert to uppercase using ASCII
                    }
                    newWord = false;
                } else {
                    // Remaining characters → Lowercase
                    if (c >= 'A' && c <= 'Z') {
                        chars[i] = (char)(c + 32); // convert to lowercase using ASCII
                    }
                }
            }
        }

        // Print result
        for (char ch : chars) {
            System.out.print(ch);
        }
    }
}
