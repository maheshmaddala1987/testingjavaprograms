package practice;
import java.util.Scanner;
public class stringduplicateex {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		
		String temp=" ";

		    Scanner s = new Scanner(System.in); // Create a Scanner object
		    System.out.println("Enter a string:");
		    
		    String str = s.next(); // Read user input as a string
		    System.out.println("You entered: " + str);
		
		for(int i=str.length()-1;i>=0;i--)
		{
			temp=temp+str.charAt(i);
		}
		
		if(temp.equals(s))
		{
			System.out.println("string is palindrom");
		}
		else
		{
			System.out.println("string is not palindrom");
		}
	}

}
