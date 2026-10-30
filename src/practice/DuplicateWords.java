package practice;

public class DuplicateWords {

    public static void main(String[] args) {

        String s = "this is prashanth and is good boy bad boy is and boy with how many times with count and duplicate";

        String[] words = s.split(" ");

        for (int i = 0; i < words.length; i++) {

            int count = 1;

            for (int j = i + 1; j < words.length; j++) {

                if (words[i].equals(words[j])) {
                    count++;
                    words[j] = "";
                }
            }

            if (!words[i].equals("") && count > 1) {
                System.out.println(words[i] + " = " + count);
            }
        }
    }
}