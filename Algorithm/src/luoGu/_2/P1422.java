package _2;

import java.util.Scanner;

/**
 * @author cong
 * @create 2022-01-17 19:05
 */
public class P1422 {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        int n=reader.nextInt();
        double d=0;
        if(n<=150){
            d=n*0.4463;
        }else if(n>150&&n<=400){
            d=150*0.4463+(n-150)*0.4663;
        }else if(n>=401){
            d=150*0.4463+250*0.4663+(n-400)*0.5663;
        }
        System.out.printf("%.1f\n",d);
    }
}
