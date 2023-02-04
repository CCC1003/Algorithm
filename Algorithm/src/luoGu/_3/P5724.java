package _3;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author cong
 * @create 2022-01-19 22:05
 */
public class P5724 {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        int n=reader.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=reader.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(arr[arr.length-1]-arr[0]);
    }
}
