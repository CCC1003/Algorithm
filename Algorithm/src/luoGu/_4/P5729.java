package _4;

import java.util.Scanner;

/**
 * @author cong
 * @create 2022-01-22 11:04
 */
public class P5729 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int x1 = reader.nextInt();
        int x2 = reader.nextInt();
        int x3 = reader.nextInt();
        boolean[][][] arr = new boolean[x1+1][x2+1][x3+1];
        int q = reader.nextInt();
        while (q-- > 0) {
            int a = reader.nextInt();
            int b = reader.nextInt();
            int c = reader.nextInt();
            int d = reader.nextInt();
            int e = reader.nextInt();
            int f = reader.nextInt();
            for (int i = a; i <= d; i++) {
                for (int j = b; j <= e; j++) {
                    for (int k = c; k <= f; k++) {
                        arr[i][j][k] = true;
                    }
                }
            }
        }
        int count = 0;
        for (int i = 1; i <=x1; i++) {
            for (int j = 1; j <= x2; j++) {
                for (int k = 1; k <= x3; k++) {
                    if (!arr[i][j][k]) {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
