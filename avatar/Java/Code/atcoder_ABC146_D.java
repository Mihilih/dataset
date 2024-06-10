import java.util.ArrayList ; import java.util.List ; import java.util.Scanner ; public class atcoder_ABC146_D { static int n ; static List < ArrayList < Edge >> g ; static int [ ] ans ; public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int n = Integer.parseInt ( sc.next ( ) ) ; g = new ArrayList ( ) ; for ( int i = 0 ; i < n ; i ++ ) { g.add ( new ArrayList < Edge > ( ) ) ; } for ( int i = 0 ; i < n - 1 ; i ++ ) { int a = Integer.parseInt ( sc.next ( ) ) - 1 ; int b = Integer.parseInt ( sc.next ( ) ) - 1 ; g.get ( a ).add ( new Edge ( i , b ) ) ; g.get ( b ).add ( new Edge ( i , a ) ) ; } ans = new int [ n - 1 ] ; dfs ( 0 , - 1 , - 1 ) ; int max = 0 ; for ( int temp : ans ) { max = Math.max ( max , temp ) ; } System.out.println ( max ) ; for ( int c : ans ) { System.out.println ( c ) ; } } static void dfs ( int to , int color , int parents ) { int k = 1 ; for ( Edge e : g.get ( to ) ) { if ( e.to == parents ) continue ; if ( k == color ) k ++ ; ans [ e.id ] = k ; dfs ( e.to , k , to ) ; k ++ ; } } } class Edge { Edge ( int id , int to ) { this.id = id ; this.to = to ; } int id ; int to ; }