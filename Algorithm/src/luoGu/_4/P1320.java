package _4;

import com.sun.org.apache.xpath.internal.WhitespaceStrippingElementMatcher;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author cong
 * @create 2022-01-24 20:59
 */
public class P1320 {
    static int flag = 0, cnt = 0;

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String s = reader.next();
        int N = s.length();
        String[] str = new String[N];
        str[0] = s;
        for (int i = 1; i < str.length; i++) {
            str[i] = reader.next();
        }
        int[] arr = new int[N * N];
        int count = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                arr[count++] = str[i].charAt(j) - '0';
            }
        }
//        0001000
//        0001000
//        0001111
//        0001000
//        0001000
//        0001000
//        1111111
        System.out.print(N + " ");
        int sn=0;
        int num=0;
        for (int i = 0; i <N * N; i++) {
                if(arr[i]==num){
                   sn++;
                }else {
                    num=arr[i];
                    System.out.print(sn+" ");
                    sn=1;
                }
        }
        System.out.print(sn+" ");
    }
}