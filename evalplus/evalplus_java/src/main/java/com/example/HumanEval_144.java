package com.example;
public class HumanEval_144 {

    public static boolean simplify(String x, String n) {
        String[] xParts = x.split("/");
        String[] nParts = n.split("/");
        
        int x1 = Integer.parseInt(xParts[0]);
        int x2 = Integer.parseInt(xParts[1]);
        int n1 = Integer.parseInt(nParts[0]);
        int n2 = Integer.parseInt(nParts[1]);
        
        return (x1 * n1) % (x2 * n2) == 0;
    }
    
    public static void main(String[] args) {
        System.out.println(simplify("1/5", "5/1"));  // True
        System.out.println(simplify("1/6", "2/1"));  // False
        System.out.println(simplify("7/10", "10/2"));  // False
    }
}
// End of Code
