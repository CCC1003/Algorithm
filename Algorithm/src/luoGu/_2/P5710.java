package _2;

import com.sun.javafx.image.BytePixelSetter;

import java.util.Scanner;

/**
 * @author cong
 * @create 2022-01-14 16:59
 */
public class P5710 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int num = reader.nextInt();
        if (num % 2 == 0 && num > 4 && num <= 12) {
            System.out.print(1 + " ");
        } else {
            System.out.print(0 + " ");
        }
        if ((num % 2 == 0 && !(num > 4 && num <= 12)) || (num % 2 != 0 && num > 4 && num <= 12) || (num % 2 == 0 && num > 4 && num <= 12)) {
            System.out.print(1 + " ");
        } else {
            System.out.print(0 + " ");
        }
        if ((num % 2 == 0 && !(num > 4 && num <= 12))||((num % 2 != 0 && (num > 4 && num <= 12)))) {
            System.out.print(1 + " ");
        } else {
            System.out.print(0 + " ");
        }
        if (!(num % 2 == 0 || (num > 4 && num <= 12))) {
            System.out.print(1);
        } else {
            System.out.print(0);
        }
    }}
