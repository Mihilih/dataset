import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    while(sc.hasNext()) {
      String str = sc.next();
      String[] strArr = str.split(",");
      int[] l = new int[10];
      int d = 0;
      for (int i = 0; i < 10; i++) {
        l[i] = Integer.parseInt(strArr[i]);
        d += l[i];
      }
      int[] v = {Integer.parseInt(strArr[10]),Integer.parseInt(strArr[11])};
      double t = (double)d/(v[0] + v[1]);
      d = 0;
      for(int i = 0; i < 11; i++) {
        if(v[0]*t <= d) {
          System.out.println(i);
          break;
        }
        else {
          d += l[i];
        }
      }
    }
  }
}