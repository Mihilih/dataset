import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = Integer.parseInt(sc.next()); 
		int b = Integer.parseInt(sc.next()); 
		int c = Integer.parseInt(sc.next()); 
		int count = 0;
		for (int i = a ; i <= b ;i++  ) {
			if (c % i ==0) {
				count++;
			}
		}
		System.out.println(count);
	}
}