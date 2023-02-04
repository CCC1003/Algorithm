package _6;

import sun.security.provider.Sun;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * @author cong
 * @create 2022-01-20 21:53
 */
public class P5461 {
    public static void main(String[] args) {
        //整型数组元素的默认值是0
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        int sum=2;
//        Math.pow(2,n); 会让时间增加
        for (int i=1;i<n;i++){
            sum*=2;
        }
        int[][] arr = new int[sum][sum];
        arr[0][sum-1]=1;
        for (int i=1;i<sum;i++){
            arr[i][sum-1]=1;
            for (int j=sum-2;j>sum-2-i;j--){
                arr[i][j]=arr[i-1][j]+arr[i-1][j+1];
                if(arr[i][j]!=1){
                    arr[i][j]=0;
                }else{
                    arr[i][j]=1;
                }
            }
        }
        for (int i=0;i<sum;i++){
            for (int j=0;j<sum;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
}
//        for (int i=0;i<arr.length;i++){
//            for (int j=0;j<arr.length;j++){
//                arr[i][j]=1;
//            }
//        }
//        sort(arr,0,0,arr.length);
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr.length; j++) {
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }
//
//    }
//
//public static void sort(int[][] arr,int n,int m,int r){
//        for (int i=n;i<n+r/2;i++){
//            for (int j=m;j<m+r/2;j++){
//                arr[i][j]=0;
//            }
//        }
//        if (r/2==1){
//            return;
//        }
//        sort(arr,n+r/2,m,r/2);// 左下角
//        sort(arr,n,m+r/2,r/2);  //右上角
//        sort(arr,n+r/2,m+r/2,r/2);  //右下角
//    }
//}
