import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        List<Integer> numbers = new ArrayList();

        for (int i = 0; i < N; i++) {
            numbers.add(Integer.parseInt(scanner.next()));
        }

        int count = 0;

        do {
            numbers = numbers.stream()
                    .filter(i -> (i % 2) == 0)
                    .map(i -> i / 2)
                    .collect(Collectors.toList());
            if (numbers.size() == N) count++;
        } while(numbers.size() == N);

        System.out.println(count);
    }
}