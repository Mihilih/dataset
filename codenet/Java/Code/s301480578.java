import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] h = new int[n];
        for (int i = 0 ; i < n ; i++) {
            h[i] = sc.nextInt();
        }
        int max = 0;
        for (int l = 0 ; l < n - 1 ; l++) {
            int count = 0;
            while (l < n - 1 && h[l] >= h[l + 1]) {
                l++;
                count++;
            }
            max = Math.max(max, count);
        }
        System.out.println(max);
    }


}