import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);

      for(int i = 0; i < 5; i++){
          if(sc.nextInt() == 0){
              System.out.println(i+1);
              break;
          }
      }
    }
}