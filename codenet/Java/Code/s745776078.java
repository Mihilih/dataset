import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		PrintWriter out=new PrintWriter(System.out);
		int n=in.nextInt(),m=in.nextInt(),A[][]=new int[n][m],b[]=new int[m];
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++)A[i][j]=in.nextInt();
		}
		
		for(int i=0;i<m;i++)b[i]=in.nextInt();
		
		for(int i=0;i<n;i++) {
			int c=0;
			for(int j=0;j<m;j++) {
				c+=A[i][j]*b[j];
			}
			out.println(c);
		}
		
		out.flush();
	}

}

