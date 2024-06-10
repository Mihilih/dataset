import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int min = Integer.MAX_VALUE;
        int countNegatives = 0;
        long sum = 0;
        for (int num : nums) {
            int abs = Math.abs(num);
            sum += abs;
            min = Math.min(min, abs);
            if (num < 0) {
                countNegatives++;
            }
        }

        System.out.println(countNegatives % 2 == 0 ? sum : sum - (min*2));
    }
}