import java.util.* ; public class codeforces_282_B { public static void main ( String arg [ ] ) { Scanner sc = new Scanner ( System.in ) ; int n = sc.nextInt ( ) ; char ch [ ] = new char [ n ] ; int s1 = 0 , s2 = 0 ; int i , j = 0 , flag = 0 , dif = 0 ; for ( i = 0 ; i < n ; i ++ ) { int x = sc.nextInt ( ) ; int y = sc.nextInt ( ) ; int temp1 = s1 + x ; int temp2 = s2 + y ; if ( Math.abs ( temp1 - s2 ) <= 500 ) { s1 += x ; ch [ j ++ ] = 'A' ; continue ; } if ( Math.abs ( temp2 - s1 ) <= 500 ) { s2 += y ; ch [ j ++ ] = 'G' ; continue ; } flag = 1 ; break ; } if ( flag == 1 ) System.out.println ( - 1 ) ; else { String ans = "" ; ans = ans.valueOf ( ch ) ; System.out.println ( ans ) ; } } }