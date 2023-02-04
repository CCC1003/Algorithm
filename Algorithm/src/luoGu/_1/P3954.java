package _1;

import java.util.Scanner;

/**
 * @author cong
 * @create 2022-01-13 22:06
 */
public class P3954 {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        int a=reader.nextInt();
        int b=reader.nextInt();
        int c=reader.nextInt();
        while(a>100&&a<0&&b>100&&b<0&&c>100&&c<0){
            a=reader.nextInt();
            b=reader.nextInt();
            c=reader.nextInt();
        }
        int re=(int)(a*0.2+b*0.3+c*0.5);
        System.out.println(re);
    }
}
