package practice;

public class pyramid4ex {
	
    public static void main(String[] args) {
        int rows = 5; // number of rows

        for (int i = 0; i < rows; i++) {
            // print leading spaces
            for (int s = 0; s < i; s++) {
                System.out.print(" ");
            }
            // print stars with spaces
            for (int j = 0; j < rows - i; j++) {
                System.out.print("*");
                if (j < rows - i) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}



