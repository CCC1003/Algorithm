package _3;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

/**
 * @author cong
 * @create 2022-01-20 10:12
 */
public class P5725 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        int num = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (num < 10) {
                    System.out.print("0" + num++);
                } else {
                    System.out.print(num++);
                }
            }
            System.out.println();
        }
        System.out.println();
        int mum = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j <=n - i) {
                    System.out.print("  ");
                } else {
                    if (mum < 10) {
                        System.out.print("0" + mum++);
                    } else {
                        System.out.print(mum++);
                    }
                }
            }
            System.out.println();
        }
    }
}