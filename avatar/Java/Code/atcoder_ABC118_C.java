import java.util.* ; public class atcoder_ABC118_C { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int n = sc.nextInt ( ) ; ArrayList < Integer > a = new ArrayList < > ( ) ; if ( n == 1 ) { System.out.println ( sc.nextInt ( ) ) ; System.exit ( 0 ) ; } for ( int i = 0 ; i < n ; i ++ ) { a.add ( sc.nextInt ( ) ) ; } Collections.sort ( a ) ; if ( a.get ( a.size ( ) - 1 ) == 0 ) { System.out.println ( 0 ) ; System.exit ( 0 ) ; } int ans = 0 ; while ( true ) { if ( a.size ( ) == 1 ) { ans = a.get ( 0 ) ; break ; } a = func ( a ) ; } System.out.println ( ans ) ; } private static ArrayList < Integer > func ( ArrayList < Integer > A ) { ArrayList < Integer > a = A ; int min = 0 ; for ( int i = 0 ; i < a.size ( ) ; i ++ ) { if ( a.get ( i ) == 0 ) { a.remove ( i ) ; i -- ; } else { if ( min != 0 ) { a.set ( i , a.get ( i ) % min ) ; if ( a.get ( i ) == 1 ) { System.out.println ( 1 ) ; System.exit ( 0 ) ; } } else { min = a.get ( i ) ; } } } Collections.sort ( a ) ; return a ; } }
