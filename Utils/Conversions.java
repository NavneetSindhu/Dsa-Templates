package Utils;

import java.util.*;
import java.util.stream.*;


public class Conversions {

    public void basicConversions() {
        // --- String <-> Integer ---
        int n = Integer.parseInt("123");      // String to int
        String s = Integer.toString(123);     // int to String
        String s2 = String.valueOf(123);      // Works for any type (double, long, etc.)

        // --- Character <-> Integer ---
        char c = (char)(5 + '0');             // int 5 to char '5'
        int digit = c - '0';                  // char '5' to int 5
        boolean isDigit = Character.isDigit(c); 

        // --- String <-> Character Array ---
        char[] charArr = s.toCharArray();
        String s3 = new String(charArr);
    }

    public void streamAndBoxedMethods(int[] arr) {
        // 1. Primitive int[] to List<Integer> (The "Boxed" trick)
        List<Integer> list = Arrays.stream(arr)
                                   .boxed() 
                                   .collect(Collectors.toList());

        // 2. List<Integer> back to primitive int[]
        int[] primitiveArr = list.stream()
                                 .mapToInt(Integer::intValue)
                                 .toArray();

        // 3. Sorting a primitive array in DESCENDING order
        // (Java's Arrays.sort doesn't support Collections.reverseOrder() on primitives)
        int[] descending = Arrays.stream(arr)
                                 .boxed()
                                 .sorted(Collections.reverseOrder())
                                 .mapToInt(Integer::intValue)
                                 .toArray();

        // 4. Sum, Max, Min from a primitive array (Fast and clean)
        long sum = Arrays.stream(arr).sum();
        int max = Arrays.stream(arr).max().orElse(0); 
        
        // 5. String to List of Characters (Stream version)
        String word = "Navneet";
        List<Character> chars = word.chars()
                                    .mapToObj(e -> (char) e)
                                    .collect(Collectors.toList());
    }
}