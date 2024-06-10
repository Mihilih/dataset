import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    static Set<String> ODD = new HashSet<>();
    static Set<String> EVE = new HashSet<>();
    static {
        ODD.add("R");
        ODD.add("U");
        ODD.add("D");
        EVE.add("L");
        EVE.add("U");
        EVE.add("D");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String N = sc.nextLine();
        char[] tap = N.toCharArray();

        boolean isGood = true;
        for (int i = 0; i < N.length(); i++) {
            if ((i + 1) % 2 == 0) {
                if (!isMatch(EVE, tap[i])) {
                    isGood = false;
                    break;
                }
            } else {
                if (!isMatch(ODD, tap[i])) {
                    isGood = false;
                    break;
                }
            }
        }

        System.out.println(isGood ? "Yes" : "No");
    }

    private static boolean isMatch(Set<String> set, char c) {
        return set.contains(String.valueOf(c));
    }
}

