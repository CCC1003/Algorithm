package _6;

import java.util.Scanner;

/**
 * @author cong
 * @create 2022-01-21 21:21
 */
public class P5743 {
    public static void main(String[] args){
        Scanner reader=new Scanner(System.in);
        int n=reader.nextInt();
        int sum=1;
        for(int i=1;i<n;i++){
            sum=(sum+1)*2;
        }
        System.out.println(sum);
    }
}
