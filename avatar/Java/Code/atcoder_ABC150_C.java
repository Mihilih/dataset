import java.util.ArrayList ; import java.util.Arrays ; import java.util.List ; import java.util.Scanner ; public class atcoder_ABC150_C { public static List < String > permutation ( List < String > list , String target , String ans ) { if ( target.length ( ) <= 1 ) { list.add ( ans + target ) ; } else { for ( int i = 0 ; i < target.length ( ) ; i ++ ) { permutation ( list , target.substring ( 0 , i ) + target.substring ( i + 1 ) , ans + target.charAt ( i ) ) ; } } return list ; } public static void main ( String [ ] args ) { Scanner scanner = new Scanner ( System.in ) ; Integer n = Integer.parseInt ( scanner.next ( ) ) ; String [ ] [ ] line = new String [ 2 ] [ 1 ] ; for ( int i = 0 ; i < 2 ; i ++ ) { Arrays.fill ( line [ i ] , "" ) ; for ( int j = 0 ; j < n ; j ++ ) { line [ i ] [ 0 ] += scanner.next ( ) ; } } String number = "" ; for ( int i = 1 ; i <= n ; i ++ ) { number += i ; } List < String > listA = new ArrayList < > ( ) ; permutation ( listA , number , "" ) ; int sum = 0 ; for ( int j = 0 ; j < line.length ; j ++ ) { for ( int i = 0 ; i < listA.size ( ) ; i ++ ) { if ( listA.get ( i ).equals ( line [ j ] [ 0 ] ) ) { if ( sum == 0 ) { sum += i ; } else { sum -= i ; } } } } System.out.println ( Math.abs ( sum ) ) ; } }
