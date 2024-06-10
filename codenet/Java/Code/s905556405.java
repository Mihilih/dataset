import java.util.*;

public class Main { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
      	int[] numlist  = new int[5];
      	int k;
      
      	for(int i=0;i<5;i++){
        	numlist[i] = sc.nextInt(); 
        }
      	k = sc.nextInt();
      	if((numlist[4] - numlist[0])>k){
        	System.out.println(":("); 
        }else{
         	System.out.println("Yay!") ;
        }
      	
    }
}