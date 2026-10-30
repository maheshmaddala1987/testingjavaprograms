package practice;

public class substringex {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		
		String s="testing selenium";
		 
		String ss=" ";
		
		String text=s.substring(8, 16);
		ss=ss+s.strip().substring(0, 8);
		
		String sss=text+ss;
		
		System.out.println("substring as : " +sss);

	}

}
