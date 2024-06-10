import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String c = in.next();
        Character letter = c.charAt(0);
        letter++;

        System.out.println(letter);
    }
}
