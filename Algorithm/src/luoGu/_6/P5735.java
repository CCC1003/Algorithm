package _6;

import sun.security.util.AuthResources_it;

import java.util.Scanner;

/**
 * @author cong
 * @create 2022-01-20 19:32
 */
public class P5735 {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        double x1=reader.nextDouble();
        double y1=reader.nextDouble();
        double x2=reader.nextDouble();
        double y2=reader.nextDouble();
        double x3=reader.nextDouble();
        double y3=reader.nextDouble();
        double C=dis(x1,y1,x2,y2)+dis(x1,y1,x3,y3)+dis(x2,y2,x3,y3);
        System.out.printf("%.2f",C);
    }
    public static double dis(double x1,double y1,double x2,double y2){
        return Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
    }
}
