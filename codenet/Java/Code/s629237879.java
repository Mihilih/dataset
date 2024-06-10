import java.io.*;
import java.util.Arrays;

public class Main{
	public static void main(String[] args) throws IOException{ 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String sc = br.readLine();
		int n = Integer.parseInt(sc);
		String[] str = new String[n];
		for (int i =0;i<n ;i++ ) {
			str[i] = br.readLine();
		}
		String[] mark = {"S","H","C","D"};
		for (String ma : mark) {
			for (int i = 1; i<=13 ;i++ ) {
				String s = Integer.toString(i);
				String st = ma + " " + s;
				if (Arrays.asList(str).contains(st)) {
					continue;
				}else{
					System.out.println(st);
				}
			}
		}
	}

}