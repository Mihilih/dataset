import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastScanner in = new FastScanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskB solver = new TaskB();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskB {
        public void solve(int testNumber, FastScanner in, PrintWriter out) {
            int n = in.nextInt();
            char[][] a = new char[n][n];
            long P = 37, Q = 47;
            long[] powP = new long[n + 1], powQ = new long[n + 1];
            powP[0] = powQ[0] = 1;
            for (int i = 1; i <= n; i++) {
                powP[i] = powP[i - 1] * P;
                powQ[i] = powQ[i - 1] * Q;
            }
            for (int i = 0; i < n; i++) {
                a[i] = in.next().toCharArray();
            }

            long[][] hashRow = new long[n][n];
            long[][] hashCol = new long[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    for (int k = 0; k < n; k++) {
                        hashRow[i][k] += a[i][j] * powP[(j - k + n) % n];
                        hashCol[j][k] += a[i][j] * powP[(i - k + n) % n];
                    }
                }
            }

            int ans = 0;
            for (int A = 0; A < n; A++) {
                for (int B = 0; B < n; B++) {
                    boolean ok = true;
                    for (int i = 0; i < n; i++) {
                        ok &= hashRow[(i + A) % n][B] == hashCol[(i + B) % n][A];
                    }
                    ans += ok ? 1 : 0;
                }
            }
            out.println(ans);
        }

    }

    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        public FastScanner(InputStream in) {
            br = new BufferedReader(new InputStreamReader(in));
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public String next() {
            while (st == null || !st.hasMoreElements()) {
                String line = null;
                try {
                    line = br.readLine();
                } catch (IOException e) {
                }
                st = new StringTokenizer(line);
            }
            return st.nextToken();
        }

    }
}

