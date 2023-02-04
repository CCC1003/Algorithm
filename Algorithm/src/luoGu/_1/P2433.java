package _1;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

/**
 * @author cong
 * @create 2022-01-12 20:11
 */
public class P2433 {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        int a=reader.nextInt();
        while (a>14&&a<=0){
            a=reader.nextInt();
        }
        switch (a){
            case 1:
                System.out.println("I love Luogu!");
                break;
            case 2:
                System.out.println(6+" "+4);
                break;
            case 3:
                System.out.println(3+"\n"+12+"\n"+2);
                break;
            case 4:
                System.out.println("166.667");
                break;
            case 5:
                System.out.println(15);
                break;
            case 6:
                System.out.println("10.8167");
                break;
            case 7:
                System.out.println("110\n90\n0");
                break;
            case 8:
                System.out.println("31.4159\n78.5398\n523.599");
                break;
            case 9:
                System.out.println(22);
                break;
            case 10:
                System.out.println(9);
                break;
            case 11:
                System.out.println("33.3333");
                break;
            case 12:
                System.out.println("13\nR");
                break;
            case 13:
                System.out.println((int)(Math.pow(4.0/3*3.141593*(4*4*4+10*10*10),1.0*1/3)));
                break;
            case 14:
                System.out.println(50);
                break;
            default:

        }
    }
}
