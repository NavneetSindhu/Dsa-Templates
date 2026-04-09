import java.util.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) throws Exception {
        FastScanner fs = new FastScanner(System.in);
        int q = fs.nextInt();
        while(q-- >0){
            
        }
    }

    static class FastScanner {
        private BufferedReader br;
        private StringTokenizer st;

        FastScanner(InputStream in) {
            br = new BufferedReader(new InputStreamReader(in));
        }

        String next() throws Exception {
            while (st == null || !st.hasMoreElements()) {
                st = new StringTokenizer(br.readLine());
            }
            return st.nextToken();
        }

        int nextInt() throws Exception {
            return Integer.parseInt(next());
        }

        long nextLong() throws Exception {
            return Long.parseLong(next());
        }

        String nextLine() throws Exception {
            return br.readLine();
        }
    }
}