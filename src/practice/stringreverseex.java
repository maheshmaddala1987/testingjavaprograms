package practice;

public class stringreverseex {

	public static void main(String[] args) {
		// TODO Auto-generated method st
		
		String ss="testing is done";
		
		String result="";
		
		for(int i=ss.length()-1;i>=0;i--)
		{
			result=result+ss.charAt(i);
			
		}
		System.out.println("reverse string is :" + result);

	}

}
