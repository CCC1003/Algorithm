package _4;

import java.util.Scanner;

/**
 * @author cong
 * @create 2022-01-24 19:51
 */
public class P1319 {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        int n=reader.nextInt();
        int[] arr=new int[n*n];
        int t=0,temp=1;
        while (t<n*n){
            int x=reader.nextInt();
            for (int i=t;i<t+x;i++){
                if(temp%2!=0){
                    arr[i]=0;
                }else {
                    arr[i]=1;
                }
            }
            temp++;
            t+=x;
        }
        int sum=0;
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
            sum++;
            if(sum==n){
                System.out.println();
                sum=0;
            }
        }
        }
        }


