package strings;



public class HighestLengthString {
    public static void main(String[] args) {
        String s = "this is goog for testing selenium tetttttjfjffgygggugu";

        String[] words = s.split(" ");
        String longest = "";
        
        for (String word : words) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }

        System.out.println("Highest length string is: " + longest);
        System.out.println("Length: " + longest.length());
    }
}


