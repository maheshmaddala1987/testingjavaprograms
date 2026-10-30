
package practice;

public class stringreverepart {

    public static void main(String[] args) {

        String s = "this is my name";

        String[] words = s.split(" "); 
        String result = "";

        // iterate from last word to firs
        for (int i = words.length - 1; i >= 0; i--) {   

            // reverse the characters of the current word
            String reversedWord = "";
            String w = words[i];

            for (int j = w.length() - 1; j >= 0; j--) {
                reversedWord += w.charAt(j);
            }

            // append to result
            result += reversedWord + " ";
        }

        System.out.println(result.trim());
    }
}
