import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int maxv = Integer.MIN_VALUE;
        int minv = sc.nextInt();
        for (int i = 1; i < n; i++) {
            int ri = sc.nextInt();
            maxv = Math.max(maxv, ri - minv);
            minv = Math.min(minv, ri);
        }
        System.out.println(maxv);
        sc.close();
    }
}

