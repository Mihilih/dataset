import java.util.*;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for(int i = 0; i < n; i++) {
            queue.add(sc.nextInt());
        }
        int sum = 0;
        for(int i = 0; i < n - 1; i++) {
            sum += queue.poll();
        }

        // 出力
        System.out.println(queue.poll() < sum ? "Yes" : "No");
    }
}
