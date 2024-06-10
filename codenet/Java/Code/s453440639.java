import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        sc.nextLine();
        char[][] S = new char[H][W];
        for (int i = 0; i < H; i++) {
            String text = sc.nextLine();
            for (int j = 0; j < W; j++) {
                S[i][j] = text.charAt(j);
            }
        }
        sc.close();

        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                if (S[i][j] == '.') {
                    int count = 0;
                    for (int a = -1; a <= 1; a++) {
                        if (i + a < 0 || H <= i + a) {
                            continue;
                        }
                        for (int b = -1; b <= 1; b++) {
                            if (j + b < 0 || W <= j + b) {
                                continue;
                            }
                            if ( S[i + a][j + b] == '#') {
                                count++;
                            }
                        }
                    }
                    S[i][j] = (char)(count+48);
                }
                System.out.printf("%c", S[i][j]);
            }
            System.out.printf("\n");
        }
    }
}