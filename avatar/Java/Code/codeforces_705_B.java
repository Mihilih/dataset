import java.util.* ; import java.io.* ; public class codeforces_705_B { static class FastReader { BufferedReader br ; StringTokenizer st ; public FastReader ( ) { br = new BufferedReader ( new InputStreamReader ( System.in ) ) ; } String next ( ) { while ( st == null || ! st.hasMoreElements ( ) ) { try { st = new StringTokenizer ( br.readLine ( ) ) ; } catch ( IOException e ) { e.printStackTrace ( ) ; } } return st.nextToken ( ) ; } int nextInt ( ) { return Integer.parseInt ( next ( ) ) ; } long nextLong ( ) { return Long.parseLong ( next ( ) ) ; } double nextDouble ( ) { return Double.parseDouble ( next ( ) ) ; } String nextLine ( ) { String str = "" ; try { str = br.readLine ( ) ; } catch ( IOException e ) { e.printStackTrace ( ) ; } return str ; } } static FastReader scan = new FastReader ( ) ; public static void main ( String [ ] args ) { int t = 1 ; while ( t -- > 0 ) { solve ( ) ; } } public static void solve ( ) { int t = scan.nextInt ( ) ; int [ ] arr = new int [ t ] ; for ( int i = 0 ; i < arr.length ; i ++ ) { arr [ i ] = scan.nextInt ( ) ; } int prevWinner = 0 ; for ( int i = 0 ; i < arr.length ; i ++ ) { if ( arr [ i ] == 1 ) { if ( prevWinner == 0 ) { prevWinner = 2 ; } } if ( prevWinner == 2 || prevWinner == 0 ) { if ( ( arr [ i ] - 1 ) % 2 == 0 ) { System.out.println ( 2 ) ; prevWinner = 2 ; } else { System.out.println ( 1 ) ; prevWinner = 1 ; } } else { if ( ( arr [ i ] - 1 ) % 2 == 0 ) { System.out.println ( 1 ) ; prevWinner = 1 ; } else { System.out.println ( 2 ) ; prevWinner = 2 ; } } } } }
