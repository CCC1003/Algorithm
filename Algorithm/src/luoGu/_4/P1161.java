package _4;

import java.util.Scanner;

/**
 * @author cong
 * @create 2022-01-24 10:21
 */
public class P1161 {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        int n=reader.nextInt();
        boolean[] p=new boolean[2000000];
        for (int i=1;i<=n;i++){
           double  a=reader.nextDouble();
           int t=reader.nextInt();
           for (double j = 1;j<=t;j++){
               p[(int) (a*j)]=!p[(int)(a*j)];
           }
        }
        for (int i=0;i<p.length;i++){
            if (p[i]){
                System.out.println(i);
            }
        }
    }
}
