package _4;

import java.util.Scanner;

/**
 * @author cong
 * @create 2022-01-24 10:50
 */
public class P5731 {
    static int num=1;
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        int n=reader.nextInt();
        int[][] arr=new int[n][n];
        for (int j=0;j<n;j++){
            arr[0][j]=num++;
        }
        int t=n-1,i=0,j=n-1;
        while (t>0){
            for (int p=0;p<t;p++){
                arr[++i][j]=num++;
            }
            for (int p=0;p<t;p++){
                arr[i][--j]=num++;
            }
            t--;
            for (int p=0;p<t;p++){
                arr[--i][j]=num++;
            }
            for (int p=0;p<t;p++){
                arr[i][++j]=num++;
            }
            t--;
        }
        for (int m=0;m<n;m++){
            for (int f=0;f<n;f++){
                System.out.printf("%3d",arr[m][f]);
            }
            System.out.println();
        }
    }
}
