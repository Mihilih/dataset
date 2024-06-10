import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		scan.close();
		if(a < b && b < c && a < c) {
			System.out.println("Yes");
			
		}else {
			System.out.println("No");
		}
		
		// TODO 自動生成されたメソッド・スタブ

	}

}

