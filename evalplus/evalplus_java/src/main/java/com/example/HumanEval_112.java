package com.example;
public class HumanEval_112 {
    
    public static Object[] reverse_delete(String s, String c){
        String ss = s.chars()
                     .filter(ch -> c.indexOf(ch) == -1)
                     .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                     .toString();
        return new Object[] {ss, ss.equals(new StringBuilder(ss).reverse().toString())};
    }

    public static void main(String[] args){
        Object[] result = reverse_delete("abcde", "ae");
        System.out.println(result[0] + ", " + result[1]);

        result = reverse_delete("abcdef", "b");
        System.out.println(result[0] + ", " + result[1]);

        result = reverse_delete("abcdedcba", "ab");
        System.out.println(result[0] + ", " + result[1]);
    }
}
// End of Code
