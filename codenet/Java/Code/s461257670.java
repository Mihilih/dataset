
import java.util.*;

class Main {

    public static void main(String[] args) throws java.lang.Exception {

        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();

        for (int i = 0; count > i; i++) {
            int y = sc.nextInt();
            int m = sc.nextInt();
            int d = sc.nextInt();

            System.out.println(Answer(y, m, d));
        }
    }

    public static int Answer(int y, int m, int d) {
        int result = 1;

        if (y % 3 == 0) {
            result += 20 - d;
        } else if (m % 2 == 0) {
            result += 19 - d;
        } else {
            result += 20 - d;
        }

        for (m+=1; m <= 10; m++) {
            if (y % 3 == 0) {
                result += 20;
            } else {
                if (m % 2 == 0) {
                    result += 19;
                } else {
                    result += 20;
                }
            }
        }

        for (y += 1; y < 1000; y++) {
            if (y % 3 == 0) {
                result += 200;
            } else {
                result += 195;
            }
        }
        return result;
    }
}