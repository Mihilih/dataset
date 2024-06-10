import java.util.*;

class Main{
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int b = sc.nextInt();
	int c = sc.nextInt();
	String answer = "No";
	if(a + b >= c) {
		answer = "Yes";
	}
	System.out.println(answer);
}
}
