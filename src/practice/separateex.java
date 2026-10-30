package practice;

public class separateex {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		
int a[] = {1,0,1,0,1,0,1,0,1,0,1,0,1,0,1};
        
        System.out.print("1's: ");
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 1) {
                System.out.print(a[i] + " ");
            }
        }
        
        System.out.print("\n0's: ");
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                System.out.print(a[i] + " ");
            }
        }

	}

}
