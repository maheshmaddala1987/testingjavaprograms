package strings;

public class digitssymnolscharacterex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="mah@$())test123";
		
		String characters=" ";
		String digits =" ";
		String symbols =" ";
		
		for (int i=0;i<s.length();i++) {
			char c= s.charAt(i);
			if(Character.isAlphabetic(c)) {
				characters=characters+c;
			}
			else if(Character.isDigit(c))
			{
				digits=digits+c;
			}
			else
			{
				symbols=symbols+c;
			}
		}
		
		System.out.println("charcters are :"+characters);
		System.out.println("digits are :"+digits);
		System.out.println("symbols are :"+symbols);

	}

}
