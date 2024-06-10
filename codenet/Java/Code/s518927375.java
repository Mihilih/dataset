import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long k = sc.nextLong();
        long a = sc.nextLong();
        long b = sc.nextLong();

        if (b <= a + 2) {
            System.out.println(1 + k);
            return;
        }

        long x = k - (a - 1);
        long ans = a + (x / 2) * (b - a) + (x % 2);

        System.out.println(ans);
    }
}
