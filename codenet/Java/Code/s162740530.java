import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] a = new int[m + 1];
		int[] cnt = new int[n + 1];
		cnt[0] = 1;
		final int MOD = 1000000007;

		for (int i = 1; i < a.length; i++) {
			a[i] = sc.nextInt();
		}

		int num = 1;
		if (m > 0) {
			if (a[1] == 1) {
				cnt[1] = 0;
				if (num < m) {
					num++;
				}
			} else {
				cnt[1] = 1;
			}
		} else {
			cnt[1] = 1;
		}

		for (int i = 2; i < cnt.length; i++) {

			cnt[i] = cnt[i - 2] + cnt[i - 1];
			cnt[i] %= MOD;
			if (m > 0) {
				if (i == a[num]) {
					cnt[i] = 0;
					if (num < m) {
						num++;
					}
				}
			}

		}

		System.out.println(cnt[n]);
		sc.close();
	}
}