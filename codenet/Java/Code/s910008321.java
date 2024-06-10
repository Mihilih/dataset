import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int a = scanner.nextInt();
        if (h % a == 0) {
            System.out.println(h / a);
        } else {
            System.out.println(h / a + 1);
        }
    }
}
