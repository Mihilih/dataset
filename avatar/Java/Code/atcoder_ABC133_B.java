import java.lang.Math ; import java.util.Scanner ; public class atcoder_ABC133_B { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int N = sc.nextInt ( ) ; int D = sc.nextInt ( ) ; int [ ] [ ] vectors = new int [ N ] [ D ] ; for ( int i = 0 ; i < N ; i ++ ) { for ( int j = 0 ; j < D ; j ++ ) { vectors [ i ] [ j ] = sc.nextInt ( ) ; } } int answer = 0 ; for ( int i = 0 ; i < N - 1 ; i ++ ) { for ( int j = i + 1 ; j < N ; j ++ ) { int dist = 0 ; for ( int d = 0 ; d < D ; d ++ ) { int x = ( vectors [ i ] [ d ] - vectors [ j ] [ d ] ) ; dist += ( x * x ) ; } double sq = Math.sqrt ( dist ) ; answer += ( Math.abs ( sq - Math.floor ( sq ) ) < 0.001 ? 1 : 0 ) ; } } System.out.println ( answer ) ; } }
