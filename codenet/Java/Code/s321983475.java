import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int answer = Math.max(a,b)-Math.min(a,b) -w;
        if(answer <0){
            System.out.println(0);
        }else{
            System.out.println(answer);
        }
    }
}