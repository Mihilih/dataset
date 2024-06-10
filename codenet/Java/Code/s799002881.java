import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class Main {
	public static void main (String[] args) throws IOException{
	    InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
	    BufferedReader in = new BufferedReader(reader);
		String[] str = in.readLine().split(" ");
		int n = Integer.parseInt(str[0]);
		double d = Integer.parseInt(str[1]);
		int cnt = 0;

		for(int i=0; i < n; i++) {
			str = in.readLine().split(" ");
			double x = Integer.parseInt(str[0]);
			double y = Integer.parseInt(str[1]);
			if(Math.sqrt(x*x+y*y)<=d) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}