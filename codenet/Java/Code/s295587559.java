import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
  int[] num = new int[in.nextInt()];
  for (int i = 0; i < num.length; i++) {
	num[i] = i + 1;
  }
  int count = in.nextInt();
  Pattern pt = Pattern.compile("(\\d+),(\\d+)");
  int line[] = new int[2];
  for (int i = 0; i < count; i++) {
	String next = in.next(pt);
	for (int j = 0; j < line.length; j++) {
	  Matcher matcher = pt.matcher(next);
	  matcher.matches();
	  line[j] = Integer.parseInt(matcher.group(j + 1)) - 1;
	}
	int change = num[line[0]];
	num[line[0]] = num[line[1]];
	num[line[1]] = change;
  }
  for (int i = 0; i < num.length; i++) {
	System.out.println(num[i]);
  }
}
}