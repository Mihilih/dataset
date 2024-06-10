import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    Map<Integer, Integer> map = new HashMap<Integer, Integer>();
    for (int i = 1; i < N + 1; i++)
      map.put(i, sc.nextInt());
    System.out.println(String.join(" ", map.entrySet().stream().sorted(Entry.<Integer, Integer>comparingByValue()).map(Map.Entry::getKey).map(String::valueOf).collect(Collectors.toList())));
  }
}