package _2;

import java.util.Scanner;

/**
 * @author cong
 * @create 2022-01-15 19:38
 */
public class P1909 {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        int n=reader.nextInt();
        int m1=reader.nextInt();
        int k1=reader.nextInt();
        int m2=reader.nextInt();
        int k2=reader.nextInt();
        int m3=reader.nextInt();
        int k3=reader.nextInt();
        int y1,y2,y3;
        if(n%m1==0){
            y1=n/m1*k1;
        }else{
            y1=((n/m1)+1)*k1;
        }
        if(n%m2==0){
            y2=n/m2*k2;
        }else{
            y2=((n/m2)+1)*k2;
        }
        if(n%m3==0){
            y3=n/m3*k3;
        }else{
            y3=((n/m3)+1)*k3;
        }
        int min=y1<y2?y1:y2;
        min=min<y3?min:y3;
        System.out.println(min);
    }
}
