package Utils;

public class Conversions {

        // String <-> Integer
        int n = Integer.parseInt("123");      // String to int
        String s = Integer.toString(123);     // int to String
        String s2 = String.valueOf(123);      // Works for any type (double, long, etc.)

        // Character <-> Integer
        int digit = c - '0';                  // char '5' to int 5
        char c = (char)(5 + '0');             // int 5 to char '5'
        boolean isDigit = Character.isDigit(c); 

        // String <-> Character Array
        char[] arr = s.toCharArray();
        String s3 = new String(arr);
    
}
