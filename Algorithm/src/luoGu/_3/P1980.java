package _3;

import java.util.Scanner;

/**
 * @author cong
 * @create 2022-01-18 19:51
 */
public class P1980 {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        int n=reader.nextInt();
        int  x=reader.nextInt();
        int sum=0;
        for (int i=1;i<=n;i++){
            String ns= Integer.toString(i);
            for (int j=0;j<ns.length();j++){
                if((ns.charAt(j)-'0')==x){
                    sum++;
                }
            }
        }
        System.out.println(sum);
    }
}
