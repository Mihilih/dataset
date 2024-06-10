import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] c = new int[n - 1];
        int[] s = new int[n - 1];
        int[] f = new int[n - 1];

        for (int i = 0; i < n - 1; i++) {
            c[i] = in.nextInt();
            s[i] = in.nextInt();
            f[i] = in.nextInt();
        }

        for (int i = 0; i < n - 1; i++) {
            int time = s[i] + c[i];
            for (int j = i + 1; j < n - 1; j++) {
                if (time % f[j] != 0) {
                    time += f[j] - (time % f[j]);
                }

                if (time < s[j]) {
                    time = s[j];
                }

                time += c[j];
            }

            System.out.println(time);
        }
        System.out.println(0);
    }
}