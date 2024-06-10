import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        long n = stdIn.nextLong();

        System.out.println(n * (n + 1) / 2 - n);
    }
}