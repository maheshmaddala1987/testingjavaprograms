package practice;

public class stringuppercaseex {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		 String s = "Java Programming 123!";
	        String upperCaseChars = "";
	        String lowerCaseChars = "";

	        for (int i = 0; i < s.length(); i++) {
	            char ch = s.charAt(i);
	            if (Character.isUpperCase(ch)) {
	                upperCaseChars += ch;
	            } else if (Character.isLowerCase(ch)) {
	                lowerCaseChars += ch;
	            }
	        }

	        System.out.println("Uppercase characters: " + upperCaseChars);
	        System.out.println("Lowercase characters: " + lowerCaseChars);
	    }
	

	}


