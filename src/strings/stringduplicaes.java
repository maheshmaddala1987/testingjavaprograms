package strings;

public class stringduplicaes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="maheshreddy";
		
		for(int i=0;i<s.length();i++)
		{
			for (int j=i+1;j<s.length();j++)
			{
				if(s.charAt(i)==s.charAt(j))
				{
					
				
			
	System.out.println("deplicate characters are :"+s.charAt(i)+ " ");
		}

	}

	}}
}
