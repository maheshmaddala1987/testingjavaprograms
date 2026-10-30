package practice;

public class MaxMinArray {

    public static void main(String[] args) {

        int[] arr = {10, 25, 5, 78, 45, 2, 99};

        int max = arr[0];
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > max) {
                max = arr[i];
            }

            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Maximum Number: " + max);
        System.out.println("Minimum Number: " + min);
    }
}