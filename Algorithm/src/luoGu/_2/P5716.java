package _2;

import java.util.Scanner;

/**
 * @author cong
 * @create 2022-01-14 21:01
 */
public class P5716 {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        int year=reader.nextInt();
        int month=reader.nextInt();
        if(month==1||month==3||month==5||month==7||month==8||month==10||month==12){
            System.out.println(31);
        }else if(month==4||month==6||month==9||month==11){
            System.out.println(30);
        }else if(month==2){
            if((year%4==0&&year%100!=0)||year%400==0){
                System.out.println(29);
            }else{
                System.out.println(28);
            }
        }


    }
}
