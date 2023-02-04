package _3;

import java.util.Scanner;

/**
 * @author cong
 * @create 2022-01-19 21:49
 */
public class P1307 {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        int x = reader.nextInt();
        int y = 0;
        while (x != 0) {
            y = y * 10 + x % 10;
            x = x / 10;
        }
        System.out.println(y);
    }
}
