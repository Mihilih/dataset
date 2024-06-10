package com.example;
public class HumanEval_99 {

    public static int closestInteger(String value) {
        double val = Double.parseDouble(value);
        if (Math.abs(val - (int)val) != 0.5) {
            return (int)Math.round(val);
        }
        if (val > 0) {
            return (int)val + 1;
        } else {
            return (int)val - 1;
        }
    }

    public static void main(String[] args) {
        System.out.println(closestInteger("10"));
        System.out.println(closestInteger("15.3"));
        System.out.println(closestInteger("14.5"));
        System.out.println(closestInteger("-14.5"));
    }
}
// End of Code
