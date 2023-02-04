package _6;

import java.util.Scanner;

/**
 * @author cong
 * @create 2022-01-20 19:52
 */
public class P5736 {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        int n=reader.nextInt();
        int[] arr=new int[n];
        for (int i=0;i<arr.length;i++){
            arr[i]=reader.nextInt();
        }
        for (int i=0;i<arr.length;i++){
            for (int j=2;j<=Math.sqrt(arr[i]);j++){
                if(arr[i]%j==0){
                    arr[i]=' ';
                    break;
                }
            }
        }
        for (int i=0;i<arr.length;i++){
            if (arr[i]!=' '&&arr[i]!=1){
                System.out.print(arr[i]+" ");
            }
        }
    }
}
