import java.util.*;
 
public class Main{
    static int mapNum;//Buttle Town図の数
    static int h;//地図の大きさの縦
    static int w;//地図の大きさの横
    static char[][] battleTown;//Buttle Town地図取込用
    static int bomberActNum;//指示された戦車の行動数
    static char [] bomberAct;//指示された戦車の行動
//    static char [] tankDirection={'^','v','<','>'};//戦車の方向
//    static char [] tankAct={'U','D','L','R','S'};//戦車の行動方向と砲弾発射
    static int []tank = new int [2];
    static int xOfTank;
    static int yOfTank;
    static int xOfBomber;
    static int yOfBomber;    
    static int s;//表示用
    static int k;//表示用
    static int a;//x Of Bomber
    static int b;//y Of Bomber
    static int x;//tankの位置x
    static int y;//tankの位置y
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        mapNum = sc.nextInt();

        for(int i = 0;i < mapNum; i++){
            if(1<=i && i< mapNum){
                System.out.println("");
            }
            h = sc.nextInt();
            w = sc.nextInt();

            battleTown = new char[h][w];


            for(int j=0; j<h; j++){
                char[] c = sc.next().toCharArray();
                for(int k=0; k<w; k++){
                    battleTown[j][k] = c[k];
//                    System.out.print(battleTown[j][k]);

                    if('^'==battleTown[j][k]
                    ||'v'==battleTown[j][k]
                    ||'<'==battleTown[j][k]
                    ||'>'==battleTown[j][k]){
                        //x.yがTankの位置ということで。
                        x = j;
                        y = k; 
                        
                    }

                } 

            }
//                  System.out.println("tank x は" + x);
//                  System.out.println("tank y は" + y);
            bomberActNum = sc.nextInt();
            bomberAct = sc.next().toCharArray();

            if(0 <= x && x <= h && 0<= y && y <= w){ 
                for(int l=0; l<bomberActNum; l++){
                
                    if(bomberAct[l] == 'U'){
//検証用
//System.out.print(bomberAct[l] + "です。");                 
                        battleTown[x][y] ='^';
                            if(x-1 >=0 && battleTown[x-1][y]=='.'){
    
//System.out.print( "[" + x + "-1][" + y + "]が平地なので進みます");                                           
                                 battleTown[x-1][y] ='^';
                                 battleTown[x][y] ='.';
                                 x--;
                            }
                    }
                    if(bomberAct[l] == 'D'){
                        
//検証用
//System.out.print(bomberAct[l] + "です。");

                        battleTown[x][y] ='v';
                            if(x+1 <h && battleTown[x+1][y]=='.'){
//System.out.print( "[" + x + "-1][" + y + "]が平地なので進みます");                    
                                battleTown[x+1][y] ='v';
                                battleTown[x][y] ='.';
                                x++;//戦車の位置
                            }
                    }
                    if(bomberAct[l] == 'L'){

//System.out.print(bomberAct[l] + "です。");

                         battleTown[x][y] ='<';
                            if(y-1 >=0 && battleTown[x][y-1]=='.'){
//System.out.print( "[" + x + "][" + y + "-1]が平地なので進みます");                    
                                battleTown[x][y-1] ='<';
                                battleTown[x][y] ='.';
                                y--;
                            }
                    }
                    if(bomberAct[l] == 'R'){
//検証用
//System.out.print(bomberAct[l] + "です。");                             
                        battleTown[x][y] ='>';
                           if(y+1 <w && battleTown[x][y+1]=='.'){
//System.out.print( "[" + x + "][" + y + "+1]が平地なので進みます");                    
                                battleTown[x][y+1] ='>';
                                battleTown[x][y] ='.';
                                y++;
                           }
                    }
                    
                    if(bomberAct[l] == 'S'){
//検証用
//System.out.print(bomberAct[l] + "です。");                                         
                        xOfBomber = x;
                        yOfBomber = y;
                        moveBomber(xOfBomber,yOfBomber);
                    }
                }
                for(s =0; s < h;s++){
                    for(k =0; k <w;k++){
                        System.out.print(battleTown[s][k]);
                    }System.out.println();
                //}if(s != mapNum){
                 //   System.out.println();
                
                }
            }
        }
    }
    
    
    

/*            for(int s =0; s < h;s++){
                for(int k =0; k <w;k++){
                    if(0<i){
                        System.out.println();
                    }else{
                        System.out.println(battleTown[s][k]);*/
 


    public static void moveBomber(int a,int b){
//System.out.println("int a =  " + a +"  int b = " + b);                  
//System.out.println("battleTown[a][b] = " + battleTown[a][b]);                  
/*        
        while(true){
            if(!(0 <= a && a <= h && 0<= b && b <= w)){
                break;
            }else{
*/               
      if(0 <= a && a <= h && 0<= b && b <= w){

            if('^'==battleTown[a][b]){
//System.out.print("戦車は上向き。");                
                 for(int i = a-1;  i >= 0; i--){
                     if(a<=0){
                            return;
                     }else
//                while(0 <= x && x <= h && 0<= y && y <= w){
//            ||0 <= xOfBomber && xOfBomber <= h && 0<= yOfTank && yOfTank <= w){
                  
                    if(battleTown[a-1][b]=='*'){
//System.out.print("レンガ壁です。");                  
                        
                        battleTown[a-1][b]='.';
//System.out.print("レンガ壁を砲撃し平地に。終わります。");                  
                        
                        return;
                    }else if(battleTown[a-1][b]=='#'){
//System.out.print("鉄の壁なので終わります。");                  
                        
                        return;
                    }else{
                
                        a--;
//                        System.out.print("a--したらaは今、" + a +"になった。");
                        if(a==0){
                            return;
                        }
//System.out.print("砲弾が上方向へ進みます。");                          
                    }
           }
        }

        if('v'==battleTown[a][b]){
            for(int i = a+1; i < h; i++){

//System.out.print("戦車は下向き。");                  
                    
                    if(battleTown[a+1][b]=='*'){
                        battleTown[a+1][b]='.';
//System.out.print("レンガ壁を砲撃し平地に。終わります。");                  
                        
                        return;
                    }else if(battleTown[a+1][b]=='#'){
//System.out.print("鉄の壁なので終わります。");                  
                        
                        return;
                    }else{
                        a++;
                        if(a==h){
                            return;
                        }
//System.out.print("砲弾が下方向へ進みます。");                  
                        
                    }
            }
        }
        if('<'==battleTown[a][b]){
            for(int i = b-1; i >= 0; i--){
// System.out.print("戦車は左向き。");                  
                   
                     if(battleTown[a][b-1]=='*'){
                        battleTown[a][b-1]='.';
//System.out.print("レンガ壁を砲撃し平地に。終わります。");                  
                        
                        return;
                     }else if(battleTown[a][b-1]=='#'){
//System.out.print("鉄の壁なので終わります。");                  
                         
                        return;
                    }else{
                        b--;
                        if(b==0){
                            return;
                        }
//System.out.print("砲弾が左方向へ進みます。");                  
                        
                    }
            }
        }
        if('>'==battleTown[a][b]){
            for(int i = b+1; i < w; i++){
//System.out.print("戦車は右向き。");                  
                    
                     if(battleTown[a][b+1]=='*'){
                        battleTown[a][b+1]='.';
//System.out.print("レンガ壁を砲撃し平地に。終わります。");                  
                        
                        return;
                     }else if(battleTown[a][b+1]=='#'){
//System.out.print("鉄の壁なので終わります。");                  
                         
                        return;
                    }else{
                        b++;
                        if(b==w){
                            return;
                        }
//System.out.print("砲弾が右方向へ進みます。");


                        
                    }
            }
        }
        }
    }
    
}


