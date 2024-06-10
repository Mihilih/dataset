public class Main {
    public static void main(String[] args) {

        int[][][] info = new int[4][3][10];
        for (int i = 0; i < 4; i ++) {
            for (int j = 0; j < 3; j ++) {
                for (int k = 0; k < 10; k ++) { info[i][j][k] = 0; }
            }
        }

        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i ++) {
            int built = sc.nextInt();
            int floor = sc.nextInt();
            int room = sc.nextInt();
            int num = sc.nextInt();
            info[built - 1][floor - 1][room - 1] += num;
        }

        for (int i = 0; i < 4; i ++) {
            for (int j = 0; j < 3; j ++) {
                for (int k = 0; k < 10; k ++) {
                    System.out.print(" " + info[i][j][k]);
                }
                System.out.print("\n");
            }
            if (i != 4 - 1) { System.out.print("####################\n"); }
        }
    }
}