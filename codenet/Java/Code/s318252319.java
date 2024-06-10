import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        //int n = sc.nextInt();
        String s = sc.next();
        int n = Integer.parseInt(s.substring(s.length()-1,s.length()));
        if (n == 3)System.out.println("bon");
        else if (n == 0 ||n == 1 ||n == 6 ||n == 8) System.out.println("pon");
        else System.out.println("hon");
        sc.close();
    }
}