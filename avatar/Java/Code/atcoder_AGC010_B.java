import java.util.Scanner ; public class atcoder_AGC010_B { public static void main ( String [ ] args ) { Scanner scanner = new Scanner ( System.in ) ; int N = scanner.nextInt ( ) ; int [ ] A = new int [ N ] ; for ( int i = 0 ; i < N ; i ++ ) A [ i ] = scanner.nextInt ( ) ; if ( possible ( N , A ) ) { System.out.println ( "YES" ) ; } else { System.out.println ( "NO" ) ; } } private static boolean possible ( int N , int [ ] A ) { long sum = 0 ; for ( int i = 0 ; i < N ; i ++ ) sum += A [ i ] ; long NS = ( long ) N * ( N + 1 ) / 2 ; if ( sum % NS != 0 ) return false ; long K = sum / NS ; for ( int i = 0 ; i < N ; i ++ ) { int j = i == 0 ? N - 1 : i - 1 ; long d = K - ( A [ i ] - A [ j ] ) ; if ( d < 0 || d % N != 0 ) return false ; } return true ; } }
