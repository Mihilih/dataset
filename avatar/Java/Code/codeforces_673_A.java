import java.util.* ; public class codeforces_673_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int n = sc.nextInt ( ) ; ArrayList < Integer > a = new ArrayList < Integer > ( ) ; int value ; for ( int i = 0 ; i < n ; i ++ ) { value = sc.nextInt ( ) ; a.add ( value ) ; } int result , pos = 0 , flag = 0 ; if ( a.get ( 0 ) > 15 ) result = 15 ; else { for ( int i = 1 ; i < n ; i ++ ) { if ( a.get ( i ) - a.get ( i - 1 ) > 15 ) { pos = i - 1 ; flag = 1 ; break ; } } if ( flag == 1 ) result = a.get ( pos ) + 15 ; else result = a.get ( n - 1 ) + 15 ; } if ( result > 90 ) result = 90 ; System.out.println ( result ) ; } }