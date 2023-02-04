package _1;

import java.util.Scanner;

/**
 * @author cong
 * @create 2022-01-12 21:15
 */
public class P5708 {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        float a=reader.nextFloat();
        float b=reader.nextFloat();
        float c=reader.nextFloat();
        float p=(a+b+c)/2;
        double S= Math.sqrt(p*(p-a)*(p-b)*(p-c));
        System.out.printf("%.1f\n",S);
    }
}
