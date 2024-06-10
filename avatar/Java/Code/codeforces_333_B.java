import java.util.* ; import java.io.* ; import static java.lang.Math.* ; public class codeforces_333_B { public static FastReader in = new FastReader ( ) ; public static PrintWriter out = new PrintWriter ( System.out ) ; public static void main ( String [ ] args ) { int n = in.nextInt ( ) , m = in.nextInt ( ) ; Set < Integer > bannedRows , bannedCols ; bannedRows = new HashSet < > ( ) ; bannedCols = new HashSet < > ( ) ; for ( int i = 0 ; i < m ; i ++ ) { int r = in.nextInt ( ) ; if ( r > 1 && r < n ) bannedRows.add ( r ) ; int c = in.nextInt ( ) ; if ( c > 1 && c < n ) bannedCols.add ( c ) ; } int answer = ( n - 2 ) * 2 ; answer -= bannedRows.size ( ) ; answer -= bannedCols.size ( ) ; if ( n % 2 != 0 ) { int mid = ( n + 1 ) / 2 ; if ( ! bannedRows.contains ( mid ) && ! bannedCols.contains ( mid ) ) { answer -- ; } } out.println ( answer ) ; out.close ( ) ; } public static class FastReader { BufferedReader br ; StringTokenizer st ; public FastReader ( ) { br = new BufferedReader ( new InputStreamReader ( System.in ) ) ; } String next ( ) { while ( st == null || ! st.hasMoreElements ( ) ) { try { st = new StringTokenizer ( br.readLine ( ) ) ; } catch ( IOException e ) { e.printStackTrace ( ) ; } } return st.nextToken ( ) ; } int nextInt ( ) { return Integer.parseInt ( next ( ) ) ; } long nextLong ( ) { return Long.parseLong ( next ( ) ) ; } double nextDouble ( ) { return Double.parseDouble ( next ( ) ) ; } String nextLine ( ) { String str = "" ; try { str = br.readLine ( ) ; } catch ( IOException e ) { e.printStackTrace ( ) ; } return str ; } } }
