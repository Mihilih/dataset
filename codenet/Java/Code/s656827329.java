import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int[n];
    for(int i = 0;i<n;i++){
      a[i] = sc.nextInt();
    }
    int count = 1;
    int now = 0;
    int bef = 0;
    for(int i = 1;i<n;i++){
      if(a[i-1]<a[i]){
        now = 1;
      }else if(a[i-1]>a[i]){
        now = -1;
      }else{
        continue;
      }
      if(bef == 0){
        bef = now;
      }
      if(bef != now){
        count++;
        bef = 0;
      }
    }
    System.out.println(count);
  }
}
