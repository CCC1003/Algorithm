package _1;

import java.util.Scanner;

/**
 * @author cong
 * @create 2022-01-13 21:01
 */
public class P5707 {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        int s=reader.nextInt();
        int v=reader.nextInt();
        int t=0;
        int temp=0;
        int h=0;
        int m=0;
        if(s%v==0){
            t=s/v+10;
        }else {
            t=s/v+11;
        }
        if(t<=480){
            temp=480-t;
            h=temp/60;
            m=temp%60;
        }
        else {
            temp=t-480;
            h=24-temp/60-1;
            m=60-temp%60;
        }
        System.out.printf("%02d:%02d",h,m);
    }
}
