import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 0;
        int next = 10;
        for(int i = 1; i <= N; i++){
            count++;
            if(i == next - 1){
                i = next * 10 - 1;
                next *= 100;
            }
        }
        System.out.println(count);
    }
}
