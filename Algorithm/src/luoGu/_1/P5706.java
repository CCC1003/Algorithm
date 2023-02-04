package _1;

import java.util.Scanner;

/**
 * @author cong
 * @create 2022-01-12 19:20
 */
public class P5706 {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        float t=reader.nextFloat();
        int n=reader.nextInt();
        System.out.printf("%.3f\n",t/n);
        System.out.println(2*n);
    }
}
