import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int count = Integer.parseInt(sc.next());
		int[] givingNumbers = new int[count];
		
		// Read Numbers
		for(int i = 0; i< count;i++){
			
			givingNumbers[i] = Integer.parseInt(sc.next());
			
		}
		
		// Reversing Numbers
		for(int i = count-1; 0 <= i;i--){
			
			System.out.print(givingNumbers[i]);
			
			if(i > 0){
				System.out.print(" ");
			}
			
			
		}
		
		System.out.println();
		
		sc.close();
	}

}
