import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 整数の入力
        int n = sc.nextInt();
        int minN = sc.nextInt()-1;
        for(int i=0;i<n-1;i++){
            int h = sc.nextInt();
            if( minN == h){
                minN = h;
            }else if(minN == h-1){
                minN = h-1;
            }else if(minN < h-1){
                minN = h-1;
            }else if(minN > h){
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
}
