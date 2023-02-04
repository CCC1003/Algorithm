package _3;

import java.util.Scanner;

/**
 * @author cong
 * @create 2022-01-19 21:56
 */
public class P1720 {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        int n=reader.nextInt();
        double f=((Math.pow(((1+Math.sqrt(5))/2),n) )-(Math.pow(((1-Math.sqrt(5))/2),n) ))/(Math.sqrt(5));
        System.out.printf("%.2f",f);
    }
}
