import java.util.Scanner ; public class atcoder_ABC124_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int a = Integer.parseInt ( sc.next ( ) ) ; int b = Integer.parseInt ( sc.next ( ) ) ; ; int sum = 0 ; for ( int i = 0 ; i < 2 ; i ++ ) { if ( a >= b ) { sum += a ; a = a - 1 ; } else { sum += b ; b = b - 1 ; } } System.out.println ( sum ) ; } }
