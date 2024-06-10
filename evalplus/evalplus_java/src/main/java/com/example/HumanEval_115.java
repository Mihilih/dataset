package com.example;
public class HumanEval_115 {

    public int maxFill(int[][] grid, int capacity) {
        int ans = 0;
        for (int[] l : grid) {
            int sum = 0;
            for (int i : l) {
                sum += i;
            }
            ans += Math.ceil((double) sum / capacity);
        }
        return ans;
    }
    
    public static void main(String[] args) {
        HumanEval_115 solution = new HumanEval_115();
        int[][] grid1 = {{0,0,1,0}, {0,1,0,0}, {1,1,1,1}};
        int capacity1 = 1;
        System.out.println(solution.maxFill(grid1, capacity1)); // Expected output: 6

        int[][] grid2 = {{0,0,1,1}, {0,0,0,0}, {1,1,1,1}, {0,1,1,1}};
        int capacity2 = 2;
        System.out.println(solution.maxFill(grid2, capacity2)); // Expected output: 5

        int[][] grid3 = {{0,0,0}, {0,0,0}};
        int capacity3 = 5;
        System.out.println(solution.maxFill(grid3, capacity3)); // Expected output: 0
    }

}

// End of Code
