import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		String str[] = br.readLine().split(" ");

		int s[] = new int[100010];

		for (int i = 0; i < n; i++) {
			s[Integer.parseInt(str[i])]++;
		}

		int dec = 0;

		for (int i = 0; i < s.length; i++) {
			if (s[i] != 0) {
				if (s[i] % 2 == 0) {
					s[i] = 2;
				} else {
					s[i] = 1;
				}
			}
		}

		int one = 0;
		int two = 0;

		for (int i = 0; i < s.length; i++) {
			if (s[i] == 2) {
				two++;
			} else if (s[i] == 1) {
				one++;
			}
		}

		if (two % 2 != 0) {
			one--;
		}

		System.out.println(two + one);
	}

}