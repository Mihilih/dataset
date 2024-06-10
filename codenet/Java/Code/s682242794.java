import java.util.Scanner;
public class Main{
    int high;
    int low;
    int sa;
    
    public void solve(){
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<7;i++){
            high=sc.nextInt();
            low=sc.nextInt();
            sa=high-low;
            System.out.println(sa);
        }
    }
    
    public static void main(String[] args){
        Main obj = new Main();
        obj.solve();
    }
}