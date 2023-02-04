package _4;

import java.util.Scanner;

/**
 * @author cong
 * @create 2022-01-23 19:55
 */
public class P2141 {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        int n=reader.nextInt();
        int[] arr=new int[n];
        int count=0;
        boolean[] p=new boolean[n];
        for (int i=0;i<arr.length;i++){
            arr[i]=reader.nextInt();
        }
        for (int i=0;i<arr.length;i++){
//            1 2 3 4
            for (int j=i+1;j<arr.length;j++){
                for (int k=0;k<arr.length;k++){
                    if(arr[k]==arr[i]+arr[j]&&!p[k]){
                        count++;
                        p[k]=true;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
