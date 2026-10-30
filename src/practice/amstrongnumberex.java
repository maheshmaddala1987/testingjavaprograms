package practice;

public class amstrongnumberex {

	public static void main(String[] args) {
	
		       
		       int num=153;
		       
		       int temp=num;
		      int s=0;
		       
		       while(num>0)
		       {
		          int r=num%10;
		           num=num/10;
		           //s=r+s*10;
		           s=(r*r*r)+s;
		       }
		           if(temp==s)
		           {
		               System.out.println("palindrom number");
		           }
		           else
		           {
		               System.out.print("not palindrom number");
		           }
		       }
		    
	
}
		       
		    
	