import java.io.PrintStream;
import java.util.Scanner;

public class Main {
    static final Scanner     sc = new Scanner(System.in);
    static final PrintStream so = System.out;

    public static void main(String[] args) {
        int N = nint();
        int W = nint();
        
        // 品物i
        int[] v = new int[N+1];
        int[] w = new int[N+1];
        
        for (int i = 1; i <= N; i++) {
            v[i] = nint();
            w[i] = nint();
        }
        
        int[][] sumV = new int[N+1][W+1];
        
        for (int i = 1; i <= N; i++) {
            for (int i_sum = 0; i_sum < w[i]; i_sum++) {
                sumV[i][i_sum] = sumV[i-1][i_sum];
            }
            
            for (int i_sum = w[i]; i_sum <= W; i_sum++) {
                sumV[i][i_sum] = Math.max(sumV[i-1][i_sum], sumV[i-1][i_sum-w[i]] + v[i]);
            }
        }
        
        so.println(sumV[N][W]);
    }

    private static long nlong() {
        return sc.nextLong();
    }

    private static int nint() {
        return sc.nextInt();
    }

    private static String nstr() {
        return sc.next();
    }

    private static char[] nsToChars() {
        return sc.next().toCharArray();
    }

    private static long[] nlongs(int n) {
        return nlongs(n, 0, 0);
    }

    private static int[] nints(int n) {
        return nints(n, 0, 0);
    }

    private static int[] nints(int n, int padL, int padR) {
        int[] a = new int[padL + n + padR];
        for (int i = 0; i < n; i++)
            a[padL + i] = nint();
        return a;
    }

    private static long[] nlongs(int n, int padL, int padR) {
        long[] a = new long[padL + n + padR];
        for (int i = 0; i < n; i++)
            a[padL + i] = nlong();
        return a;
    }

    private static String[] nstrs(int n) {
        String[] a = new String[n];
        for (int i = 0; i < n; i++)
            a[i] = nstr();
        return a;
    }

    private static char[][] nsToChars2D(int h, int w) {
        return nsToChars2D(h, w, 0);
    }

    private static char[][] nsToChars2D(int h, int w, int pad) {
        char[][] a2 = new char[h + pad * 2][w + pad * 2];
        for (int i = 0; i < h; i++)
            System.arraycopy(nsToChars(), 0, a2[pad + i], pad, w);
        return a2;
    }
}

