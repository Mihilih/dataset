import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int[] map = new int[N * 2];
		for (int i = 0; i < N * 2; i++) {
			map[i] = sc.nextInt();
		}
		
		Arrays.sort(map);
		
		int max = 0;
		for (int i = 0; i < N * 2; i+=2) {
			max += Math.min(map[i], map[i + 1]);
		}
		
		System.out.println(max);
		
	}
}