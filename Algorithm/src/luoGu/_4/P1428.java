package _4;

import java.util.Scanner;

/**
 * @author cong
 * @create 2022-01-22 9:11
 */
public class P1428 {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        int n=reader.nextInt();
        int[] arr=new int[n];
        for (int i=0;i<arr.length;i++)
        {
            arr[i]=reader.nextInt();
        }
        int[] p=new int[n];
        for (int i=0;i<arr.length;i++){
            for (int j=i-1;j>=0;j--){
                    if (arr[i]>arr[j]){
                        p[i]++;
                    }
            }
        }
        for (int x:p){

            System.out.print(x+" ");
        }

    }
}
