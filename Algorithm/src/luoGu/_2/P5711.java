package _2;

import java.util.Scanner;

/**
 * @author cong
 * @create 2022-01-14 17:29
 */
//给定一个年份，判断这一年是不是闰年。
//
//当以下情况之一满足时，这一年是闰年：
//
//1. 年份是4的倍数而不是100的倍数；
//
//2. 年份是400的倍数。
public class P5711 {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        int year=reader.nextInt();
        if((year%4==0&&year%100!=0)||year%400==0){
            System.out.println(1);
        }
        else{
            System.out.println(0);
        }
    }
}
