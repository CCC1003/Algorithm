package _5;

import java.util.Scanner;

/**
 * @author cong
 * @create 2022-01-26 20:48
 */
public class P1598 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String str1 = reader.nextLine().replace(" ", "");
        String str2 = reader.nextLine().replace(" ", "");
        String str3 = reader.nextLine().replace(" ", "");
        String str4 = reader.nextLine().replace(" ", "");
        String str = str1 + str2 + str3 + str4;
        int[] arr = new int[26];
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                arr[str.charAt(i) - 65]++;
            }
        }
        int max=0;
        for (int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        for (int i=max;i>=1;i--){
            for (int j=0;j<arr.length;j++){
                if (arr[j]==i){
                    System.out.print("* ");
                    arr[j]--;
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println("A B C D E F G H I J K L M N O P Q R S T U V W X Y Z");
    }
        }
