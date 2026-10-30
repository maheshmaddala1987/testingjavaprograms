package practice;

public class stringsplitex {

	public static void main(String[] args) {
		// TODO Auto-generated method st
		
		String text = "apple banana cherry grape";
        String[] fruits = text.split(" ");

        System.out.println("Split words:");
        for (int i = 0; i < fruits.length; i++) {
            System.out.println(fruits[i]);
        }

	}

}
