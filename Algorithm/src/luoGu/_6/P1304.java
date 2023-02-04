package _6;

import java.time.OffsetDateTime;
import java.util.Scanner;

/**
 * @author cong
 * @create 2022-01-21 20:32
 */
public class P1304 {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        int N=reader.nextInt();
        for (int i=4;i<=N;i+=2){
            for (int j=2;j<i;j++){
                if(checkZ(j)&&checkZ(i-j)){
                    System.out.println(i+"="+j+"+"+(i-j));
                    break;
                }
            }
        }
    }
    public static boolean checkZ(int i){
        boolean re=true;
        for (int j=2;j<=Math.sqrt(i);j++){
            if(i%j==0){
                re=false;
            }
        }
        return re;
    }
}
