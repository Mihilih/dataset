import java.util.* ; import java.lang.* ; public class codeforces_31_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int n = sc.nextInt ( ) ; int f = 0 ; int [ ] a = new int [ n ] ; for ( int i = 0 ; i < n ; i ++ ) { a [ i ] = sc.nextInt ( ) ; } int k = 0 , j = 0 , i = 0 ; for ( k = 0 ; k < n ; k ++ ) { int t = a [ k ] ; for ( i = 0 ; i < n ; i ++ ) { for ( j = 0 ; j < n - 1 ; j ++ ) { if ( i != j && t == ( a [ i ] + a [ j ] ) ) { f = 1 ; break ; } } if ( f == 1 ) break ; } if ( f == 1 ) break ; } if ( f == 1 ) System.out.println ( k + 1 + " " + ( j + 1 ) + " " + ( i + 1 ) ) ; else System.out.println ( "-1" ) ; } }
