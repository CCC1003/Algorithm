package _6;

import sun.print.SunMinMaxPage;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author cong
 * @create 2022-01-20 20:27
 */
public class P5738 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        int m=reader.nextInt();
        int[][] arr=new int[n][m];
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                arr[i][j]=reader.nextInt();
            }
        }
        for (int i=0;i<n;i++){
            Arrays.sort(arr[i]);
        }
        double[] p=new double[n];
        double sum=0;
        for (int j=0;j<n;j++){
            for (int i=1;i<m-1;i++){
                sum+=arr[j][i];
            }
            p[j]=sum/(m-2);
            sum=0;
        }
        Arrays.sort(p);
        System.out.printf("%.2f",p[n-1]);
    }
}
