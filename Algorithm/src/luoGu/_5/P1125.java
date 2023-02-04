package _5;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author cong
 * @create 2022-01-25 15:23
 */
public class P1125 {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        String str=reader.next();
        int[] arr=new int[125];
        for (int i=0;i<str.length();i++){
            arr[str.charAt(i)]++;
        }
        Arrays.sort(arr);
        int min=0;
        for (int i=0;i<arr.length;i++){
            if (arr[i]!=0){
                min=arr[i];
                break;
            }
        }
        int n=arr[124]-min;
        if (n==0){
            System.out.println("No Answer");
            System.out.println(0);
        }
        if (n==2){
            System.out.println("Lucky Word");
            System.out.println(2);
        }
        if (n==3){
            System.out.println("Lucky Word");
            System.out.println(3);
        }
        for (int i=2;i<=Math.sqrt(n);i++){
            if (n%i==0){
                System.out.println("No Answer");
                System.out.println(0);
                break;
            }else if (n%i!=0&&i==(int) Math.sqrt(n)){
                System.out.println("Lucky Word");
                System.out.println(n);
            }
        }
    }
}
