import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long a[] = new long[N];
        int tmp;
        int ans = 0;
        for (int z = 0; N > z; z++) {
            a[z] = sc.nextInt();
        }
        Arrays.sort(a);
        if (N == 1 && a[0] > 1) {
            ans = 1;
        } else {
            for (int j = 0; N > j; j++) {
                if (j == 0 || a[j] != a[j - 1]) {
                    tmp = 1;
                    for (int i = j+1; N > i; i++) {
                        if (a[j] == a[i]) {
                            tmp++;
                        }
                        else{
                            break;
                        }
                    }
                    
                    if (tmp > a[j]) {
                        ans += tmp - a[j];
                    } else if (tmp < a[j]) {
                        ans += tmp;
                    }
                
                }
            }
        }
        System.out.println(ans);
    }
}