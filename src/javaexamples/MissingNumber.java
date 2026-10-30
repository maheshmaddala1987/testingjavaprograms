package javaexamples;

public class MissingNumber {

    public static void main(String[] args) {

        int[] arr = {1, 3, 4, 5};
        int n = 5;
        int sum = 0;

        for (int num : arr) {
            sum += num;
        }

        System.out.println("Missing Number: " + (n * (n + 1) / 2 - sum));
    }
}