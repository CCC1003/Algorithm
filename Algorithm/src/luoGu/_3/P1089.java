package _3;

import java.util.Scanner;

/**
 * @author cong
 * @create 2022-01-20 11:16
 */
public class P1089 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int sum=0;
        int cun=0;
        for (int i=1;i<=12;i++){
            int ys=reader.nextInt();
            int yl=sum+300;
            if(yl<ys){
                System.out.println(-i);
                System.exit(0);
            }
            if (yl-ys>100){
                sum=(yl-ys)%100;
                cun=cun+(yl-ys)/100*100;
            }
            else {
                sum=yl-ys;
            }
        }
        System.out.println((int) (sum+cun*1.2));
    }
}
