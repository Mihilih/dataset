import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int n = scanner.nextInt();
			Set<Integer> set = new HashSet<>();
			IntStream.range(0, n).forEach(i -> set.add(scanner.nextInt()));
			System.out.println(set.size());
		}
	}
}
