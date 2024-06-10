import java.io.*;
import java.util.*;


public class Main {

	private static Scanner sc;
	private static Printer pr;

	private static void solve() {
		int n = sc.nextInt();
		int k = sc.nextInt();

		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		
		long[] cumsum = new long[n + 1];
		for (int i = 0; i < n; i++) {
			cumsum[i + 1] = cumsum[i] + a[i];
		}

		List<Long> b = new ArrayList<>(n * (n + 1) / 2);
		long max = 0;
		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				b.add(cumsum[j + 1] - cumsum[i]);
				max = Math.max(max, cumsum[j + 1] - cumsum[i]);
			}
		}
//		Collections.sort(b, Collections.reverseOrder());

		long mask = Long.highestOneBit(max);
		while (mask > 0) {
			List<Long> tmp = new ArrayList<>();
			for (long e : b) {
				if ((e & mask) != 0) {
					tmp.add(e);
				}
			}
			
			if (tmp.size() >= k) {
				b = tmp;
			}
			
			mask >>= 1;
		}
		
		if (b.size() < k) {
			pr.println(0);
		} else {
			long ans = -1L;
			for (long e : b) {
				ans &= e;
			}
			
			pr.println(ans);
		}
	}

	// ---------------------------------------------------
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		pr = new Printer(System.out);
			
		solve();
			
		pr.close();
		sc.close();
	}

	static class Printer extends PrintWriter {
		Printer(OutputStream out) {
			super(out);
		}
	}
}
