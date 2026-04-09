package Math_NumberTheory;


/**
 * Algorithm: Prime Utilities (O(sqrt(N)) Check & Sieve of Eratosthenes)
 * Use Case: Checking if a number is prime, or precomputing primes up to maxN.
 */
class Primes {
    
    // Time: O(sqrt(N)) | Space: O(1)
    public static boolean isPrime(long n) {
        if (n <= 1) return false;
        if (n == 2 || n == 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;
        
        for (long i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) return false;
        }
        return true;
    }

    // Time: O(N log(log N)) | Space: O(N)
    public static boolean[] buildSieve(int maxN) {
        boolean[] isPrime = new boolean[maxN + 1];
        java.util.Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;
        
        for (int p = 2; p * p <= maxN; p++) {
            if (isPrime[p]) {
                for (int i = p * p; i <= maxN; i += p) {
                    isPrime[i] = false;
                }
            }
        }
        return isPrime;
    }
}