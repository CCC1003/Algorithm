package _4;

import com.sun.deploy.panel.ITreeNode;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * @author cong
 * @create 2022-01-23 20:34
 */
public class P1614 {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        int n=reader.nextInt();
        int m=reader.nextInt();
        int[] arr=new int[n];
        for (int i=0;i<arr.length;i++){
            arr[i]=reader.nextInt();
        }
        int[] p=new int[n-m+1];
        for (int i=0;i<n-m+1;i++){
            int sum=0;
            for (int j=i;j<i+m;j++){
                sum+=arr[j];
            }
            p[i]=sum;
        }
        Arrays.sort(p);
        System.out.print(p[0]);
    }
}
