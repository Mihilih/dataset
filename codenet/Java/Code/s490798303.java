import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();

        Map<Integer, List<Integer>> map = new HashMap<>();

        for (int i = 0; i < k; i++) {
            int d = scanner.nextInt();
            for (int j = 0; j < d; j++) {
                int person = scanner.nextInt();

                if (!map.containsKey(person)) {
                    map.put(person, new ArrayList<>());
                }
                map.get(person).add(d);
            }
        }

        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (!map.containsKey(i)) {
                count++;
            }
        }

        System.out.println(count);

    }
}