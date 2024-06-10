import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

class Main {
  private static BufferedReader buf;
  public static void main(String[] args) throws IOException {
    int[] abc = new int[3];
    String str;
    String[] inp;
    buf = new BufferedReader(new InputStreamReader(System.in));
    str = buf.readLine();
    inp = str.split(" ", -1);
    for (int i = 0; i < inp.length; i++) abc[i] = Integer.parseInt(inp[i]);
    if (abc[0] < abc[1] && abc[1] < abc[2]) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}