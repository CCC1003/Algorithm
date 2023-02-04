package _2;

import java.util.Scanner;

/**
 * @author cong
 * @create 2022-01-14 17:35
 */
public class P5712 {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        int num=reader.nextInt();
        if(num==0||num==1){
            System.out.println("Today, I ate" + " "+num+" "+ "apple.");
        }
        else{
            System.out.println("Today, I ate" + " "+num+" "+ "apples.");
        }
    }
}
