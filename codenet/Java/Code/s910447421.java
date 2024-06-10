import java.io.*;
import java.math.*;
import java.util.*;
public class Main {
	static int ans = 100;
	static int[][] balls;
	static int N;
	static boolean[] taken;
	public static void main(String[] args) { 
		/*Fixate two coordinates in ordered pairs and extend same arithmetic difference for as 
		 * long as possible (sort coordinates first)
		 * Make connected graphs of coordinates that can be achieved with set p and q values
		 * */
		FastScanner I = new FastScanner(); //Input
		OutPut O = new OutPut(); //Output
		N = I.nextInt();
		ans=N;
		balls = new int[N][2];
		for (int i = 0; i < N; i++) {
			balls[i][0] = I.nextInt();
			balls[i][1] = I.nextInt();
		}
		Arrays.sort(balls,(a,b)->Integer.compare(a[0], b[0]));
		solve();
		for (int i = 0; i < N; i++) {
			int x = balls[i][0];
			int y = balls[i][1];
			balls[i][0]=y;
			balls[i][1]=x;
		}
		Arrays.sort(balls,(a,b)->Integer.compare(a[0], b[0]));
		solve();
		O.pln(ans);
	}
	public static void solve() {
		for (int add = 1; add<N; add++) {
			taken = new boolean[N];
			int p = balls[add][0]-balls[0][0];
			int q = balls[add][1]-balls[0][1]; //Differences
			ans=min(ans,check(p,q));
		}
	}
	public static int check(int p, int q) {
		int ret = 0;
		while (true) {
			boolean added=false;
			int start = 0;
			int x = -1;
			int y = -1; //Coordinates that we want next
			for (int i = 0; i < N; i++) {
				if (!taken[i]) {
					added=true;
					ret++;
					start=i;
					taken[i]=true;
					x=balls[i][0]+p;
					y=balls[i][1]+q;
					break;
				}
			}
			if (!added) break;
			for (int i = start+1; i < N; i++) {
				if (balls[i][0]==x&&balls[i][1]==y) {
					taken[i]=true;
					x+=p;
					y+=q;
				}
			} 
		}
		return ret;
	}
	public static double max(double a, double b) {return Math.max(a, b);}
	public static double min(double a, double b) {return Math.min(a, b);}
	public static long min(long a, long b) {return Math.min(a,b);}
	public static long max(long a, long b) {return Math.max(a,b);}
	public static int min(int a, int b) {return Math.min(a,b);}
	public static int max(int a, int b) {return Math.max(a,b);}
	public static long abs(long x) {return Math.abs(x);}
	public static long ceil(long num, long den) {long ans = num/den; if (num%den!=0) 
	ans++; return ans;}
	public static long GCD(long a, long b) {
		if (a==0||b==0) return max(a,b);
		return GCD(min(a,b),max(a,b)%min(a,b));
	}
	public static long FastExp(long base, long exp, long mod) {
		long ans=1;
		while (exp>0) {
			if (exp%2==1) ans*=base;
			exp/=2;
			base*=base;
			base%=mod;
			ans%=mod;
		}
		return ans;
	}
	public static long ModInv(long num,long mod) {return FastExp(num,mod-2,mod);}
	public static int pop(long x) { //Returns number of bits within a number
		int cnt = 0;
		while (x>0) {
			if (x%2==1) cnt++;
			x/=2;
		}
		return cnt;
	}
	static class FastScanner {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer("");
		String next() {
			while (!st.hasMoreTokens())
				try {
					st=new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			return st.nextToken();
		}
		int nextInt() {return Integer.parseInt(next());}
		long nextLong() {return Long.parseLong(next());};
		double nextDouble() {return Double.parseDouble(next());}
	}
	static class OutPut{
		PrintWriter w = new PrintWriter(System.out);
		void pln(double x) {w.println(x);w.flush();}
		void pln(boolean x) {w.println(x);w.flush();}
		void pln(int x) {w.println(x);w.flush();}
		void pln(long x) {w.println(x);w.flush();}
		void pln(String x) {w.println(x);w.flush();}
		void pln(char x) {w.println(x);w.flush();}
		void pln(StringBuilder x) {w.println(x);w.flush();}
		void pln(BigInteger x) {w.println(x);w.flush();}
		void p(int x) {w.print(x);w.flush();}
		void p(long x) {w.print(x);w.flush();}
		void p(String x) {w.print(x);w.flush();}
		void p(char x) {w.print(x);w.flush();}
		void p(StringBuilder x) {w.print(x);w.flush();}
		void p(BigInteger x) {w.print(x);w.flush();}
		void p(double x) {w.print(x);w.flush();}
		void p(boolean x) {w.print(x);w.flush();}
	}
}
