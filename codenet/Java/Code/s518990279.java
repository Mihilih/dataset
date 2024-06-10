import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
 
    public static final int BIG_NUM  = 2000000000;
    public static final int MOD  = 1000000007;
 
    public static void main(String[] args) {
 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int ans;
 
        while(true){
 
            try {
                String inputed = br.readLine();
                if(inputed.length() == 1 && inputed.equals("0"))break;
 
                ans = 0;
                for(int i = 0; i < inputed.length(); i++){
                    ans += inputed.charAt(i)-'0';
                }
 
                System.out.printf("%d\n", ans);
 
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
