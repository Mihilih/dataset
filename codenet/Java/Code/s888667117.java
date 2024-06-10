import java.io.*;
import java.util.*;
import java.util.stream.*;

public class Main {
    public static final Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    public static final PrintStream out = System.out;
    public static final PrintStream err = System.err;

    public static void main(String[] args) {
        String Si = in.next();
        char[] S = new StringBuilder(Si).reverse().toString().toCharArray();

        long[] dp = new long[13];
        dp[0] = 1;

        for (int i = 0, d = 1; i < S.length; i++, d = d * 10 % 13) {
            long[] nd = new long[13];

            err.println("d: " + d + ", i: " + i + ", S[i]: " + S[i]);
            char c = S[i];

            if (Character.isDigit(c)) {
                int x = (c - '0') * d;

                for (int j = 0; j < 13; j++) {
                    nd[(j + x) % 13] = dp[j];
                }
            } else {
                for (int xi = 0; xi < 10; xi++) {
                    int x = xi * d;

                    for (int j = 0; j < 13; j++) {
                        int ni = (j + x) % 13;
                        nd[ni] = (nd[ni] + dp[j]) % 1000000007;
                    }
                }
            }

            err.println(Arrays.toString(nd));
            dp = nd;
        }

        out.println(dp[5]);
    }
}
