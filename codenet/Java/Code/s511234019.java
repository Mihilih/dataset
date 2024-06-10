/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in =new Scanner(System.in);
		int a,b;
		a=in.nextInt();
		b=in.nextInt();
		if(a%2==0 || b%2==0 )
			System.out.println("No");
		else
			System.out.println("Yes");
	}
}