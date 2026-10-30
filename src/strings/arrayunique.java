package strings;

public class arrayunique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int a[]= {1,3,4,5,6,5,6,7};
		
		for(int i=0;i<a.length;i++)
		{
			boolean isunique=true;
		
			for(int j=0;j<a.length;j++)
			{
				
		       if(a[i]==a[j]&&i!=j)
				{
		    	   isunique=false;
		    	   break;
				}
			}
			if(isunique)
			{
					System.out.println("duplicate characters are :"+a[i]+" ");
				}
			}
	}

}
