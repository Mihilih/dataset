import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        String T = scanner.nextLine();
        int min = Integer.MAX_VALUE;
        for(int i = 0; i<=S.length()-T.length(); i++){
            min = Math.min(min, find(S.substring(i, i+T.length()), T));
        }
        if(min!=Integer.MAX_VALUE){
            System.out.println(min);
        }else{
            System.out.println(T.length());
        }

    }

    public static int find(String a, String b){
        int calc = 0;
        for(int x = 0; x<a.length(); x++){
            if(a.charAt(x) != b.charAt(x)){
                calc++;
            }
        }
        return calc;
    }
}
