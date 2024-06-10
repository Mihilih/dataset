import java.util.*;
import java.math.*;
     
class Main{
    public static void main(String[] args) {
        
        try(Scanner sc = new Scanner(System.in)){

            int n = Integer.parseInt(sc.next());
            int m = Integer.parseInt(sc.next());

            HashMap<Integer, Integer> map = new HashMap<>();

            int countAc = 0;
            int countWaAll = 0;
 
            for(int i = 0 ; i < m; i++){
                int question = Integer.parseInt(sc.next());
                String waOrAc = sc.next();

                if(!map.containsKey(question)){
                    if(waOrAc.equals("WA")) map.put(question, 1);
                    else{
                        map.put(question, -1);
                        countAc++;
                    } 
                }else{
                    int countWa = map.get(question);
                    if(countWa < 0);
                    else{
                        if(waOrAc.equals("WA")) map.replace(question, countWa, countWa + 1);
                        else{
                            map.replace(question, countWa, -countWa);
                            countAc++;
                            countWaAll += countWa;
                        }
                    }
                }
            }

            System.out.println(countAc + " " + countWaAll);

        }catch(Exception e){
            e.printStackTrace();
        }        
    }
}