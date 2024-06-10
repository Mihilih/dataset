package com.example;
public class HumanEval_67 {
    public static int fruitDistribution(String s, int n) {
        String[] words = s.split(" ");
        int c1 = Integer.parseInt(words[0]);
        int c2 = Integer.parseInt(words[3]);
        
        assert n - c1 - c2 >= 0 : "Invalid inputs";
        
        return n - c1 - c2;
    }
    
    public static void main(String[] args) {
        System.out.println(fruitDistribution("5 apples and 6 oranges", 19));
        System.out.println(fruitDistribution("0 apples and 1 oranges",3));
        System.out.println(fruitDistribution("2 apples and 3 oranges", 100));
        System.out.println(fruitDistribution("100 apples and 1 oranges",120));
    }
}
// End of Code
