// ==========================================
// STRING DP: THE 1-BASED INDEX TEMPLATE
// ==========================================
// i maps to s1.charAt(i - 1)
// j maps to s2.charAt(j - 1)

class StringTemplate {
    public int stringDP(String s1, String s2) {
        // Return type could be boolean as well
        int n1 = s1.length();
        int n2 = s2.length();
        int[][] dp = new int[n1 + 1][n2 + 1];
        
        // --------------------------------------
        // 1. BASE CASES (Initialize row 0 and col 0)
        // --------------------------------------
        // Edit Distance: dp[i][0] = i, dp[0][j] = j
        // Distinct Subsequences: dp[i][0] = 1
        // Wildcard Matching: dp[0][0] = true, Loop j to check for '*'
        
        // --------------------------------------
        // 2. THE ENGINE
        // --------------------------------------
        for (int i = 1; i <= n1; i++) {
            for (int j = 1; j <= n2; j++) {
                
                // --- SCENARIO 1: MATCH ---
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    // Edit Distance: dp[i - 1][j - 1] (0 cost)
                    // Distinct Sub: dp[i - 1][j - 1] + dp[i - 1][j]
                    // Wildcard: dp[i - 1][j - 1]
                } 
                
                // --- SCENARIO 2: MISMATCH ---
                else {
                    // Edit Distance: 1 + Math.min(insert, min(delete, replace))
                    // Distinct Sub: dp[i - 1][j] (Skip character in s1)
                    // Wildcard: false
                }
                
                // --- SCENARIO 3: SPECIAL CHARACTERS (Wildcard Only) ---
                // else if (s2.charAt(j - 1) == '?') -> Treat as Match
                // else if (s2.charAt(j - 1) == '*') -> dp[i - 1][j] || dp[i][j - 1]
            }
        }
        
        return dp[n1][n2];
    }
}