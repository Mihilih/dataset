import java.util.* ; public class codeforces_632_B { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int n = sc.nextInt ( ) ; int [ ] a = new int [ n ] ; for ( int i = 0 ; i < n ; i ++ ) { a [ i ] = sc.nextInt ( ) ; } String s = sc.next ( ) ; long sum = 0 ; for ( int i = 0 ; i < s.length ( ) ; i ++ ) { char ch = s.charAt ( i ) ; if ( ch == 'B' ) sum += a [ i ] ; } long ans = sum ; long sum1 = sum ; for ( int i = 0 ; i < s.length ( ) ; i ++ ) { if ( s.charAt ( i ) == 'A' ) sum1 += a [ i ] ; else sum1 -= a [ i ] ; ans = Math.max ( ans , sum1 ) ; } sum1 = sum ; for ( int i = s.length ( ) - 1 ; i >= 0 ; i -- ) { if ( s.charAt ( i ) == 'A' ) sum1 += a [ i ] ; else sum1 -= a [ i ] ; ans = Math.max ( ans , sum1 ) ; } System.out.println ( ans ) ; } }