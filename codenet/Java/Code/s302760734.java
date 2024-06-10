import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char[] s = scanner.next().toCharArray(),t = scanner.next().toCharArray();
		boolean check = false;
		for(int i=s.length-t.length;i>=0;i--){
			boolean check2 = true;
			for(int j=0;j<t.length;j++){
				if(s[i+j] != '?' && s[i+j] != t[j]){
					check2 = false;
				}
			}
			if(check2){
				check = true;
				for(int j=0;j<t.length;j++){
					s[i+j] = t[j];
				}
			}
			if(check){
				break;
			}
		}
		if(check){
			for(int i=0;i<s.length;i++){
				if(s[i] == '?'){
					System.out.print("a");
				}else{
					System.out.print(s[i]);
				}
			}
			System.out.println();
		}else{
			System.out.println("UNRESTORABLE");
		}
	}

}
