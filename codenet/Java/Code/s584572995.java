import java.util.*;
import java.io.*;

public class Main {
	static int mod = (int) 1e9 + 7;
	static List<ArrayList<Integer>> to;
	static int dp[];
	public static void main(String[] args) {
		FastScanner fs = new FastScanner(System.in);
		int N = fs.nextInt();
		to = new ArrayList<>();
		for(int i=0;i<N;i++) to.add(new ArrayList<Integer>());
		int edges[][] = new int[N-1][2]; //どちらが子になるかdfsするまでわからないので両方持っておく
		for(int i=0;i<N-1;i++) {
			int A = fs.nextInt()-1, B = fs.nextInt()-1;
			to.get(A).add(B);
			to.get(B).add(A);
			edges[i][0] = B;
			edges[i][1] = A;
		}
		dp = new int[N];
		rec(0, -1);
		long mulsum = 0;
		for(int e[]:edges) {
			//子の配下の頂点数を知りたいので、どちらが子頂点か調べる
			int candidate1 = e[0];
			int candidate2 = e[1];
			int child = candidate1;
			if(dp[candidate1]>dp[candidate2])child = candidate2;
			
			long a = dp[child];
			long b = N - a;

			//mulは、全ケース(2^n通り)における、この辺が部分木Sに含まれる回数		
			//この辺を境にしてできる部分木2つについてそれぞれ、1つ以上黒を含む確率を求めて、掛け合わせた物に
			//2^nをかけて場合の数にした
			long mul = (modpow(2, a) - 1)*(modpow(2, b) - 1)%mod;			
			mulsum += mul;
			mulsum %= mod;
		}
		long cases = modpow(2, N);
		//PN:全ケースにおける、部分木Sに含まれる頂点数の総和
		//頂点の数は、辺の数＋１であり、辺の数が０の場合でも、黒頂点１個の空グラフがSに含まれるので問題ないが、
		//全部白頂点の場合だけはSに含まれない頂点を足してしまうことになるので、そのケースの１通りを引く
		long PN = (mulsum + (cases - 1 + mod)%mod)%mod ;//全ケースの含まれる頂点の合計
		
		//Sに含まれる黒頂点は全頂点数の半分になる（黒頂点なら必ずSに含まれるため）
		long BN = N * modpow(2, N-1) %mod;
		//Sに含まれる白頂点は、全頂点数ー黒頂点数
		long WN = (PN - BN + mod)%mod;
		long ans = WN * modpow(cases, mod-2);
		ans %= mod;
		
		System.out.println(ans);
	}
	
	static int rec(int v, int parent) {
		int res = 1;
		for(int next:to.get(v)) {
			if(next == parent) continue;
			res += rec(next, v);
		}
		return dp[v] = res;
	}
	

	static long modpow(long x, long y) {
		if(y==0) return 1;
		if(y%2!=0) return x * modpow(x, y-1) % mod;
		long tmp = modpow(x, y/2);
		return tmp * tmp % mod; 
	}
}

//高速なScanner
class FastScanner {
	private BufferedReader reader = null;
	private StringTokenizer tokenizer = null;

	public FastScanner(InputStream in) {
		reader = new BufferedReader(new InputStreamReader(in));
		tokenizer = null;
	}

	public String next() {
		if (tokenizer == null || !tokenizer.hasMoreTokens()) {
			try {
				tokenizer = new StringTokenizer(reader.readLine());
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
		return tokenizer.nextToken();
	}

	public String nextLine() {
		if (tokenizer == null || !tokenizer.hasMoreTokens()) {
			try {
				return reader.readLine();
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
		return tokenizer.nextToken("\n");
	}

	public long nextLong() {
		return Long.parseLong(next());
	}

	public int nextInt() {
		return Integer.parseInt(next());
	}

	public double nextDouble() {
		return Double.parseDouble(next());
	}

	public int[] nextIntArray(int n) {
		int[] a = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = nextInt();
		return a;
	}

	public long[] nextLongArray(int n) {
		long[] a = new long[n];
		for (int i = 0; i < n; i++)
			a[i] = nextLong();
		return a;
	}
}