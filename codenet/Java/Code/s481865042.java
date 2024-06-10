import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		long k = sc.nextLong();
		StringBuffer sb=new StringBuffer();
		for(int i = 0; i<s.length(); i++){
			if((26-(s.charAt(i)-'a'))<=k && s.charAt(i)!='a'){
				k-=26-(s.charAt(i)-'a');
				sb.append('a');
			}else{
				sb.append(s.charAt(i));
			}
		}
		if(k>0){
			char t=sb.charAt(s.length()-1);
			sb.delete(s.length()-1,s.length());
			sb.append((char)('a'+(t-'a'+k)%26));
		}
		System.out.println(sb);
	}
}
