package _2;

import javax.sound.midi.VoiceStatus;
import java.util.Scanner;

/**
 * @author cong
 * @create 2022-01-14 21:23
 */
public class P1085 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int[] arr = new int[7];
        for (int i = 0; i < arr.length; i++) {
            int a = reader.nextInt();
            int b = reader.nextInt();
            arr[i] = a + b;
        }//9 9 5 6 8 4
        int re=arr[0];
        for(int i=0;i<6;i++){
         re=re>=arr[i+1]?re:arr[i+1];
        }
            if (re<=8){
                System.out.println(0);
            }else {
                System.out.println(printArray(arr, re) + 1);
            }
    }
   static int printArray(int[] array,int value){
        for(int i = 0;i<array.length;i++){
            if(array[i]==value){
                return i;
            }
        }
        return -1;

    }
}

