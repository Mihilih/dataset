import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int n = s.length();
		long ans = 0;
		for(int mask = 0 ; mask < 1<<(n - 1) ; mask++) {
			long sum = 0;
			String x = "" + s.charAt(0);
			for(int i = 0 ; i < n - 1 ; i++) {
				if((mask&(1<<i)) >= 1) {
					x += "+" + s.charAt(i + 1);
				} else {
					x += s.charAt(i + 1);
				}
			}
			String[] split = x.split("\\+");
			for(int i = 0 ; i < split.length ; i++) {
				sum += Long.valueOf(split[i]);
			}
			ans += sum;
		}
		System.out.println(ans);
	}
}
