import java.util.*;
import java.io.*;
public class Main {
    long MOD = 1000000007;
    void solve(BufferedReader in) throws Exception {
        int[] xx = toInts(in.readLine());
        int min = Math.min(xx[0], xx[1]);
        int max = Math.max(xx[0], xx[1]);
        long res;
        if(min == max) {
            long f = f(min);
            res = (2*f*f)%MOD;
        } else if(min + 1 == max){
            long f = f(min);
            res = (f*((f*max)%MOD))%MOD;
        } else {
            res = 0;
        }
        System.out.println(res);
    }
    long f(int n) {
        long res = 1;
        for(int i = 2; i<=n; i++) res = (res*i)%MOD;
        return res;
    }
    int toInt(String s) {return Integer.parseInt(s);}
    int[] toInts(String s) {
        String[] a = s.split(" ");
        int[] o = new int[a.length];
        for(int i = 0; i<a.length; i++) o[i] = toInt(a[i]);
        return o;
    }
    void e(Object o) {
        System.err.println(o);
    }
    public static void main(String[] args) throws Exception{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        (new Main()).solve(in);
    }
}
