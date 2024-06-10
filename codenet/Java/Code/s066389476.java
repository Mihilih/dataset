import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);) {
            solve(sc);
        }
    }

    public static void solve(Scanner sc) {
        char[] a = sc.next().toCharArray();
        if (a[0] == a[1] || a[1] == a[2] || a[2] == a[0]) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
    }
}