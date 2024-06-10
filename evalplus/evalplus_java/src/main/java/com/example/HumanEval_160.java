package com.example;
//Here is the equivalent Java code for the Python function you provided:


import java.util.*;

public class HumanEval_160 {
    public static int doAlgebra(List<String> operator, List<Integer> operand) {
        String exp = "";
        for (int i=0; i<operator.size(); i++) {
            exp += operand.get(i) + operator.get(i);
        }
        exp += operand.get(operand.size() - 1);
        
        // Using JavaScript engine for eval function equivalent in Java
        javax.script.ScriptEngineManager mgr = new javax.script.ScriptEngineManager();
        javax.script.ScriptEngine engine = mgr.getEngineByName("JavaScript");
        int result = 0;
        try {
            result = (int) engine.eval(exp);
        } catch (javax.script.ScriptException e) {
            e.printStackTrace();
        }
        return result;
    }
}

//End of Code

//Please note that Java doesn't have a built-in eval function like Python. So, we use JavaScript's eval function by importing and using the `javax.script` package.
