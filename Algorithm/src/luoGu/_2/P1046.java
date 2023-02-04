package _2;

import java.util.Scanner;

/**
 * @author cong
 * @create 2022-01-16 19:23
 */
public class P1046 {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        int[] arr=new int[10];
        for(int i=0;i<arr.length;i++){
            arr[i]=reader.nextInt();
        }
        int n=reader.nextInt();
        int x=0;
        for (int i=0;i<arr.length;i++){
            if((n+30)>=arr[i]){
                x++;
            }
        }
        System.out.println(x);
    }
}
