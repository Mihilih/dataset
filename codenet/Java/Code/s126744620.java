import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0 ; i < n ; i++) a[i] = sc.nextInt();
		Integer[] x = new Integer[200010];
		Arrays.fill(x, 0);
		for(int i = 0 ; i < n ; i++) {
			x[a[i] - 1]++;
		}
		Arrays.sort(x, new Comparator<Integer>() {
			public int compare(Integer p1, Integer p2) {
				return p1 - p2;
			}
		});
		int ans = 0;
		for(int i = 0 ; i <= 200010 - k - 1 ; i++) {
			ans += x[i];
		}
		System.out.println(ans);
	}
}
