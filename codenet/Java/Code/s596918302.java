import java.util.*;
public class Main{
    public static void main(String args[]) {
    
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[][] arr = new int[n][3];
    
    for(int i =0 ; i<n; i++)
    {
        for(int j =0; j<3; j++)
        arr[i][j]=sc.nextInt();
    }
    
    int ans = 0;
    //ans = Math.max(dpc(arr, 0, n, 0), Math.max(dpc(arr,1,n,0), dpc(arr,2,n, 0)));
  ans = dpx(arr,n);
      System.out.println(ans);
      
      
    }
    
    static int min(int[] arr, int n)
    { 
        if(n==1) return 0;
        if(n==2) return Math.abs(arr[n-1]-arr[n-2]);
            int op1 = Math.abs(arr[n-1]-arr[n-2]) +min(arr,n-1);
            int op2 = Math.abs(arr[n-1]-arr[n-3]) +min(arr,n-2);
          int res = Math.min(op1, op2);
          
          return res;
    }
    
    static int dpc(int[][] arr, int i, int n, int row)
    {
        if(row==n)
            return 0;
            int j=0;
            int k=0;
            if(i==1)
                {
                    j=0;
                    k=2;
                }
                
            else  if(i==0)
                {
                    j=1;
                    k=2;
                }    
                
            else
            {
                j =0;
                k=1;
            }
            
            return arr[row][i]+Math.max(dpc(arr,j,n,row+1),dpc(arr,k,n,row+1));
        
    }
    
    static int dpx(int[][] arr, int n)
    {
        int[][] dp = new int[n][3];
        
        dp[0][0]=arr[0][0];
        dp[0][1]=arr[0][1];
        dp[0][2]=arr[0][2];
        
        for(int i=1; i<n; i++)
        {
            for(int in=0; in<3;in++)
            {  int j=0,k=0;
                 if(in==1)
                {
                    j=0;
                    k=2;
                }
                
            else  if(in==0)
                {
                    j=1;
                    k=2;
                }    
                
            else
            {
                j =0;
                k=1;
            }
                dp[i][in] = Math.max(dp[i-1][k] ,dp[i-1][j]) +arr[i][in];
            }
        }
        

        return Math.max(dp[n-1][0], Math.max(dp[n-1][1], dp[n-1][2]));
       
    }
   
    
}