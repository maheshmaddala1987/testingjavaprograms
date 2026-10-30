package practice;

public class arrayex {

	public static void main(String[] args) {
		// TODO Auto-generated method
		
		int arr[] = { 1, 2, 2, 3, 5, 5, 4, 4, 6 };
		boolean[] occured = new boolean[arr.length];

		for (int i = 0; i < arr.length; i++) {
			if(occured[i]) {
				continue;
				
			}
			
			int count = 1;
			
			  for (int j = i + 1; j < arr.length; j++) {
			  	  
			  if (arr[i] == arr[j]) {
				  count++; 
				  occured[j]=true;
				
				  } 
			  System.out.println(occured[i]);
			  System.out.println(occured[j]);
			 }
			  
			 System.out.println(arr[i]+""+count);

			

		}
		
		

	}
}
