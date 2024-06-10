import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		String s[] = new String[N];
		int a_num = 0;
		int b_num = 0;
		boolean flag = true;
		int ans = 0;
		for(int i = 0; i < N; i++) {
			s[i] = sc.next();
			if(s[i].substring(0, 1).equals("B")) {
				b_num++;
			}
			if(s[i].substring(s[i].length() - 1, s[i].length()).equals("A")){
				a_num++;
			}
			if(s[i].substring(0, 1).equals("B") || s[i].substring(s[i].length() - 1, s[i].length()).equals("A")) {
				if(!(s[i].substring(0, 1).equals("B") && s[i].substring(s[i].length() - 1, s[i].length()).equals("A"))) {
					flag = false;
				}
			}
			for(int j = 0; j < s[i].length() - 1; j++) {
				if(s[i].substring(j, j + 2).equals("AB")) ans++;
			}
		}
		ans += Math.min(a_num, b_num);
		if(Math.min(a_num, b_num) != 0 && flag) {
			ans--;
		}
		System.out.println(ans);
	}
}
