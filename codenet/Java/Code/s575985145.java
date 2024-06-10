import java.util.Scanner;

public class Main{
	
	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		int[][] graph = new int[size][size];
		
		int id = 0;
		int cols = 0;
		int[] row = new int[0];
		for(int i = 0; i < size; i++) {
			id = scan.nextInt();
			cols = scan.nextInt();
			row = new int[size];
			for(int j = 0; j < cols; j++)
				row[scan.nextInt() - 1] = 1;
			graph[id - 1] = row;
		}
		
		for(int i = 0; i < graph.length; i++) {
			for(int j = 0; j < graph[i].length; j++){
				System.out.print(graph[i][j]);
				if(j < graph[i].length - 1)
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}

