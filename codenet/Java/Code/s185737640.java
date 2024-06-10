import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();
		sc.close();

		if(S.length() % 2 == 1){
			S = S.substring(0, S.length() - 1);
		}
		else{
			S = S.substring(0, S.length() - 2);
		}

		for(; S.length() > 0; S = S.substring(0, S.length() - 2)){
			if(isEvenString(S)){
				break;
			}
		}
		System.out.println(S.length());
	}

	//長さが偶数の文字列sが遇文字列かどうかを返す
	static boolean isEvenString(String s){
		String a = s.substring(0, s.length()/2);
		String b = s.substring(s.length()/2);
		if(a.equals(b)){
			return true;
		}
		else{
			return false;
		}
	}

}
