package practice;

public class nonduplicateeleex {

	public static void main(String[] args) {
		
		        int[] arr = {2, 3, 5, 2, 6, 5, 7, 8, 6};
		        System.out.print("Non-repeated elements: ");
		        for (int i = 0; i < arr.length; i++) {
		            boolean isUnique = true;
		            for (int j = 0; j < arr.length; j++) {
		                if (i != j && arr[i] == arr[j]) {
		                    isUnique = false;
		                    
		                    break;
		                }
		            }
		            if (isUnique) {
		                System.out.print(arr[i] + " ");
		            }
		        }
	}
		}