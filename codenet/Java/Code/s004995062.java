import java.util.*;
import java.math.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String sa = sc.next();
		String sb = sc.next();
		BigDecimal A = new BigDecimal(sa);
		BigDecimal B = new BigDecimal(sb);
		System.out.println(A.multiply(B).setScale(0, BigDecimal.ROUND_DOWN));
	}
}
