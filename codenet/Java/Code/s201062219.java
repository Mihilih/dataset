import java.io.IOException;
import java.util.Scanner;
public class Main {
public static void main(String[] args) throws IOException {
Scanner scan=new Scanner(System.in);
String mark;
int c=0;
int b=0;
int a[]=new int[100000];
int x=0;
do{c=scan.nextInt();
mark=scan.next();
b=scan.nextInt();	
	if(mark.equals("?")){
		a[x]=2000001;
		break;
	}
	else if(mark.equals("+")){
		a[x]=c+b;
	}
	else if(mark.equals("-")){
		a[x]=c-b;
	}
	else if(mark.equals("*")){
		a[x]=c*b;
	}
	else if(mark.equals("/")){
		a[x]=c/b;
	}
	x++;
}while(true);
x=0;
do{
	if(a[x]==2000001)break;
	System.out.println(a[x]);
	x++;
}while(true);
scan.close();
	}
}