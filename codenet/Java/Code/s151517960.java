import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
    for(int i = 0; i < n; i++) {
      int a = sc.nextInt();
      if(map.containsKey(a)) {
        map.put(a, map.get(a) + 1);
      } else {
        map.put(a, 1);
      }
    }
    int ans = 0;
    for(int key : map.keySet()) {
      if((map.get(key) % 2) == 1) ans++;
    }
    System.out.println(ans);
  }
}