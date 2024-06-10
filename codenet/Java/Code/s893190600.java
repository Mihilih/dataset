import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.lang.Character.Subset;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.time.temporal.ValueRange;
import java.util.AbstractMap;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ForkJoinPool;

import static java.util.Comparator.*;

public class Main {

    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        MyInput in = new MyInput(inputStream);
        PrintWriter out = new PrintWriter(outputStream);

        Solver solver = new Solver(in, out);
        solver.solve();

        out.close();
    }

    // ======================================================================
    static class Solver {
    	MyInput in;
    	PrintWriter out;
        public Solver(MyInput in, PrintWriter out) {
        	this.in = in;
        	this.out = out;
        }

        // -----------------------------------------
        public void solve() {
        	int H = ni();
        	int W = ni();
        	char[][] C = new char[H+2][W+2];
        	char[] c;
        	for (int i = 0; i < H; i++) {
				c = ns().toCharArray();
				for (int j = 0; j < W; j++) {
					C[i+1][j+1] = c[j];
				}
			}
        	if(H == 1 && W == 1) {
        		prn("No");
        		return;
        	}
        	for (int i = 1; i <= H; i++) {
				for (int j = 1; j <= W; j++) {
					if(C[i][j] == '#' && C[i-1][j] != '#' && C[i+1][j] != '#' 
									&& C[i][j-1] != '#' && C[i][j+1] != '#' ) {
		        		prn("No");
		        		return;
					}
				}
			}
    		prn("Yes");
    	}

        // -----------------------------------------
        // Integer のキーに対して、Integer のカウントを管理する（カウントを足したり、引いたりする）
        // キーの最大、最小の取得、データの追加、削除も O(long(N)) で処理できる
        //
        static class MapCounter {
        	private TreeMap<Integer, Integer> map;
        	// 昇順のマップ
        	public MapCounter() {
        		map = new TreeMap<>();
        	}
        	// reverse = tree なら降順のマップ
        	public MapCounter(boolean reverse) {
        		if(reverse) {
        			map = new TreeMap<Integer, Integer>(Collections.reverseOrder());
        		} else {
            		map = new TreeMap<>();
        		}
        	}
        	// キーを追加する（キーが存在すれば、カウントに１足す）
        	public void add(Integer key) {
        		add(key, 1);
        	}
           	public void add(Integer key, int cnt) {
           		Integer val = map.get(key);
        		if(val == null) {
        			map.put(key, cnt);
        		} else {
        			map.put(key,  val + cnt);
        		}
        	}
        	// キーを消す（キーが存在すれば、カウントを１減らす）
        	public void remove(Integer key) {
        		sub(key, 1, false);
        	}
           	// キーのカウントを減らす
        	public void sub(Integer key) {
        		sub(key, 1);
        	}
        	// キーのカウントから値を引く（マイナスのカウントを許す）
        	public void sub(Integer key, int cnt) {
        		sub(key, cnt, true);
        	}
        	// キーのカウントから値を引く
        	//  →　マイナスを許可しない場合で、カウントがマイナスになったら消す
           	public void sub(Integer key, int cnt, boolean minus) {
        		Integer val = map.get(key);
        		if(val == null) {
        			if(minus) {
        				map.put(key, -cnt);				// カウントのマイナスを許す
        			}
        		} else if(val > cnt || minus){
       				map.put(key, val - cnt);
        		} else {
        			map.remove(key);
        		}
        	}
           	// キーのカウントを設定する
           	public void set(Integer key, int cnt) {
    			map.put(key, cnt);
        	}
           	// キーのカウントを取得する（なければ　ＮＵＬＬを返す）
        	public Integer getCountwithNull(Integer key) {
        		return map.get(key);
        	}
        	// キーのカウントを取得する（なければ　０　を返す）
        	public Integer getCount(Integer key) {
        		Integer val = map.get(key);
        		if(val == null)		return 0;
        		else 				return val;
        	}
        	public Set<Integer> getKey() {
        		return map.keySet();
        	}
        	// 登録されているキーの数を返す
        	public int getKeyCount() {
        		return map.keySet().size();
        	}
        	// 先頭キーを返す
        	public Integer getFirstKey() {
        		return map.firstKey();
        	}
        	// 最終キーを返す
        	public Integer getLastKey() {
        		return map.lastKey();
        	}
        	// マップの初期化
        	public void clear() {
        		map.clear();
        	}
       }
        // -----------------------------------------
        // 配列のバイナリーサーチ　１
        boolean isRightMin(int[] a, boolean f, int index, int key) {
    	    if (f && a[index] >= key)		return true;		// 以上
    	    else if (!f && a[index] > key)	return true;		// より大きい
    	    else 							return false;	
    	}
    	// 配列 a の中で key 以上（f=true)または、より大きく（f=false)、一番小さい値を返す
    	int binarySearchRightMin(int[] a, boolean f, int key) {	
    	    int ng = -1; 				//「index = 0」が条件を満たすこともあるので、初期値は -1	
    	    int ok = (int)a.length; 	// 「index = a.length-1」が条件を満たさないこともあるので、初期値は a.length()	
    		
    	    /* ok と ng のどちらが大きいかわからないことを考慮 */	
    	    while (Math.abs(ok - ng) > 1) {	
    	        int mid = (ok + ng) / 2;	
    		
    	        if (isRightMin(a, f, mid, key))	ok = mid;	// 下半分を対象とする
    	        else 							ng = mid;	// 上半分を対象とする
    	    }	
    	    return ok;		// ←　ここで返すのは　isOK() が true の時にセットする方（ok / ng)
    	}
        // -----------------------------------------
        // 配列のバイナリーサーチ　２
        boolean isLeftMax(int[] a, boolean f, int index, int key) {
    	    if (f && a[index] <= key)		return true;		// 以下
    	    else if (!f && a[index] < key)	return true;		// より小さい
    	    else 							return false;	
    	}
    	// 配列 a の中で key 以下（f=true)または、より小さい（f=false)、一番大きい値を返す
    	int binarySearchLeftMax(int[] a, boolean f, int key) {	
    	    int ng = -1; 				//「index = 0」が条件を満たすこともあるので、初期値は -1	
    	    int ok = (int)a.length; 	// 「index = a.length-1」が条件を満たさないこともあるので、初期値は a.length()	
    		
    	    /* ok と ng のどちらが大きいかわからないことを考慮 */	
    	    while (Math.abs(ok - ng) > 1) {	
    	        int mid = (ok + ng) / 2;	
    		
    	        if (isLeftMax(a, f, mid, key))	ng = mid;	// 上半分を対象とする
    	        else 							ok = mid;	// 下半分を対象とする
    	    }	
    	    return ng;		// ←　ここで返すのは　isOK() が true の時にセットする方（ok / ng)
    	}
    	
        // -----------------------------------------
    	// オイラーツアー（部分木対応）　　　→　　工事中
    	static class EulerTour {
    		Graph g;
    		List<Integer> euler_tour = new ArrayList<>();
    		int[] begin, end;
    		int k = 0, root = 0;
    		
    		void dfs(int v,int p, PrintWriter out) {
    			out.println("v = " + v + "  p = " + p);
    			begin[v] = k;
    			euler_tour.add(v);
    			k++;
    			if(!g.contains(v)) {
    				return;
    			}
    			for(int i : g.get(v)) {
    				if(i != p) {
    					dfs(i, v, out);
    					euler_tour.add(v);
    					k++;
    				}
    			}
    			end[v]=k;
    		}
    		// 初期化
    		public void init(int p_cnt, int root, Graph g, PrintWriter out) {
    			begin = new int[p_cnt + 1];
    			end = new int[p_cnt + 1];
    			this.root = root;
    			this.g = g;
    			dfs(root, -1, out);
    		}
    		// 部分木の頂点を渡すと、オイラーツアーの部分木を返す
    		public List getPartTour(int v) {
    			return euler_tour.subList(begin[v], end[v]);
    		}
    		// 部分木の頂点を渡すと、頂点のリストを返す
    		public List<Integer> getPartList(int v) {
    			Set<Integer> set = new TreeSet<>();
				set.addAll(getPartTour(v));
				List<Integer> ans = new ArrayList<>();
				for(Integer p : set) {
					ans.add(p);
				}
				return ans;
    		}
    	}
    	
        // -----------------------------------------
        // 重みなし　グラフのリンクリスト
        class Graph {
        	// 頂点に紐づく頂点のリスト
            private Map<Integer, List<Integer>> data = new HashMap<Integer, List<Integer>>();
//            // 全ての頂点のセット
//            private Set<Integer> point = new TreeSet<>();
            // 頂点と頂点の繋がりを追加する
            void add(int from, int to) {
            	List<Integer> list = data.get(from);
            	if(list == null) {
            		list = new ArrayList<Integer>();
            		data.put(from, list);
            	}
            	list.add(to);
//            	point.add(from);
//            	point.add(to);
            }
            // 始点から終点が繋がっていれば切る
            void del(int from, int to) {
            	List<Integer> list = data.get(from);
            	if(list == null) {
            		return;
            	}
            	if(list.contains(to)) {
            		list.remove((Object)to);
            	}
            }
            // 指定された頂点に紐づく、頂点のリストを返す
            List<Integer> get(int key) {
            	return data.get(key);
            }
            // 頂点 key が登録されているか？
            boolean contains(int key) {
            	return data.containsKey(key);
            }
            
            //　頂点のセットを返す
            Set<Integer> keySet() {
            	return data.keySet();
            }
            // 頂点　key_1 と 頂点　key_2 が　直接　つながっていれば　true を返す
            boolean isConnect(int key_1, int key_2) {
            	List<Integer> list = data.get(key_1);
            	if(list == null)	return false;
            	else 				return list.contains(key_2);
            }
            // 指定された頂点から、すべての頂点への距離を返す(DFS O(N)）　→　返り値が　終点と距離のペア　のリスト
            List<PP> distList(int key) {
            	List<PP> dist = new ArrayList<>();		// 頂点と距離のペアのリスト
            	Set<Integer> mark = new HashSet<>();	// 処理したら入れる
    			Stack<PP> stack = new Stack<>();		// スタックの宣言
    			stack.push(new PP(key, 0));				// スタートをスタックに保存
    			while(!stack.isEmpty()) {
    				PP wk = stack.pop();				// スタックから次の頂点を取得
    				int pp = wk.getKey();
    				int dd = wk.getVal();
    				mark.add(pp);						// 通過マーク
        			dist.add(new PP(pp, dd));			// 距離を登録
    				List<Integer> list = get(pp);		// つながっている頂点のリストを取得
    				for(int next : list) {
    					if(mark.contains(next))	continue;
    					stack.push(new PP(next, dd + 1));
    				}
    			}
    			return dist;
            }
            // 指定された頂点から、すべての頂点への距離を返す(DFS O(N)）	→　返り値は配列
            int[] distV(int key) {
            	int[] dist = new int[data.keySet().size()+1];		// [頂点] = 距離
            	Arrays.fill(dist, -1);					// 届かない場合　-1
            	Set<Integer> mark = new HashSet<>();	// 処理したら入れる
    			Stack<PP> stack = new Stack<>();		// スタックの宣言
    			stack.push(new PP(key, 0));				// スタートをスタックに保存
    			while(!stack.isEmpty()) {
    				PP wk = stack.pop();				// スタックから次の頂点を取得
    				int pp = wk.getKey();
    				int dd = wk.getVal();
    				mark.add(pp);						// 通過マーク
    				dist[pp] = dd;						// 距離を登録
    				List<Integer> list = get(pp);		// つながっている頂点のリストを取得
    				for(int next : list) {
    					if(mark.contains(next))	continue;
    					stack.push(new PP(next, dd + 1));
    				}
    			}
    			return dist;
            }
        	Map<Integer, Integer> mapCnt = new HashMap<>();		// 項番（何番目に訪れたか）
        	Map<Integer, Integer> mapLow = new HashMap<>();		// 初期値は項番、つながっている先の項番が小さければコピーする
																// mapCnt > mapLow なら閉路に含まれる頂点
        	Set<Integer> mark = new HashSet<>();				// 処理したら入れる
        	int number;
        	// mapCnt, mapLow を設定する
            int bridgeDfs(int now, int pre) {
//            	prn("bridgeDfs  now = " + now + " number = " + number);
            	mark.add(now);
            	mapCnt.put(now, number);
            	mapLow.put(now, number);
            	int low;
            	for(int next : get(now)) {
            		if(next == pre)		continue;
            		if(mark.contains(next)) {
            			if(mapLow.get(now) > mapLow.get(next)) {
//            				prn("  mapLow[" + now + "] = " + mapLow.get(now) 
//            						+ " > mapLow[" + next + "] = " + mapLow.get(next));
            				mapLow.put(now, mapLow.get(next));
            			}
            			continue;
            		}
            		number++;
            		low = bridgeDfs(next, now);
        			if(mapLow.get(now) > low) {
        				mapLow.put(now, low);
        			}
            	}
            	return mapLow.get(now);
            }
            // 橋の数を返す  先頭の頂点番号を引数とする
            int bridgeCnt(int start) {
            	mapCnt.clear();
            	mapLow.clear();
            	mark.clear();
            	number = 0;
            	bridgeDfs(start, start);
            	int ans = 0;
            	for(int key : mapCnt.keySet()) {
            		if(mapCnt.get(key) == mapLow.get(key)) {
            			ans++;
            		}
            	}
            	return ans - 1;
            }
            // ダンプ
            void dump(PrintWriter out) {
            	for(int key : data.keySet()) {
            		out.print(key + " : ");
            		for(int val : data.get(key)) {
            			out.print(val + " ");
            		}
            		out.println("");
            	}
            }
        }
        // -----------------------------------------
        // 重さを持ったグラフのリンクリスト
        static class GraphWith {
        	// キーに紐づくリストに、頂点番号と重さのペアを持つ
            private Map<Integer, List<PP>> data = new HashMap<Integer, List<PP>>();
            // 指定された頂点に紐づく、頂点と重さのペアを追加する
            void add(int key, PP p) {
            	List<PP> list = data.get(key);
            	if(list == null) {
            		list = new ArrayList<PP>();
            		data.put(key, list);
            	}
            	list.add(p);
            }
            // 頂点に紐づく、頂点と重さのペアのリストを返す
            List<PP> get(int key) {
            	return data.get(key);
            }
            // 頂点 key が登録されているか？
            boolean contains(int key) {
            	return data.containsKey(key);
            }
            
            //　頂点のセットを返す
            Set<Integer> keySet() {
            	return data.keySet();
            }
            // 頂点　key_1 と 頂点　key_2 が　直接　つながっていれば　true を返す
            boolean isConnect(int key_1, int key_2) {
            	List<PP> list = data.get(key_1);
            	if(list == null)	return false;
            	boolean ans = false;
            	for(PP p : list) {
            		if(p.getKey() == key_2) {
            			ans = true;
            			break;
            		}
            	}
            	return ans;
            }
            // 頂点　key_1 と 頂点　key_2 　の距離を返す（つながっていなければ　Integer.MAX_VALUE)
            int distance(int key_1, int key_2) {
            	Set<Integer> mark = new HashSet<>();	// 処理したら入れる
    			Stack<PP> stack = new Stack<>();		// スタックの宣言
    			stack.push(new PP(key_1, 0));			// スタートをスタックに保存
    			PP wk;
    			int key, val;
    			List<PP> list;
    			while(!stack.isEmpty()) {
    				wk = stack.pop();					// スタックから次の頂点を取得
    				key = wk.getKey();
    				val = wk.getVal();
    				mark.add(key);						// 通過マーク
    				if(key == key_2)	return val;
    				
    				list = get(key);					// つながっている頂点のリストを取得
    				if(list == null)	continue;
    				for(PP pp : list) {
    					if(mark.contains(pp.getKey()))	continue;
    					stack.push(new PP(pp.getKey(), val + pp.getVal()));
    				}
    			}
    			return Integer.MAX_VALUE;
            }
        }
        // -----------------------------------------
        // 重みなし　グラフのリンクリスト(Long)
        static class GraphLong {
            private Map<Long, List<Long>> G = new HashMap<Long, List<Long>>();
            void add(long key, long value) {
            	List<Long> list = G.get(key);
            	if(list == null) {
            		list = new ArrayList<Long>();
            		G.put(key, list);
            	}
            	list.add(value);
            }
            List<Long> get(long key) {
            	return G.get(key);
            }
        }
        // -----------------------------------------
        // 重さを持ったグラフのリンクリスト(Long)
        static class GraphLongWith {
            private Map<Long, List<PPL>> G = new HashMap<Long, List<PPL>>();
            void add(long key, PPL p) {
            	List<PPL> list = G.get(key);
            	if(list == null) {
            		list = new ArrayList<PPL>();
            		G.put(key, list);
            	}
            	list.add(p);
            }
            List<PPL> get(long key) {
            	return G.get(key);
            }
        }
        // -----------------------------------------

        void prn(String s) {
        	out.println(s);
        }
        void prn(int i) {
        	out.println(i);
        }
        void prn(long i) {
        	out.println(i);
        }
        void prr(String s) {
        	out.print(s);
        }
        int ni() {
        	return in.nextInt();
        }
        long nl() {
        	return in.nextLong();
        }
        double nd() {
        	return in.nextDouble();
        }
        String ns() {
        	return in.nextString();
        }
        int[] ndi(int n) {
        	int[] ans = new int[n];
        	for(int i=0; i < n; i++) {
        		ans[i] = ni();
        	}
        	return ans;
        }
        long[] ndl(int n) {
        	long[] ans = new long[n];
        	for(int i=0; i < n; i++) {
        		ans[i] = nl();
        	}
        	return ans;
        }
        double[] ndd(int n) {
        	double[] ans = new double[n];
        	for(int i=0; i < n; i++) {
        		ans[i] = nd();
        	}
        	return ans;
        }
        String[] nds(int n) {
        	String[] ans = new String[n];
        	for(int i=0; i < n; i++) {
        		ans[i] = ns();
        	}
        	return ans;
        }
        int[][] nddi(int n, int m) {
        	int[][] ans = new int[n][m];
        	for(int i=0; i < n; i++) {
            	for(int j=0; j < m; j++) {
            		ans[i][j] = ni();
            	}
        	}
        	return ans;
        }
        long[][] nddl(int n, int m) {
        	long[][] ans = new long[n][m];
        	for(int i=0; i < n; i++) {
            	for(int j=0; j < m; j++) {
            		ans[i][j] = nl();
            	}
        	}
        	return ans;
        }
    }
    // Set に入れるなら　PPKEY　を使う！
    static class PP{
    	public int key, val;
    	public PP(int key, int val) {
    		this.key = key;
    		this.val = val;
    	}
		public int getKey() {
			return key;
		}
		public void setKey(int key) {
			this.key = key;
		}
		public int getVal() {
			return val;
		}
		public void setVal(int val) {
			this.val = val;
		}
    }
    static class PPP{
    	public int key, val1, val2;
    	public PPP(int key, int val1, int val2) {
    		this.key = key;
    		this.val1 = val1;
    		this.val2 = val2;
    	}
		public int getKey() {
			return key;
		}
		public void setKey(int key) {
			this.key = key;
		}
		public int getVal1() {
			return val1;
		}
		public void setVal1(int val1) {
			this.val1 = val1;
		}
		public int getVal2() {
			return val2;
		}
		public void setVal2(int val2) {
			this.val2 = val2;
		}
    }
    static class PPL {
    	public long key, val;
    	public PPL(long key, long val) {
    		this.key = key;
    		this.val = val;
    	}
		public long getKey() {
			return key;
		}
		public void setKey(long key) {
			this.key = key;
		}
		public long getVal() {
			return val;
		}
		public void setVal(long val) {
			this.val = val;
		}
    }
    static class PPDL {
    	public long key;
    	public long[] val;
    	public PPDL(long key, long[] val) {
    		this.key = key;
    		this.val = val;
    	}
		public long getKey() {
			return key;
		}
		public void setKey(long key) {
			this.key = key;
		}
		public long[] getVal() {
			return val;
		}
		public void setVal(long[] val) {
			this.val = val;
		}
		public void dump(PrintWriter out) {
			out.print("key = " + key + "  val ");
			for(int i=0; i < val.length; i++) {
				out.print("[" + val[i] + "] ");
			}
			out.println("");
		}
    }
    // HashMap のキーに使う　→　Set に入れるのもこれ（PPでは値での比較が行われない）
    static final class PPKEY {
    	private final int key, val;
    	public PPKEY(int key, int val) {
    		this.key = key;
    		this.val = val;
    	}
		public int getKey() {
			return key;
		}
		public int getVal() {
			return val;
		}
	    @Override
	    public boolean equals(Object obj) {
	        if (obj instanceof PPKEY) {
	        	PPKEY dest = (PPKEY) obj;
	            return this.key == dest.key && this.val == dest.val;
	        } else {
	            return false;
	        }
	    }
	    @Override
	    public int hashCode() {
	        return Objects.hash(key, val);
	    }
    }
    // HashMap のキーに使う　→　Set に入れるのもこれ（PPでは値での比較が行われない）
    static final class PPLKEY{
    	private final long key, val;
    	public PPLKEY(long key, long val) {
    		this.key = key;
    		this.val = val;
    	}
		public long getKey() {
			return key;
		}
		public long getVal() {
			return val;
		}
	    @Override
	    public boolean equals(Object obj) {
	        if (obj instanceof PPKEY) {
	        	PPKEY dest = (PPKEY) obj;
	            return this.key == dest.key && this.val == dest.val;
	        } else {
	            return false;
	        }
	    }
	    @Override
	    public int hashCode() {
	        return Objects.hash(key, val);
	    }
    }
    // ======================================================================
    static class Pair<K, V> extends AbstractMap.SimpleEntry<K, V> {
        /** serialVersionUID. */
        private static final long serialVersionUID = 6411527075103472113L;

        public Pair(final K key, final V value) {
            super(key, value);
        }
     }
    static class MyInput {
        private final BufferedReader in;
        private static int pos;
        private static int readLen;
        private static final char[] buffer = new char[1024 * 8];
        private static char[] str = new char[500 * 8 * 2];
        private static boolean[] isDigit = new boolean[256];
        private static boolean[] isSpace = new boolean[256];
        private static boolean[] isLineSep = new boolean[256];

        static {
            for (int i = 0; i < 10; i++) {
                isDigit['0' + i] = true;
            }
            isDigit['-'] = true;
            isSpace[' '] = isSpace['\r'] = isSpace['\n'] = isSpace['\t'] = true;
            isLineSep['\r'] = isLineSep['\n'] = true;
        }

        public MyInput(InputStream is) {
            in = new BufferedReader(new InputStreamReader(is));
        }

        public int read() {
            if (pos >= readLen) {
                pos = 0;
                try {
                    readLen = in.read(buffer);
                } catch (IOException e) {
                    throw new RuntimeException();
                }
                if (readLen <= 0) {
                    throw new MyInput.EndOfFileRuntimeException();
                }
            }
            return buffer[pos++];
        }

        public int nextInt() {
            int len = 0;
            str[len++] = nextChar();
            len = reads(len, isSpace);
            int i = 0;
            int ret = 0;
            if (str[0] == '-') {
                i = 1;
            }
            for (; i < len; i++) ret = ret * 10 + str[i] - '0';
            if (str[0] == '-') {
                ret = -ret;
            }
            return ret;
        }

        public long nextLong() {
            int len = 0;
            str[len++] = nextChar();
            len = reads(len, isSpace);
            int i = 0;
            long ret = 0L;
            if (str[0] == '-') {
                i = 1;
            }
            for (; i < len; i++) ret = ret * 10 + str[i] - '0';
            if (str[0] == '-') {
                ret = -ret;
            }
            return ret;
        }

        public double nextDouble() {
            int len = 0;
            str[len++] = nextChar();
            len = reads(len, isSpace);
            int i = 0;
            double ret = 0;
            if (str[0] == '-') {
                i = 1;
            }
            int cnt = 0;
            for (; i < len; i++) {
            	if(str[i] == '.') {
            		cnt = 10;
            		continue;
            	}
            	if(cnt == 0) {
            		ret = ret * 10 + str[i] - '0';
            	} else {
            		ret = ret + ((double)(str[i] - '0') / cnt);
            		cnt *= 10;
            	}
            }
            if (str[0] == '-') {
                ret = -ret;
            }
            return ret;
        }

       public String nextString() {
        	String ret = new String(nextDChar()).trim();
            return ret;
        }

        public char[] nextDChar() {
            int len = 0;
            len = reads(len, isSpace);
            char[] ret = new char[len + 1];
            for (int i=0; i < len; i++)		ret[i] = str[i];
            ret[len] = 0x00;
            return ret;
        }

        public char nextChar() {
            while (true) {
                final int c = read();
                if (!isSpace[c]) {
                    return (char) c;
                }
            }
        }

        int reads(int len, boolean[] accept) {
            try {
                while (true) {
                    final int c = read();
                    if (accept[c]) {
                        break;
                    }
                    if (str.length == len) {
                        char[] rep = new char[str.length * 3 / 2];
                        System.arraycopy(str, 0, rep, 0, str.length);
                        str = rep;
                    }
                    str[len++] = (char) c;
                }
            } catch (MyInput.EndOfFileRuntimeException e) {
            }
            return len;
        }

        static class EndOfFileRuntimeException extends RuntimeException {
        }
    }
}
