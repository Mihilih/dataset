import java.io.* ; import java.util.* ; public class codeforces_462_B { public static void main ( String [ ] args ) throws Exception { BufferedReader f = new BufferedReader ( new InputStreamReader ( System.in ) ) ; PrintWriter out = new PrintWriter ( new BufferedWriter ( new OutputStreamWriter ( System.out ) ) ) ; StringTokenizer st = new StringTokenizer ( f.readLine ( ) ) ; int n = Integer.parseInt ( st.nextToken ( ) ) ; int k = Integer.parseInt ( st.nextToken ( ) ) ; c462b [ ] cards = new c462b [ 26 ] ; for ( int i = 0 ; i < 26 ; i ++ ) { cards [ i ] = new c462b ( ) ; } String s = f.readLine ( ) ; for ( int t = 0 ; t < n ; t ++ ) { cards [ s.charAt ( t ) - 'A' ].left ++ ; } long ans = 0 ; for ( int i = 0 ; i < k ; i ++ ) { Arrays.sort ( cards ) ; long change = Math.min ( cards [ 25 ].left , k - i ) ; ans += change * change ; cards [ 25 ].left -= change ; i += change - 1 ; } out.println ( ans ) ; out.close ( ) ; } } class c462b implements Comparable { int left = 0 ; @ Override public int compareTo ( Object o ) { return left - ( ( c462b ) o ).left ; } }