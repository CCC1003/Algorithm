package _2;

import java.util.Scanner;

/**
 * @author cong
 * @create 2022-01-14 20:14
 */
public class P5715 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int a = reader.nextInt();
        int b = reader.nextInt();
        int c = reader.nextInt();
        int t;
        if(a>b){
            t=a;
            a=b;
            b=t;
        }
        if(a>c){
            t = a;
            a = c;
            c = t;
        }
        if(b>c){
            t = b;
            b = c;
            c = t;
        }
        System.out.println(a+" "+b+" "+c);

    }
}