import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	static String[] nums = sc.nextLine().split(" ");

	static int N = Integer.parseInt(nums[0]);
	static int M = Integer.parseInt(nums[1]);
	static char[][] room = new char[N][M];
	static int D = Integer.parseInt(nums[2]);
	static int num = 0;
	public static void main(String[] args) {
		inputRoom();

			if ( M >= D) {
				setWE();
			}

			if ( N >= D) {
				setNS();
			}

		System.out.println(num);
		sc.close();

	}
	private static void setWE() {
		boolean canPut = true;

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M - D + 1; j++) {
				canPut = true;

				for(int k = 0; k < D; k++){
					if (Main.room[i][j + k] == '#') {
						canPut = false;
						break;
					}
				}

				if (canPut == true) {
					num++;
				}

			}
		}


	}

	private static void setNS() {
		boolean canPut = true;

		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N - D + 1; j++) {
				canPut = true;

				for(int k = 0; k < D; k++){
					if (Main.room[j + k][i] == '#') {
						canPut = false;
						break;
					}
				}

				if (canPut == true) {
					num++;
				}

			}
		}


	}


	private static void inputRoom() {
		String str_room = "";

			for (int i = 0; i < N; i++) {
					str_room = sc.nextLine();
					Main.room[i] = str_room.toCharArray();
			}

	}

}

