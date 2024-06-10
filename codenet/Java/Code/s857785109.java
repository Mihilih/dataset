import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int  n = sc.nextInt();
    if((n/10)%111==0){
      System.out.println("Yes");
    }else if((n%1000)%111==0){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
      
  }
  

  
}
