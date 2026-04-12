package Utils;

import java.math.BigInteger;

public class Biginteger {

    public void bigIntExamples() {
        // 1. Initialization
        BigInteger a = new BigInteger("123456789123456789");
        BigInteger b = BigInteger.valueOf(10); // Useful for converting long to BigInt
        
        // Constants
        BigInteger zero = BigInteger.ZERO;
        BigInteger one = BigInteger.ONE;
        BigInteger ten = BigInteger.TEN;

        // 2. Basic Arithmetic (Remember: BigInteger is Immutable, you must reassign)
        a = a.add(b);        // a + b
        a = a.subtract(b);   // a - b
        a = a.multiply(b);   // a * b
        a = a.divide(b);     // a / b
        a = a.remainder(b);  // a % b (Equivalent to a % b)
        
        // 3. Comparison
        // Returns -1 (less), 0 (equal), or 1 (greater)
        int cmp = a.compareTo(b); 
        if (a.equals(BigInteger.ZERO)) { /* Check for zero */ }

        // 4. Advanced Math (The "Contest Winners")
        BigInteger exp = BigInteger.valueOf(100);
        BigInteger mod = new BigInteger("1000000007");
        
        // (a^exp) % mod -> Much faster than doing it manually
        BigInteger powerMod = a.modPow(exp, mod); 
        
        // Greatest Common Divisor
        BigInteger gcd = a.gcd(b);
        
        // 5. Primality & Bits
        // Returns true if probably prime. 10 is the "certainty" (higher = more accurate)
        boolean isPrime = a.isProbablePrime(10);
        
        // Number of bits in the binary representation
        int bits = a.bitLength();
        
        // Number of bits that differ from the sign bit (PopCount)
        int setBits = a.bitCount();
    }
}