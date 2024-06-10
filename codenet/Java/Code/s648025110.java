import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n;
		n = sc.nextInt();
		int[]  h = new int [n];
		for(int i = 0; i < n; i++) {
			h[i] = sc.nextInt();
		}

		int ans = 0;
		int out = 0;

		for( int i = 0; i < h.length; i++ ) {
			if( out < h[i] ) {
				ans += h[i] - out;
				out =  h[i];
			}else {
				out = h[i];
			}
		}

		System.out.println(ans);
	}
}