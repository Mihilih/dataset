import java.util.Scanner ; import java.io.BufferedReader ; import java.io.IOException ; import java.io.InputStreamReader ; import java.io.PrintWriter ; import java.nio.charset.MalformedInputException ; import java.util.StringTokenizer ; import java.util.Arrays ; import java.util.HashSet ; public class codeforces_608_A { public static void main ( String [ ] args ) { FastScanner in = new FastScanner ( ) ; Scanner sc = new Scanner ( System.in ) ; PrintWriter o = new PrintWriter ( System.out ) ; int n = sc.nextInt ( ) ; int s = sc.nextInt ( ) ; int max = 0 ; while ( n -- > 0 ) { int f = sc.nextInt ( ) ; int t = sc.nextInt ( ) ; if ( max < f + t ) { max = f + t ; } } o.println ( Math.max ( max , s ) ) ; o.close ( ) ; } static class FastScanner { BufferedReader br = new BufferedReader ( new InputStreamReader ( System.in ) ) ; StringTokenizer st = new StringTokenizer ( "" ) ; public String next ( ) { while ( ! st.hasMoreElements ( ) ) { try { st = new StringTokenizer ( br.readLine ( ) ) ; } catch ( IOException e ) { e.printStackTrace ( ) ; } } return st.nextToken ( ) ; } public String nextLine ( ) { String str = "" ; try { str = br.readLine ( ) ; } catch ( IOException e ) { e.printStackTrace ( ) ; } return str ; } byte nextByte ( ) { return Byte.parseByte ( next ( ) ) ; } short nextShort ( ) { return Short.parseShort ( next ( ) ) ; } int nextInt ( ) { return Integer.parseInt ( next ( ) ) ; } long nextLong ( ) { return java.lang.Long.parseLong ( next ( ) ) ; } double nextDouble ( ) { return Double.parseDouble ( next ( ) ) ; } } }