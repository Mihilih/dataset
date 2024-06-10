import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = Integer.parseInt(s.next());
        int[] v = new int[n];
        int[] c = new int[n];
        int[] dp = new int[n];


        for (int i = 0; i < n; i++) {
            dp[i] = 0;
        }
        for (int i = 0; i < n; i++) {
            v[i] = Integer.parseInt(s.next());
        }
        for (int i = 0; i < n; i++) {
            c[i] = Integer.parseInt(s.next());
        }

        dp[0] = 0;

        for (int i = 1; i < n; i++) {
            int tmp = dp[i - 1] + (v[i - 1] - c[i - 1]);
            dp[i] = tmp > dp[i - 1] ? tmp : dp[i - 1];
        }

        int tmp = dp[n - 1] + (v[n - 1] - c[n - 1]);
        dp[n - 1] = tmp > dp[n - 1] ? tmp : dp[n - 1];

        System.out.println(dp[n - 1]);
    }
}