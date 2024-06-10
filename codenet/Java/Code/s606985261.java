import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
        int total = 0;
        
		for (int i = 0; i < s.length(); i++) {
			for ( int j = i + 1; j < s.length(); j++) {
				if (s.charAt(i) == s.charAt(j)) {
					total++;
				}
			}
		}
		
		System.out.println(total == 2 ? "Yes" : "No");
	}
}