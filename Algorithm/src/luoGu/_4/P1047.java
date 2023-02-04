package _4;

import java.util.Scanner;

/**
 * @author cong
 * @create 2022-01-22 10:18
 */
public class P1047 {
    public static void main(String[] args) {
        //boolean 的默认值位false
        Scanner reader=new Scanner(System.in);
        int n=reader.nextInt();
        boolean[] arr=new boolean[n+1];
        int d=reader.nextInt();
        while (d-->0){
            int start=reader.nextInt();
            int end=reader.nextInt();
            for (int i=start;i<=end;++i){
                arr[i]=true;
            }
        }
        int k=0;
        for (int i=0;i<arr.length;i++){
            if (!arr[i]){
                k++;
            }
        }
        System.out.println(k);
    }
}
