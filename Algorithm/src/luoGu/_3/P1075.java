package _3;

import java.util.Scanner;

/**
 * @author cong
 * @create 2022-01-20 9:58
 */
public class P1075 {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        int n=reader.nextInt();
        int t1=0,t2=0,max=0;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                t1=i;
                t2=n/i;
                max=t1>t2?t1:t2;
            }
        }
        System.out.println(max);
    }
}
