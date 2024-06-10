import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = ".,!? :abc:def:ghi:jkl:mno:pqrs:tuv:wxyz".split(":");
        char[][] k = new char[9][];
        for (int i = 0; i < 9; i++) {
            k[i] = s[i].toCharArray();
        }
        while (n-- > 0) {
            char[] c = sc.next().toCharArray();
            int l = -1, a = 0;
            for (int i = 0; i < c.length; i++) {
                if (c[i] != '0') {
                    a = c[i] - '1';
                    l = (l + 1) % k[a].length;
                } else if (l >= 0) {
                    System.out.print(k[a][l]);
                    l = -1;
                }
            }
            System.out.println();
        }
    }
}
