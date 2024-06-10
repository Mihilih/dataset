import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        int h = scanner.nextInt();
        int w = scanner.nextInt();
        String[] ans = new String[h];
        for (int i = 0; i < h; i++) {
            ans[i] = "#" + scanner.next() + "#";
        }
        System.out.println(String.valueOf(new char[w + 2]).replace('\0', '#'));
        for (String s : ans) {
            System.out.println(s);
        }
        System.out.println(String.valueOf(new char[w + 2]).replace('\0', '#'));
    }
}