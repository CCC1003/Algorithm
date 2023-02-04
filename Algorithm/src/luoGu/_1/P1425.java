package _1;

import java.util.Scanner;

/**
 * @author cong
 * @create 2022-01-12 20:00
 */
public class P1425 {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        int a=reader.nextInt();
        int b=reader.nextInt();
        int c=reader.nextInt();
        int d=reader.nextInt();
        int h=c-a;
        int m=d-b;
        if(m<0){
            h=h-1;
            m=m+60;
        }
        System.out.println(h+" "+m);
    }
}
