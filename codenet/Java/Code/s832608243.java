import java.util.Scanner;

public class Main {
    public static void main(final String[] args) {
    	Scanner scanner = new Scanner(System.in);
    	int a = scanner.nextInt(), b = scanner.nextInt();
    	boolean flag = false;
    	for(int i=1;i<=100000;i++) {
    		if (Math.floor(1.* i *.08) == a && b == Math.floor(.1 * i)) {
    			System.out.println(i);
    			flag = true;
    			break;
    		}
    	}
    	if (!flag) {
    		System.out.println(-1);
    	}
    	}
    }
