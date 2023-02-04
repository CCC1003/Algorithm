package _1;

import java.util.Scanner;

/**
 * @author cong
 * @create 2022-01-12 21:23
 */
public class P1421 {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        int a=reader.nextInt();
        int b=reader.nextInt();
        int c=a*10+b;
        int d=(c/19);
        System.out.println(d);
    }
}
