import java.io.BufferedReader ; import java.io.IOException ; import java.io.InputStreamReader ; import java.io.PrintWriter ; import java.util.* ; public class atcoder_AGC046_A { public static void main ( String [ ] args ) throws IOException { FastReader sc = new FastReader ( ) ; PrintWriter pw = new PrintWriter ( System.out ) ; int x = sc.nextInt ( ) ; int count = 0 ; int tmp = x ; x = 0 ; while ( x != 360 ) { x = x + tmp ; if ( x > 360 ) { x = x - 360 ; } count ++ ; } System.out.println ( count ) ; } } class FastReader { BufferedReader br ; StringTokenizer st ; public FastReader ( ) { br = new BufferedReader ( new InputStreamReader ( System.in ) ) ; } String next ( ) { while ( st == null || ! st.hasMoreElements ( ) ) { try { st = new StringTokenizer ( br.readLine ( ) ) ; } catch ( IOException e ) { e.printStackTrace ( ) ; } } return st.nextToken ( ) ; } int nextInt ( ) { return Integer.parseInt ( next ( ) ) ; } long nextLong ( ) { return Long.parseLong ( next ( ) ) ; } double nextDouble ( ) { return Double.parseDouble ( next ( ) ) ; } String nextLine ( ) { String str = "" ; try { str = br.readLine ( ) ; } catch ( IOException e ) { e.printStackTrace ( ) ; } return str ; } }