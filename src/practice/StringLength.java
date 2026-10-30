package practice;

public class StringLength {

    public static void main(String[] args) {

        String str = "Prashanth";

        int count = 0;

        for (char ch : str.toCharArray()) {
            count++;
        }

        System.out.println("String Length = " + count);
    }
}