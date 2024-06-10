import java.lang.Math.*;
import java.util.Scanner;
import java.util.Arrays;

class Main{
    public static void main(String[] args){
	final Scanner sc = new Scanner(System.in);
	int n=sc.nextInt();
	int[] a=new int[3]; 
	for(int i=0;i<n;i++){
	    a[0]=sc.nextInt();
	    a[1]=sc.nextInt();
	    a[2]=sc.nextInt();
	    Arrays.sort(a);	    
	    if(Math.pow(a[2],2)==Math.pow(a[0],2)+Math.pow(a[1],2)) System.out.println("YES");
	    else System.out.println("NO");
	}
    }
}