import java.util.Scanner ; public class codeforces_203_B { public static void main ( String [ ] args ) { Scanner in = new Scanner ( System.in ) ; int N = in.nextInt ( ) ; int M = in.nextInt ( ) ; int [ ] [ ] black = new int [ N + 2 ] [ N + 2 ] ; for ( int m = 1 ; m <= M ; m ++ ) { int x = in.nextInt ( ) ; int y = in.nextInt ( ) ; for ( int xx = x - 1 ; xx <= x + 1 ; xx ++ ) { for ( int yy = y - 1 ; yy <= y + 1 ; yy ++ ) { if ( ++ black [ xx ] [ yy ] == 9 ) { System.out.println ( m ) ; return ; } } } } System.out.println ( "-1" ) ; } }
