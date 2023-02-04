package _2;

import java.util.Scanner;

/**
 * @author cong
 * @create 2022-01-16 19:35
 */
public class P5717 {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        int a=reader.nextInt();
        int b=reader.nextInt();
        int c=reader.nextInt();
        int t=0;
        if(a>b){
            t=a;
            a=b;
            b=t;
        }if(a>c){
            t=a;
            a=c;
            c=t;
        }if(b>c){
            t=b;
            b=c;
            c=t;
        }
        if(a+b<=c){
            System.out.print("Not triangle");
        }else{
            if(a*a+b*b==c*c){
                System.out.println("Right triangle");
            }if(a*a+b*b>c*c){
                System.out.println("Acute triangle");
            }if(a*a+b*b<c*c){
                System.out.println("Obtuse triangle");
            }if(a==b||b==c||a==c){
                System.out.println("Isosceles triangle");
            }if(a==b&&b==c){
                System.out.println("Equilateral triangle");
            }
        }
    }
}
