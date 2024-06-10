import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        boolean ju[] = new boolean[100001];
        int pe[] = new int[100001];
        int wa=0;
        int ac=0;
        
        for(int i=0; i<b; i++){
            int n = sc.nextInt();
            String res = sc.next();
            
            if(res.equals("WA") && ju[n-1] != true){
                pe[n-1]++;
            }
            
            if(res.equals("AC")){
                ju[n-1] = true;
            }
        }
        
        for(int i=0; i<a ; i++){
            if(ju[i]){
                ac++;
                wa += pe[i];
            }
        }
        
        System.out.println(""+ac+" "+wa);
   }
}
