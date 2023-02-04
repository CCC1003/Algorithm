package _3;

import java.util.Scanner;

/**
 * @author cong
 * @create 2022-01-18 20:18
 */
public class P1035 {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        int k=reader.nextInt();
        double sum=0;
        int n=1;
        while(sum<=k){
            sum+=(1.0/n);
            n++;
        }
        System.out.println(n-1);
    }
}
