package practice;

public class stringcharacterssymsbolsex {

	public static void main(String[] args) {
		// TODO Auto-generated method st
		String text = "prashanthreddy@123";

        String characters = "";
        String digits = "";
        String symbols = "";

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (Character.isAlphabetic(ch)) {
                characters = characters + ch;
            } else if (Character.isDigit(ch)) {
                digits = digits + ch;
            } else {
                symbols = symbols + ch;
            }
        }

        System.out.println("Characters are: " + characters);
        System.out.println("Digits are: " + digits);
        System.out.println("Symbols are: " + symbols);
    }
}