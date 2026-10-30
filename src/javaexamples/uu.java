package javaexamples;

class Main {
    public static void main(String[] args) {
       
        
        String s = "testingselenium";
        int nonRepeatedCount = 0;
        char first = '\0', second = '\0', last = '\0';

        for (int i = 0; i < s.length(); i++) {
            int count = 0;

            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j) && i != j) {
                    count++;
                }
            }

            if (count == 0) { // non-repeated character
                nonRepeatedCount++;
                if (nonRepeatedCount == 1) {
                    first = s.charAt(i);
                } else if (nonRepeatedCount == 2) {
                    second = s.charAt(i);
                }
                last = s.charAt(i); // keep updating, so final one is last
            }
        }

       
            System.out.println("First non-repeated character: " + first);
      
            System.out.println("Second non-repeated character: " + second);
       
            System.out.println("Last non-repeated character: " + last);
        }
    }

