package com.example;
//Here is the Java version of your Python code:


import java.util.ArrayList;

public class HumanEval_32 {
    
    public static double poly(ArrayList<Double> xs, double x) {
        double sum = 0;
        for (int i = 0; i < xs.size(); i++) {
            sum += xs.get(i) * Math.pow(x, i);
        }
        return sum;
    }
  
    public static double findZero(ArrayList<Double> xs) {
        ArrayList<Double> dxs = new ArrayList<Double>();
        for (int i = 1; i < xs.size(); i++) {
            dxs.add(xs.get(i) * i);
        }
        
        double tol = 1e-5;
        double x = 0;
        for (int i = 0; i < 1000; i++) {
            double fx = poly(xs, x);
            double dfx = poly(dxs, x);
            if (Math.abs(fx) < tol) break;
            x = x - fx / dfx;
        }

        return x;
    }

    public static void main(String[] args) {
        ArrayList<Double> array = new ArrayList<Double>();
        array.add(1.0);
        array.add(2.0);
        System.out.println(findZero(array));
    }
}

//End of Code
