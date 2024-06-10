import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

class Main {
    public static void main (String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder("");
        int a, b, digit;
        while (sc.hasNextInt()) {
            a = sc.nextInt();
            b = sc.nextInt();
            digit = (int) Math.log10(a+b) + 1;
            sb.append(digit);
            sb.append('\n');
        }
        System.out.print(sb);
    }
}