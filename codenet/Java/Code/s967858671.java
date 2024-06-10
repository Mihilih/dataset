import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		int[] Num;
		Num = new int[11];
		Scanner n=new Scanner(System.in);
			for (int i = 0; i < 10;i++){
				Num[i]=n.nextInt();
		}
		
			for (int a = 9; a >= 0; a--){
				for (int b = 0; b < a; b++){
						if (Num[b] < Num[b+1]){
						Num[10]=Num[b];
						Num[b]=Num[b+1];
						Num[b+1]=Num[10];
						}
				}
				}
		
		System.out.println(Num[0]);
		System.out.println(Num[1]);
		System.out.println(Num[2]);
	}	
}