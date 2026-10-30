package strings;

public class reveser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//String s="this is testing by qa";
		
		 String s = "I Love Java";
		
		String rev=" ";
		
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		
		System.out.println("reverse string is :"+rev);
	}

}
