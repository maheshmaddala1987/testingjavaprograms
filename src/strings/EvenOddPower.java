package strings;

public class EvenOddPower {
    public static void main(String[] args) {
        int a[] = {2, 3, 5, 6, 7, 8, 9};

        for (int i = 0; i < a.length; i++) {
            if (i % 2 == 0) { // even index
                int cube = a[i] * a[i] * a[i];
                System.out.println("Index " + i + " value " + a[i] + " → " + a[i] + "^3 = " + cube);
            } else { // odd index
                int square = a[i] * a[i];
                System.out.println("Index " + i + " value " + a[i] + " → " + a[i] + "^2 = " + square);
            }
        }
    }
}

