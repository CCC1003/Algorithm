package _1_2;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author cong
 * @create 2022-02-12 17:27
 */
public class P1152 {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        int[] arr=new int[reader.nextInt()];
        for (int i=0;i<arr.length;i++){
            arr[i]=reader.nextInt();
        }
        int[] bucket=new int[arr.length-1];
        for (int i=0;i<arr.length-1;i++){
            bucket[i]=Math.abs(arr[i+1]-arr[i]);
        }
        Arrays.sort(bucket);
        int count=0;
        for (int i=1;i<=arr.length-1;i++){
            if (bucket[i-1]==i){
                count++;
            }
        }
        if (count==arr.length-1){
            System.out.println("Jolly");
        }else{
            System.out.println("Not jolly");
        }
    }
}
