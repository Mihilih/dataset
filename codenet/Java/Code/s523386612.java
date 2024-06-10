import java.util.*;
import java.lang.*;
class Main {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		int[] count=new int[t+1];
		for (int i=2;i<t+1;i++) {
			count[sc.nextInt()]++;
		}
		for (int i=1;i<t+1 ;i++ ) {
			System.out.println(count[i]);
		}
	}
}