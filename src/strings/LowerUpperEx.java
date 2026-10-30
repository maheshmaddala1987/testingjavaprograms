package strings;



	public class LowerUpperEx {
	    public static void main(String[] args) {
	        String str = "MaHeSh";
	        String result = "";

	        for (int i = 0; i < str.length(); i++) {
	            char c = str.charAt(i);

	            if (Character.isLowerCase(c)) {
	                result += Character.toUpperCase(c); // convert to uppercase
	            } else if (Character.isUpperCase(c)) {
	                result += Character.toLowerCase(c); // convert to lowercase
	            } else {
	                result += c; // keep other characters unchanged
	            }
	        }

	        System.out.println("Converted string: " + result);
	    }
	}
