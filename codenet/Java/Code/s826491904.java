import java.util.*;

public class Main {
    //-------------------------------------------------------------//
    public static final void main(String[] args) {
        new Main().solve();
    }
    //-------------------------------------------------------------//
    private final Scanner sc = new Scanner(System.in);

    void solve() {
        int N = sc.nextInt();
        int max, min; max = min = sc.nextInt();
        for (int i = 1; i < N; i++) {
            int in = sc.nextInt();
            max = Math.max(max, in);
            min = Math.min(min, in);
        }
        System.out.println(max - min);
    }
}