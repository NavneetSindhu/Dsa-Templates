package Math_NumberTheory;

/**
 * Algorithm: Modular Arithmetic & Fast Exponentiation
 * Time: O(log(exp)) for power/inverse, O(1) for basic operations.
 * Note: MOD must be a prime number (like 10^9 + 7) for modInverse to work.
 */
class Modulo {
    public static final int MOD = 1_000_000_007;

    public static long add(long a, long b) {
        return (a % MOD + b % MOD) % MOD;
    }

    public static long sub(long a, long b) {
        return ((a % MOD - b % MOD) + MOD) % MOD; // +MOD prevents negative results
    }

    public static long mul(long a, long b) {
        return ((a % MOD) * (b % MOD)) % MOD;
    }

    public static long power(long base, long exp) {
        long res = 1;
        base = base % MOD;
        while (exp > 0) {
            if ((exp & 1) == 1) res = (res * base) % MOD;
            base = (base * base) % MOD;
            exp >>= 1;
        }
        return res;
    }

    // Requires Fermat's Little Theorem (MOD must be prime)
    public static long modInverse(long n) {
        return power(n, MOD - 2);
    }
    
    public static long div(long a, long b) {
        return mul(a, modInverse(b));
    }
}
