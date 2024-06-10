import java.util.*;
public class Main {

	/*
	 * 122C
	 * 
	 * This problem requires prefix sum array
	 * Let's define a boolean array k[i] 
	 * k[i] = true when s[i] == 'A' and s[i+1] == 'C'
	 * Make a prefix sum array of k and then query with it
	 * 
	 * COMMON MISTAKE MAKE SURE YOU DO R-1 BECAUSE S[R+1] GOES OVER THE RANGE
	 * COMMON MISTAKE THIS IS ONE-INDEXED STRING
	 * 
	 * Time Complexity O(N), Memory Complexity O(N)
	 * 
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(), Q = sc.nextInt();
		String s = sc.next();
		int pre[] = new int[N+1];
		for(int i = 1; i<N; i++) {
			if(s.charAt(i-1) == 'A' && s.charAt(i) =='C') {
				pre[i] = 1; //initially the prefix sum array is the k array
			}
		}
		//Building the psa
		for(int i = 1; i<N; i++) {
			pre[i] += pre[i-1];
		}
		//Querying
		while(Q-- > 0) {
			int l = sc.nextInt(), r = sc.nextInt();
			r--;
			System.out.println(pre[r] - pre[l-1]);
		}
	}
}
