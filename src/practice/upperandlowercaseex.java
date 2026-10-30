package practice;

public class upperandlowercaseex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "this is testing by Reddy";
		String[] words = s.split(" ");

		String result = "";

		for (int i = 0; i < words.length; i++) {
			String w = words[i];

			if (i == words.length - 1) {

				result += Character.toLowerCase(w.charAt(0)) + w.substring(1) + " ";
			} else {

				result += Character.toUpperCase(w.charAt(0)) + w.substring(1) + " ";
			}
		}

		System.out.println(result.trim());
	}
}
