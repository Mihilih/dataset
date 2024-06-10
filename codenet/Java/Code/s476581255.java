import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int[n];
    for(int i = 0; i<n; i++) {
      a[i] =sc.nextInt();
    }
    int count = bubbleSort(a, n);
    for(int i = 0; i<n; i++) {
      if(i<n-1){
        System.out.print(a[i] + " ");
      }else {
        System.out.println(a[i]);
      }
    }
    System.out.println(count);
  }

  public static int bubbleSort(int[] a,int n) {
    boolean flag = true;
    int count = 0;
    while(flag == true) {
      flag = false;
      for(int j = n-1;j>0; j--) {
        if(a[j]<a[j-1]) {
          int free = a[j];
          a[j] = a[j-1];
          a[j-1] = free;
          count++;
          flag = true;
        }
      }
    }
    return count;
  }
}