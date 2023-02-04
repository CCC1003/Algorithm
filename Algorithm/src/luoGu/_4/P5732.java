package _4;

import java.util.Scanner;

/**
 * @author cong
 * @create 2022-01-24 15:08
 */
public class P5732 {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        int n=reader.nextInt();
        int[][] arr=new int[n][n];
        for (int i=0;i<n;i++){
            arr[i][0]=1;
            arr[i][i]=1;
            for (int j=1;j<i;j++){
                arr[i][j]=arr[i-1][j]+arr[i-1][j-1];
            }
        }
        for (int i=0;i<n;i++){
            for (int j=0;j<=i;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
