package practice;

public class arrayduplicateex {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		
		int a[]= {1,2,34,5,7,4,6,8,4};
		
		for(int i=1;i<a.length;i++) {
			
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					System.out.println("duplicate elements are "+a[i]+" ");
				}
			}
		}
		

	}

}
