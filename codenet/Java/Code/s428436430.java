import java.util.*;

class calArea{
    int Area(int w, int h ){
        int area = w * h;
        return area;
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> arr = new ArrayList<>();
        
        for(int i = 0; i < 4;i++){
            arr.add(Integer.parseInt(sc.next()));
        }
        
        calArea ab = new calArea();
        int area1 = ab.Area(arr.get(0),arr.get(1));
        int area2 = ab.Area(arr.get(2),arr.get(3));
        
        if(area1 > area2){
            System.out.println(area1);
        }else if(area1 < area2){
            System.out.println(area2);
        }else if(area1 == area2){
            System.out.println(area1);
        }   
        
    }
    
}