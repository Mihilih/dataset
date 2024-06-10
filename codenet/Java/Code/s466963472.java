/**
 * 
 * AOJ No. 0014 Integral
 * 
 * @author 		yuichirw <y.iky917@gmail.com>
 * @accepted	2010-11-09
 * @see			http://rose.u-aizu.ac.jp/onlinejudge/ProblemSet/description.jsp?id=0014&lang=jp
 */

import java.util.*;
public class Main {
	
	static Scanner sc = new Scanner(System.in);
	static int d;
	
	static boolean read() {
		if(!sc.hasNextInt()) return false;
		d = sc.nextInt();
		return true;
	}
	
	static int solve() {
		int ans,n;
		/*
		ans = 0; n = 600 / d;
		for(int x = d; x < 600; x += d) {
			ans += d * ((x * x));
		}
		return ans;
		*/
		ans = 0;
		for(int i = 1; i * d < 600; i++) {
			int x = i * d;
			int y = x * x;
			ans += y * d;
		}
		return ans;
	}
	
	
	public static void main(String[] args) {
		while(read()) {
			System.out.println(solve());
		}
	}

}