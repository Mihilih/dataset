import java.io.* ; import java.util.StringTokenizer ; public class codeforces_296_A { public static void main ( String [ ] args ) { InputStream inputStream = System.in ; OutputStream outputStream = System.out ; InputReader in = new InputReader ( inputStream ) ; PrintWriter out = new PrintWriter ( outputStream ) ; Task solver = new Task ( ) ; solver.solve ( in , out ) ; out.close ( ) ; } static class Task { public void solve ( InputReader in , PrintWriter out ) { int n = in.nextInt ( ) ; int [ ] array = new int [ 1001 ] ; for ( int i = 0 ; i < n ; i ++ ) { int index = in.nextInt ( ) ; array [ index ] ++ ; } int countMax = - 1 ; for ( int i = 1 ; i < array.length ; i ++ ) { if ( countMax < array [ i ] ) countMax = array [ i ] ; } if ( n % 2 == 0 ) { if ( countMax <= n / 2 ) { out.println ( "YES" ) ; } else { out.println ( "NO" ) ; } } else { if ( countMax <= n / 2 + 1 ) { out.println ( "YES" ) ; } else { out.println ( "NO" ) ; } } } } static class InputReader { BufferedReader reader ; StringTokenizer tokenizer ; public InputReader ( InputStream stream ) { reader = new BufferedReader ( new InputStreamReader ( stream ) , 32768 ) ; } String next ( ) { while ( tokenizer == null || ! tokenizer.hasMoreElements ( ) ) { try { tokenizer = new StringTokenizer ( reader.readLine ( ) ) ; } catch ( IOException e ) { throw new RuntimeException ( e ) ; } } return tokenizer.nextToken ( ) ; } int nextInt ( ) { return Integer.parseInt ( next ( ) ) ; } long nextLong ( ) { return Long.parseLong ( next ( ) ) ; } double nextDouble ( ) { return Double.parseDouble ( next ( ) ) ; } String nextLine ( ) { String str = "" ; try { str = reader.readLine ( ) ; } catch ( IOException e ) { e.printStackTrace ( ) ; } return str ; } } }
