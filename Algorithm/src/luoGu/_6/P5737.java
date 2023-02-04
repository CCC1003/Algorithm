package _6;

import java.util.Scanner;

/**
 * @author cong
 * @create 2022-01-20 20:15
 */
public class P5737 {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        int x=reader.nextInt();
        int y=reader.nextInt();
        int sum=0;
        for (int i=x;i<=y;i++){
            if((i%4==0&&i%100!=0)||i%400==0){
                sum++;
            }
        }
        System.out.println(sum);
        for (int i=x;i<=y;i++){
            if((i%4==0&&i%100!=0)||i%400==0){
                System.out.print(i+" ");
            }
        }
    }
    }


