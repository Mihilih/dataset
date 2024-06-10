import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int t = sc.nextInt();
		double time = 0;
		int count = 0;
		while (time < t + 0.5) {
			count += b;
			time += a;
			if (time > t + 0.5) {
				count -= b;
				break;
			}
		}
		System.out.println(count);
	}
}
