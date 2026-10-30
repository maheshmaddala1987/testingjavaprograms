package practice;

public class nonduplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stu

		        String s = "programming";
		        System.out.print("Non-repeated characters: ");
		        for (int i = 0; i < s.length(); i++) {
		            char ch = s.charAt(i);
		            int count=1;
		            boolean isUnique = true;
		            for (int j = 0; j < s.length(); j++) {
		                if (i != j && s.charAt(i) ==s.charAt(j)) {
		                    count ++;
		                    isUnique = false;
		                    
		                    break;
		                }
		            }
		        
		            if (isUnique) {
		            	 System.out.print(ch + " ");
		            }
		        }
}
}
		    
		