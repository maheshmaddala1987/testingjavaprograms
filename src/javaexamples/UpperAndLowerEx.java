package javaexamples;

public class UpperAndLowerEx {

    public static void main(String[] args) {
        String str = "MaheShTeSt";

        String result = ""; 
      

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (Character.isUpperCase(c)) {
            	result += c; // add uppercase char
            } else if (Character.isLowerCase(c)) {
            	result += c; // add lowercase char
            }
        }
        
       

       System.out.println("Uppercase letters: " + result);
       // System.out.println("Lowercase letters: " + lower);
    }
}
