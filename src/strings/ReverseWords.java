package strings;


public class ReverseWords {
    public static void main(String[] args) {
        String s = "this is testing";

        String[] words = s.split(" ");
        String result = "";

        for (int i = words.length - 1; i >= 0; i--) {
            result = result + words[i]+ " ";
        }

        System.out.println("Output: " + result.trim());
    }
}
