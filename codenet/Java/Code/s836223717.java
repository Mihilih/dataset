import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] ryuka = new long[n + 1];
        ryuka[0] = 2;
        ryuka[1] = 1;
        for (int i = 2; i < n + 1; i++) {
            ryuka[i] = ryuka[i - 1] + ryuka[i - 2];
        }
        System.out.println(ryuka[n]);
    }
}