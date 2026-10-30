package strings;

public class StringUniqueCharacters {

    public static void main(String[] args) {
        String ss = "testingby";

        for (int i = 0; i < ss.length(); i++) {
            boolean isUnique = true; // assume current char is unique

            for (int j = 0; j < ss.length(); j++) {
                if (i != j && ss.charAt(i) == ss.charAt(j)) {
                    isUnique = false; // found a duplicate
                    break;
                }
            }

            if (isUnique) {
                System.out.println("Non-repeated character: " + ss.charAt(i));
            }
        }
    }
}
