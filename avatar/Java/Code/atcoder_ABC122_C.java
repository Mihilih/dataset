import java.util.* ; public class atcoder_ABC122_C { final static long mod = 1000000007 ; public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int n = sc.nextInt ( ) ; int q = sc.nextInt ( ) ; char [ ] c = sc.next ( ).toCharArray ( ) ; int [ ] [ ] range = new int [ q ] [ 2 ] ; for ( int i = 0 ; i < q ; i ++ ) { range [ i ] [ 0 ] = sc.nextInt ( ) ; range [ i ] [ 1 ] = sc.nextInt ( ) ; } int [ ] frag = new int [ n + 1 ] ; int [ ] rui = new int [ n + 1 ] ; for ( int i = 2 ; i <= n ; i ++ ) { if ( c [ i - 2 ] == 'A' && c [ i - 1 ] == 'C' ) { frag [ i ] ++ ; } rui [ i ] = rui [ i - 1 ] + frag [ i ] ; } for ( int i = 0 ; i < q ; i ++ ) { int left = range [ i ] [ 0 ] ; int right = range [ i ] [ 1 ] ; System.out.println ( rui [ right ] - rui [ left ] ) ; } } }
