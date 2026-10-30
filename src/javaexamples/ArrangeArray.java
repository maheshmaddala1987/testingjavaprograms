package javaexamples;

import java.util.Arrays;

public class ArrangeArray {
    public static void main(String[] args) {
        int a[] = {1,0,1,1,0,1,1,0};
        int zeroCount = 0;

        // Count zeros
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0)
                zeroCount++;
        }

        // Fill zeros first, then ones in the same array
        for (int i = 0; i < zeroCount; i++) {
            a[i] = 0;
        }
        for (int i = zeroCount; i < a.length; i++) {
            a[i] = 1;
        }

        System.out.println(Arrays.toString(a));
    }
}
