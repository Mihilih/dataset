import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int n = stdIn.nextInt();
        int m = stdIn.nextInt();
        int dp[] = new int[n + 2];
        dp[n + 1] = 0;
        dp[n] = 1;
        for (int i = 0; i < m; i++)
            dp[stdIn.nextInt()] = -1;
        for (int i = n - 1; i >= 0; i--) {
            if (dp[i] == -1)
                dp[i] = 0;
            else
                dp[i] = (dp[i + 1] + dp[i + 2]) % 1000000007;
        }
        System.out.println(dp[0]);
    }
}
