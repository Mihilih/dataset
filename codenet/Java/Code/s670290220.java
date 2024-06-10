import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		char c[] = sc.next().toCharArray();
		for (int i=0; i<c.length; i++) {
			c[i] = (char)((c[i]-'A'+N) % 26 + 'A');
		}
		System.out.println(c);
	}
}