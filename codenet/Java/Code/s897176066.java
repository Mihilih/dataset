import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    int N =sc.nextInt();
    long A[] =new long[N];
    for(int i=0;i<N;i++){
      A[i]=sc.nextLong();}
    Arrays.sort(A);
    for(int j=1;j<N;j++){
      if(A[j]==A[j-1]){System.out.println("NO");System.exit(0);}}
    System.out.println("YES");
  }
}