package _3;

import java.util.Scanner;
import java.util.Arrays;
/**
 * @author cong
 * @create 2022-01-17 20:27
 */
public class P5718 {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        int n=reader.nextInt();
        int [] arr=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=reader.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(arr[0]);
    }
}
