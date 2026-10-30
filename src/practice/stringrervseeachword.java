package practice;

public class stringrervseeachword {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		String str = "Simply Easy Learning";
	      System.out.println("The original string is: " + str);
	      String strWords[] = str.split(" ");
	      
	      String rev = "";
	      for (String sw : strWords) {
	         
	         String reverseWord = "";
	         for (int i = sw.length() - 1; i >= 0; i--) {
	            reverseWord += sw.charAt(i);
	         }
	        
	         rev += reverseWord + " ";
	      }
	      System.out.println("The modified string is: " + rev.trim());

	}

}
