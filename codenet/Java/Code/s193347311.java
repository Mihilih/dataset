import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int intLoop = scan.nextInt();
		String strTaro = "";
		String strHana = "";
		int intTaro = 0;
		int intHana = 0;

		for(int i = 0; i < intLoop; i++){
			strTaro = scan.next();
			strHana = scan.next();
			int intJudge = strTaro.compareTo(strHana);
			if(intJudge < 0){
				intHana += 3;
			}else if(intJudge == 0){
				intTaro++;
				intHana++;
			}else if(0 < intJudge){
				intTaro += 3;
			}
		}
		System.out.println(intTaro + " " + intHana);
		scan.close();
	}
}