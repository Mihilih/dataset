import java.util.*;

class Main {
    final Scanner sc = new Scanner(System.in);
    final long DEVISOR = 1000000000+7;
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        long n = sc.nextLong();
        long k = sc.nextLong();

        long ans = 0;
        for (long i = k; i <= n+1; i++) {
            long max = i*(2*n-i+1)/2 ;
            long min = i*(i-1)/2;
            ans += (max - min + 1) % DEVISOR;
        }
        System.out.println(ans% DEVISOR);
    }
}
