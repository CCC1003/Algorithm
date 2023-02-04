package _3;

import java.util.Scanner;

/**
 * @author cong
 * @create 2022-01-18 21:04
 */
public class P5722 {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        int n=reader.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
            sum+=i;
        }
        System.out.println(sum);
    }
}
