import java.util.LinkedList;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		LinkedList<Integer> list = new LinkedList<Integer>();
		
		while(scan.hasNextInt() == true){
			int a = scan.nextInt();
			if(a == 0) {
				System.out.println(list.pop());
			} else {
				list.push(a);
			}
		}
	}
}