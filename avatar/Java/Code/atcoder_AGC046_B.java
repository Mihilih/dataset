import java.io.PrintWriter ; import java.util.HashMap ; import java.util.Map ; import java.util.Scanner ; public class atcoder_AGC046_B { long MOD = 998244353L ; long [ ] [ ] dp = new long [ 3001 ] [ 3001 ] ; void solve ( Scanner sc , PrintWriter pw ) { int A = sc.nextInt ( ) ; int B = sc.nextInt ( ) ; int C = sc.nextInt ( ) ; int D = sc.nextInt ( ) ; dp [ A ] [ B ] = 1 ; for ( int c = A ; c <= C ; c ++ ) { for ( int d = B ; d <= D ; d ++ ) { if ( c == A && d == B ) { continue ; } long ans = 0 ; if ( c > A ) { long part = dp [ c - 1 ] [ d ] ; ans = ( part * d ) ; } if ( d > B ) { long part = dp [ c ] [ d - 1 ] ; ans = ( ans + ( part * c ) ) ; } if ( c > A && d > B ) { ans = ( ans - ( dp [ c - 1 ] [ d - 1 ] * ( c - 1 ) * ( d - 1 ) ) ) ; } dp [ c ] [ d ] = ( ( ans % MOD ) + MOD ) % MOD ; } } pw.println ( dp [ C ] [ D ] ) ; } public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; PrintWriter pw = new PrintWriter ( System.out ) ; new atcoder_AGC046_B ( ).solve ( sc , pw ) ; pw.flush ( ) ; pw.close ( ) ; sc.close ( ) ; } }