import java.util.*;

//update 2019/12/13

public class Main{

  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {

    long n = nextLong();
    long a = nextLong();
    long b = nextLong();

    long sa = Math.abs(a-b);

    long ans = 0;

    if(sa%2==0){
      ans = sa/2;
    }
    else{
      long AAA = Math.min((n-a),(a-1));
      long BBB = Math.min((n-b),(b-1));

      ans = Math.min(AAA,BBB); //片方が端っこに来るまで。

      //差を1減らす⇒差が偶数になる
      sa -= 1;
      ans += 1;

      //差は偶数
      ans += sa/2;

    }

    System.out.println(ans);

    //System.out.println(1/2);



  }

  static String next(){
    return sc.next();
  }

  static int nextInt(){
    return Integer.parseInt(sc.next());
  }

  static long nextLong(){
    return Long.parseLong(sc.next());
  }

  static double nextDouble(){
    return Double.parseDouble(sc.next());
  }

  static String[] splitString(String s){
    return s.split("");
  }

  static char[] splitChar(String s){
    return s.toCharArray();
  }

  static int charToInt(char aaa){
    return aaa - 48;
  }

  public static int maxInt(int[] a,int lng){
    int max=a[0];
    for(int i=1;i<lng;i++){
      max = Math.max(max,a[i]);
    }
    return max;
  }

  public static int minInt(int[] a,int lng){
    int min=a[0];
    for(int i=1;i<lng;i++){
      min = Math.min(min,a[i]);
    }
    return min;
  }

  public static long maxLong(long[] a,int lng){
    long max=a[0];
    for(int i=1;i<lng;i++){
      max = Math.max(max,a[i]);
    }
    return max;
  }

  public static long minLong(long[] a,int lng){
    long min=a[0];
    for(int i=1;i<lng;i++){
      min = Math.min(min,a[i]);
    }
    return min;
  }

}
