package _5;

import java.util.Scanner;

/**
 * @author cong
 * @create 2022-01-26 20:05
 */
public class P1200 {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        String s1=reader.nextLine();
        String s2=reader.nextLine();
        int sum1=1;
        int sum2=1;
        for (int i=0;i<s1.length();i++){
            sum1*=s1.charAt(i)-64;
        }
        for (int i=0;i<s2.length();i++){
            sum2*=s2.charAt(i)-64;
        }
        if (sum1%47==sum2%47){
            System.out.println("GO");
        }else
        {
            System.out.println("STAY");
        }
    }
}
