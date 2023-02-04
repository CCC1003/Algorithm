package _3;

import java.util.Scanner;

/**
 * @author cong
 * @create 2022-01-19 22:17
 */
public class P1420 {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        int n=reader.nextInt();
        int[] arr=new int[n];
        int num=1;
        int count=0;
        for (int i=0;i<arr.length;i++){
            arr[i]=reader.nextInt();
        }
        for (int i=0;i<arr.length-1;i++){
            if(arr[i+1]-arr[i]==1){
                num++;
            }else{
                num=1;
            }
            if(num>count){
                count=num;
            }
        }
        System.out.println(count);
    }
}
