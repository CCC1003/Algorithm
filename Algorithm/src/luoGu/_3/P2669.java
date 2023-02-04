package _3;

import java.util.Scanner;

/**
 * @author cong
 * @create 2022-01-18 20:37
 */
public class P2669 {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        int n=reader.nextInt();
        int sum=0,count=0,money=1;
        for(int i=0;i<n;i++){
            if(count==money){
                count=0;
                money++;
            }
            count++;
            sum+=money;
        }
        System.out.println(sum);
    }
}
