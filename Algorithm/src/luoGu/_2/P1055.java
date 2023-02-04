package _2;

import java.util.Scanner;

/**
 * @author cong
 * @create 2022-01-15 20:36
 */
public class P1055 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String a=reader.nextLine();
        char y=a.charAt(12);
        String a1=a.replace("-","");
        int sum=0;
        for(int i=0;i<a1.length()-1;i++){
            //a1.charAt(i)-'0' 字符转成数字
            //这里为字符“1”减去字符“0”  利用ascii表
            sum+=(a1.charAt(i)-'0')*(i+1);
        }
        int x=sum%11;
        //这里x为整型数字  而不是字符
        char t=(char)(x+'0');
        if(x==10){
            t='X';
        }if(t==y){
            System.out.println("Right");
        }else{
            for (int i=0;i<a.length()-1;i++){
                System.out.print(a.charAt(i));
            }
            System.out.print(t);
        }
    }

    }
