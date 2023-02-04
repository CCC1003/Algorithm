package _5;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

/**
 * @author cong
 * @create 2022-01-25 19:34
 */
public class P5015 {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        String str=reader.nextLine();
        String[] ar=str.split("\\s+");
        int count=0;
        for (int i=0;i<ar.length;i++){
            for (int j=0;j<ar[i].length();j++){
                count++;
            }
        }
        System.out.println(count);
    }
}
