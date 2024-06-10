import java.util.Scanner;

public class Main implements Runnable {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Thread(null, new Main(), "", 128 * 1024 * 1024).start();
    }

    public void run() {
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        long cost1 = 0;
        long cost2 = 0;
        int current1 = 0;
        int current2 = 0;
        long[] dp1 = new long[n];
        long[] dp2 = new long[n];
        for (int i = 0, j = n - 1; i < n; i++, j--) {
            cost1 += Math.abs(a[i] - current1);
            current1 = a[i];
            dp1[i] = cost1;
            cost2 += Math.abs(a[j] - current2);
            current2 = a[j];
            dp2[j] = cost2;
        }

        for (int i = 0; i < n; i++) {
            if (i == 0) {
                System.out.println(dp2[i + 1] + Math.abs(a[1]));
            } else if (i == n - 1) {
                System.out.println(dp1[i - 1] + Math.abs(a[i - 1]));
            } else {
                System.out.println(dp1[i - 1] + dp2[i + 1] + Math.abs(a[i - 1] - a[i + 1]));
            }
        }
    }
}