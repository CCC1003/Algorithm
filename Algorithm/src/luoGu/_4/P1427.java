package _4;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

/**
 * @author cong
 * @create 2022-01-22 9:29
 */
public class P1427 {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        int[] arr=new int[100];
        int count=0;
       for (int i=0;i<arr.length;i++){
           arr[i]=reader.nextInt();
           if(arr[i]==0){
               break;
           }
           count++;
       }
        for (int j=count-1;j>=0;j--){
            System.out.print(arr[j]+" ");
        }
    }
}
