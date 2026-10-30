package strings;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileCountExample {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\YourName\\Desktop\\sample.txt"; // change path

        int charCount = 0;
        int wordCount = 0;
        int lineCount = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;

            while ((line = br.readLine()) != null) {
                lineCount++; // count lines
                charCount += line.length(); // count characters in line

                // split words by spaces
                String[] words = line.trim().split("\\s+");
                wordCount += words.length;
            }

            System.out.println("Number of characters: " + charCount);
            System.out.println("Number of words: " + wordCount);
            System.out.println("Number of lines: " + lineCount);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
