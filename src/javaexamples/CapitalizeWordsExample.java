// Java Program to capitalize the first letter of each word in a String using split() and substring() methods
package javaexamples;


public class CapitalizeWordsExample {
    public static void main(String[] args) {
        String input = "telcome to geeksforgeeks test";

        // Split words and build result directly
        String[] words = input.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            result.append(Character.toUpperCase(word.charAt(0)))   // first letter uppercase
                  .append(word.substring(1).toLowerCase())         // rest lowercase
                  .append(" ");
        }

        System.out.println("Input: " + input);
        System.out.println("Output: " + result.toString().trim());
    }
}
