import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main (String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] a = new int[n];
		String[] elements = br.readLine().split(" ");
		
		for (int i = 0; i < n; i++){
			a[i] = Integer.parseInt(elements[i]);
		}
		
		int swapCount = 0; 
		
		for(int i = 0; i < a.length; i++){
			int mini = i;
			
			for(int j = i; j < a.length; j++){
				if(a[j] < a[mini]){
					mini = j;
				}
			}
			
			if (mini != i){
				int v = a[mini];
				a[mini] = a[i];
				a[i] = v;
				
				swapCount++;
			}
		}
		
		String ans = String.valueOf(a[0]);
		for (int i = 1; i < a.length; i++){
			ans += " " + a[i];
		}
		
		System.out.println(ans);
		System.out.println(swapCount);
	}
}