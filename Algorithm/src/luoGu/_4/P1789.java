package _4;

import jdk.nashorn.internal.runtime.FindProperty;

import java.util.Scanner;

/**
 * @author cong
 * @create 2022-01-24 15:50
 */
public class P1789 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        int m = reader.nextInt();
        int k = reader.nextInt();
        int[][] map = new int[n + 3][n + 3];
        if (n == 2) {
            System.out.print("0");
        } else {
            for (int e = 1; e <= m; e++) {
                int x = reader.nextInt();
                int y = reader.nextInt();
                x = x + 2;
                y = y + 2;
                for (int i = x - 2; i < x + 1; i++) {
                    for (int j = y - 2; j < y + 1; j++) {
                        map[i][j] = 1;
                        map[x - 1][y - 3] = 1;
                        map[x - 3][y - 1] = 1;
                        map[x + 1][y - 1] = 1;
                        map[x - 1][y + 1] = 1;
                    }
                }
            }
            for (int f = 1; f <= k; f++) {
                int x = reader.nextInt();
                int y = reader.nextInt();
                x = x + 2;
                y = y + 2;
                for (int i = x - 3; i <= x + 1; i++) {
                    for (int j = y - 3; j <= y + 1; j++) {
                        map[i][j] = 1;
                    }
                }
            }
            int count = 0;
            for (int i = 2; i < n + 2; i++) {
                for (int j = 2; j < n + 2; j++) {
                    if (map[i][j] == 0) {
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }
}
