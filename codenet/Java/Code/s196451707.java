import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int[][] g = new int[n+1][n+1];
        
        for (int i = 0; i < n; i++) {
            int u = sc.nextInt();
            int k = sc.nextInt();
            for (int j = 0; j < k; j++) {
                int v = sc.nextInt();
                g[u][v] = 1;
            }
        }
        
        int[] d = new int[n+1];
        for (int i = 0; i <= n; i++) {
            d[i] = -1;
        }
        Queue<Integer> que = new LinkedList<Integer>();
        que.add(1);
        d[1] = 0;
        while (!que.isEmpty()) {
            int top = que.poll();
            for (int j = 1; j <= n; j++) {
                if (g[top][j] == 1 && d[j] == -1) {
                    que.add(j);
                    d[j] = d[top] + 1;
                }
            }
        }
        
        for (int i = 1; i <= n; i++) {
            System.out.println(i + " " + d[i]);
        }
    }
}

