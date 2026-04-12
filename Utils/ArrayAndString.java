package Utils;

import java.util.Arrays;

public class ArrayAndString {

    

    public void stringBuilderMethods() {
        StringBuilder sb = new StringBuilder();
        
        sb.append("abc");
        sb.reverse();
        sb.deleteCharAt(0);
        sb.setCharAt(0, 'z');            // Modify character at specific index
        sb.insert(1, "wow");             // Insert string at index
        sb.repeat('1', 5);               // Appends '1' five times (Java 21+)
        
        String result = sb.toString();
    }

    public void stringAndFunctionalMethods() {
        String s = "01111100";

        // 1. Substrings
        String sub = s.substring(0, 5);  // Extracts from index 0 to 4 [start, end)

        // 2. The Frequency Counter Chain (The "Stream" approach)
        // Use Case: Count how many times '1' appears in the string
        char target = '1';
        long count = s.chars()           // IntStream of ASCII values
            .filter(c -> c == target)    // Keep only matches
            .count();                    // Return total

        // 3. String repeat (Alternative to StringBuilder.repeat)
        String zeroes = "0".repeat(10);  // Creates "0000000000"
        
        // 4. Checking content
        boolean hasDigit = s.contains("1");
        boolean startsWith = s.startsWith("01");
    }
}