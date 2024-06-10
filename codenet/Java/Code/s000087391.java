import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        Scanner insert = new Scanner(System.in);
        int n = -1;
        while(true) {
            String line = insert.nextLine();
            n = Integer.parseInt(line);
            if(n==0 ){
                break;
            }
            for(int i = 0; i < n;i++) {

            }
            line = insert.nextLine();
            String array2[] = line.split(" ");
            int[] input = new int[n];
            int sum = 0;
            for(int i =0; i < n; i++) {
                input[i] = (Integer.parseInt(array2[i]));
                sum+=input[i];
            }
            double avg = (double)sum/(double)n;
            int num = 0;
            for(int i =0; i < n; i++) {
                if(input[i] <= avg) {
                    num++;
                }
            }
            result.add(num);

        }
        for(int i = 0;i < (result.size());i++) {
            if(result.get(i) == -1) {
                System.out.println("NONE");
            }
            else {
                System.out.println(result.get(i));
            }
        }
    }
}

