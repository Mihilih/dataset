import java.util.* ; public class atcoder_ABC140_D { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int N = Integer.parseInt ( sc.next ( ) ) ; int K = Integer.parseInt ( sc.next ( ) ) ; String S = sc.next ( ) ; char [ ] c1 = S.toCharArray ( ) ; char [ ] c3 = S.toCharArray ( ) ; boolean flag = false ; int count = 0 ; for ( int i = 0 ; i < N ; i ++ ) { if ( flag && c1 [ i ] == 'R' ) { flag = false ; count ++ ; } if ( count == K ) { break ; } if ( c1 [ i ] == 'L' ) { flag = true ; c1 [ i ] = 'R' ; } } flag = false ; count = 0 ; for ( int i = 0 ; i < N ; i ++ ) { if ( flag && c3 [ i ] == 'L' ) { flag = false ; count ++ ; } if ( count == K ) { break ; } if ( c3 [ i ] == 'R' ) { flag = true ; c3 [ i ] = 'L' ; } } String S1 = new String ( c1 ) ; String S3 = new String ( c3 ) ; count = 1 ; int sum1 = 0 ; char bef = S1.charAt ( 0 ) ; for ( int i = 1 ; i < N ; i ++ ) { if ( S1.charAt ( i ) == bef ) { count ++ ; if ( i == N - 1 ) { sum1 += count - 1 ; } } else { bef = S1.charAt ( i ) ; sum1 += count - 1 ; count = 1 ; } } count = 1 ; int sum3 = 0 ; bef = S3.charAt ( 0 ) ; for ( int i = 1 ; i < N ; i ++ ) { if ( S3.charAt ( i ) == bef ) { count ++ ; if ( i == N - 1 ) { sum3 += count - 1 ; } } else { bef = S3.charAt ( i ) ; sum3 += count - 1 ; count = 1 ; } } System.out.println ( Math.max ( sum1 , sum3 ) ) ; } }
