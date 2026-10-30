package javaexamples;

public class Programa3b2c4Toaaabbcccc {

    public static void main(String[] args) {

        String s = "a3b2c4";
        String result = "";

        for (int i = 0; i < s.length(); i += 2) {

            char ch = s.charAt(i);
            int count = s.charAt(i + 1) - '0';
            
            System.out.println(count);

            for (int j = 0; j < count; j++) {
                result += ch;
            }
        }

        System.out.println(result);
    }
}