package strings;

public class reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str= "this is testing java";
		
		String[] ss=str.split(" ");
		
		String rev=" ";
		
		for (String s1 :ss )
		{
			String Revword =" ";
		for (int i=s1.length()-1;i>=0;i--)
		{
			Revword= Revword+s1.charAt(i);
			
		}
		
		rev=rev+Revword;
		

	}
		
		System.out.println("reverse word is :"+rev.trim());

}
}