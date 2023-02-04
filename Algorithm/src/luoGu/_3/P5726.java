package _3;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author cong
 * @create 2022-01-20 10:38
 */
public class P5726 {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        int n=reader.nextInt();
        int[] ar=new int[n];
       for (int i=0;i<ar.length;i++){
           ar[i]=reader.nextInt();
       }
        Arrays.sort(ar);
       double sum=0;
        for (int i=1;i<ar.length-1;i++){
            sum+=ar[i];
        }
        System.out.printf("%.2f",sum/(n-2));
    }
}
