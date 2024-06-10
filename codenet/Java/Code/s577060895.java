import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = Long.parseLong(sc.nextLine());

		double sqrt = Math.sqrt(n);
		double nearNum = Math.floor(sqrt);

		long ans = (long) Math.pow(nearNum, 2);

		System.out.println(ans);

		sc.close();
	}
}