package _2;

import java.util.Scanner;

/**
 * @author cong
 * @create 2022-01-14 17:53
 */
public class P5713 {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        int n=reader.nextInt();
        int a=5*n;
        int b=11+3*n;
        if(a>b){
            System.out.println("Luogu");
        }else if (a<b){
            System.out.println("Local");
        }
    }
}
