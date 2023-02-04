package _3;

import java.util.Scanner;

/**
 * @author cong
 * @create 2022-01-19 21:42
 */
public class P1423 {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        double x=reader.nextDouble();
        double sum=0,n=2;
        int num=0;
        while(sum<x){
            sum+=n;
            n*=0.98;
            num++;
        }
        System.out.println(num);
    }
}
