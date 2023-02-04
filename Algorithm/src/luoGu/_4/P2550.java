package _4;

import jdk.nashorn.internal.ir.annotations.Ignore;

import java.util.Scanner;

/**
 * @author cong
 * @create 2022-01-22 14:59
 */
public class P2550 {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        int[] goods=new int[7];
        int n=reader.nextInt();
        int[][] buys=new int[n][7];
        for (int i=0;i<goods.length;i++){
            goods[i]=reader.nextInt();
        }
        for (int i=0;i<n;i++){
            for (int j=0;j<7;j++){
                buys[i][j]=reader.nextInt();
            }
        }
        int[] p=new int[7];
        int count=0;
        for (int i=0;i<n;i++){
            for (int j=0;j<7;j++){
                for (int k=0;k<7;k++){
                    if(goods[k]==buys[i][j]){
                        count++;
                    }
                }
            }
            switch (count){
                case 7:p[0]++; count=0; break;
                case 6:p[1]++; count=0; break;
                case 5:p[2]++; count=0; break;
                case 4:p[3]++; count=0; break;
                case 3:p[4]++; count=0; break;
                case 2:p[5]++; count=0; break;
                case 1:p[6]++; count=0; break;
            }
        }
        for (int x:p){
            System.out.print(x+" ");
        }
    }
}
