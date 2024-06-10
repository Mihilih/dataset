import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int count1 = 0;
    int count2 = 0;
    for(int i=0;i<N;i++){
      int a = sc.nextInt();
      if(a%4==0){
        count1++;
      }else if(a%2==0 && (a/2)%2==1){
        count2++;
      }
    }
    if(count1>=N/2){
      System.out.println("Yes");
    }else if(((N/2-count1)*2+N%2)==count2){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}