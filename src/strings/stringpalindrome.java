package strings;

public class stringpalindrome {

    public static void main(String[] args) {
        String s = "matm";
        String temp = "";

        // reverse the string
        for (int i = s.length() - 1; i >= 0; i--) {
            temp = temp + s.charAt(i);
        }

        // compare original and reversed
        if (s.equals(temp)) {
            System.out.println("String is palindrome: " + temp);
        } else {
            System.out.println("String is not palindrome: " + temp);
        }
    }
}
