package _1;

import java.util.Scanner;

/**
 * @author cong
 * @create 2022-01-13 19:30
 */
public class P5709 {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        int m=reader.nextInt();
        int t=reader.nextInt();
        int s=reader.nextInt();
        while (t<=0&&t>100&&m>100&&s>10000) {
             m=reader.nextInt();
             t=reader.nextInt();
             s=reader.nextInt();
        }
        if (s>=m*t){
            System.out.println(0);
        }else if(s%t==0)
        {
            System.out.println(m-s/t);
        }else
        {
            System.out.println(m-s/t-1);
        }
    }
}
