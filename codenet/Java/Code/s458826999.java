import java.util.Scanner;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		long MOD = 1000000007;
		long dp[][] = new long[S.length() + 1][13];
		dp[0][0] = 1;
		for(int i = 0; i < S.length(); i++) {
			if(S.substring(i , i + 1).equals("?")) {
				for(int j = 0; j < 10; j++) {
					for(int k = 0; k < 13; k++) {
						dp[i + 1][(k * 10 + j) % 13] += dp[i][k];
						dp[i + 1][(k * 10 + j) % 13] %= MOD;
					}
				}
			} else {
				for(int k = 0; k < 13; k++) {
					int x = Integer.parseInt(S.substring(i, i + 1));
					dp[i + 1][(k * 10 + x) % 13] += dp[i][k];
					dp[i + 1][(k * 10 + x) % 13] %= MOD;
				}
			}
		}
		System.out.println(dp[S.length()][5]);
	}
}
