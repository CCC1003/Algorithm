package _3;

import java.util.Scanner;

/**
 * @author cong
 * @create 2022-01-17 21:11
 */
public class P5721 {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        int n=reader.nextInt();
        int num=1;
        for(int i=1;i<=n;i++){
            for (int j=i;j<=n;j++){
                if(num<10){
                    System.out.print("0"+num);
                }else{
                    System.out.print(num);
                }
                num++;
            }
            System.out.println();
        }
    }
}
