package strings;

public class stringlength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String ss="maheshreddy";
		int count=0;
		//for(int i=0;i<ss.length();i++)
		for(char ch: ss.toCharArray())
		{
			count++;
		}
			System.out.println("string lemgth is :"+count);
		}

	}


