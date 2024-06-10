import java.util.Scanner;
class Main {
	static final int MAX = 200000;
	public static void main(String[] args) {
		int[] R = new int[MAX];
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for(int i = 0;i<n;i++) R[i] = in.nextInt();		
		int maxv = R[1]-R[0];
		int minv = R[0];
		for(int i = 1;i<n;i++){
			maxv = Math.max(maxv, R[i]-minv);	
			minv = Math.min(minv, R[i]);
		}
		System.out.println(maxv);
	}
}