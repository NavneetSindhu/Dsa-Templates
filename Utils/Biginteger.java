package Utils;
import java.math.BigInteger;


public class Biginteger {


        BigInteger a = new BigInteger("123456789123456789");
        BigInteger b = BigInteger.valueOf(10); // From long

        a = a.add(b);        // a + b
        a = a.subtract(b);   // a - b
        a = a.multiply(b);   // a * b
        a = a.divide(b);     // a / b
        a = a.remainder(b);  // a % b
        a = a.modPow(exp, mod); // (a^exp) % mod (Crucial for cryptography/math)
        int cmp = a.compareTo(b); // -1 if a < b, 0 if equal, 1 if a > b
    
}
