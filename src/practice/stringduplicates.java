package practice;

public class stringduplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method st
		
		String str="testingduplicates";
		
		
		
		for(int i=1;i<str.length();i++)
		{
			for(int j=i+1;j<str.length();j++)
			{
				if(str.charAt(i)==str.charAt(j))
				
				{
					System.out.println("duplicate characters :"+ str.charAt(i)+ " ");
				}
			}
		}
		
		

	}

}
