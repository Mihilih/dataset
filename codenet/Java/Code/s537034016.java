import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static long[] dp;
	static int mod = 1000000007;

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		sc.close();

		dp = new long[s + 1];
		Arrays.fill(dp, -1);
		dp[0] = 1;
		System.out.println(dfs(s));
	}

	static long dfs(int s) {
		if (dp[s] != -1) {
			return dp[s];
		}

		long ret = 0;
		for (int i = s - 3; i >= 0; i--) {
			ret += dfs(i);
			ret %= mod;
		}
		return dp[s] = ret;
	}
}
