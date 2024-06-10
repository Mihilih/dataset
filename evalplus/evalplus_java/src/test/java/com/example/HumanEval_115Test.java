package com.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HumanEval_115Test {
    private HumanEval_115 solution = new HumanEval_115();

    @Test
    public void test0() {
        int[][] grid = {{0, 0, 1, 0}, {0, 1, 0, 0}, {1, 1, 1, 1}};
        int capacity = 1;
        assertEquals(6, solution.maxFill(grid, capacity));
    }

    @Test
    public void test1() {
        int[][] grid = {{0, 0, 1, 1}, {0, 0, 0, 0}, {1, 1, 1, 1}, {0, 1, 1, 1}};
        int capacity = 2;
        assertEquals(5, solution.maxFill(grid, capacity));
    }

    @Test
    public void test2() {
        int[][] grid = {{0, 0, 0}, {0, 0, 0}};
        int capacity = 5;
        assertEquals(0, solution.maxFill(grid, capacity));
    }

    @Test
    public void test3() {
        int[][] grid = {{1, 1, 1, 1}, {1, 1, 1, 1}};
        int capacity = 2;
        assertEquals(4, solution.maxFill(grid, capacity));
    }

    @Test
    public void test4() {
        int[][] grid = {{1, 1, 1, 1}, {1, 1, 1, 1}};
        int capacity = 9;
        assertEquals(2, solution.maxFill(grid, capacity));
    }

    @Test
    public void test5() {
        int[][] grid = {{1, 0, 0, 1}, {0, 1, 1, 1}, {0, 0, 0, 0}, {1, 0, 1, 1}};
        int capacity = 2;
        assertEquals(5, solution.maxFill(grid, capacity));
    }

    @Test
    public void test6() {
        int[][] grid = {{0, 0, 1, 0}, {0, 0, 1, 0}, {1, 1, 1, 1}, {0, 0, 1, 0}};
        int capacity = 2;
        assertEquals(5, solution.maxFill(grid, capacity));
    }

    @Test
    public void test7() {
        int[][] grid = {{0, 1, 1}, {0, 1, 1}, {1, 0, 1}, {1, 1, 1}, {1, 1, 1}, {0, 1, 1}, {1, 1, 1}};
        int capacity = 4;
        assertEquals(7, solution.maxFill(grid, capacity));
    }

}
// End of Test


