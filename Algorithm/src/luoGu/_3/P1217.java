package _3;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author cong
 * @create 2022-01-19 20:06
 */
public class P1217 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int a = reader.nextInt();
        int b = reader.nextInt();
        for (int i = a; i <= b; i++) {
            if (i != 2 && i != 3 && i != 5 && (i % 2 == 0 || i % 3 == 0 || i % 5 == 0)) {
                continue;
            }
            if (isHNum(i)) {
                if (isSNum(i)) {
                    System.out.println(i);
                }
            }
        }
    }

    private static boolean isSNum(int i) {
        boolean re = true;
        if (i == 5 || i == 2 || i == 3) {
            re = true;
        } else {
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    re = false;
                }
            }
        }
        return re;
    }

    private static boolean isHNum(int i) {
        int x = i;
        int y = 0;
        boolean ret = false;
        while (x != 0) {
            y = y * 10 + x % 10;
            x = x / 10;
        }
        if (y == i) {
            ret = true;
        }
        return ret;
    }
}
//        Scanner reader = new Scanner(System.in);
//        int a = reader.nextInt();
//        int b = reader.nextInt();
//        int[] arr = new int[b + 1];
//        int k = 0;
//        int[] p = new int[b + 1];
//        for (int i = 2; i < p.length; i++) {
//            if (p[i] == 0) {
//                arr[k++] = i;
//                for (int j = i + i; j < p.length; j += i) {
//                    p[j] = 1;
//                }
//            }
//        }
//        for (int i = 0; i < k; i++) {
//            if (arr[i] >= a) {
//                String str = String.valueOf(arr[i]);
//                final StringBuilder builder = new StringBuilder(str);   内存开辟过大 空间复杂度高
//                if (builder.reverse().toString().equals(str)) {
//                    System.out.println(str);
//                }
//            }
//        }


