package com.example;
public class HumanEval_152 {
    public static int[] compare(int[] game, int[] guess) {
        int[] result = new int[game.length];
        for (int i = 0; i < game.length; i++) {
            result[i] = Math.abs(game[i] - guess[i]);
        }
        return result;
    }
}
// End of Code.
