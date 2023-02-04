package _3;

import java.util.Scanner;
/**
 * @author cong
 * @create 2022-01-17 20:59
 */
public class P5720 {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        double n=reader.nextInt();
        int i=0;
        while (n!=1){
           n=Math.floor(n/2);
           i++;
        }
        System.out.println(i+1);
    }
}
