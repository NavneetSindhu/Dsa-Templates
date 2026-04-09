package Math_NumberTheory;

/**
 * Algorithm: Euclidean GCD & LCM
 * Time Complexity: O(log(min(a, b)))
 * Space Complexity: O(1) (or O(log N) for call stack)
 */
class Gcd_Lcm {
    
    public static long gcd(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static long lcm(long a, long b) {
        if (a == 0 || b == 0) return 0;
        // Divide BEFORE multiplying to prevent massive integer overflow
        return (a / gcd(a, b)) * b; 
    }
}
