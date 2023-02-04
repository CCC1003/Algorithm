package _3;

import sun.print.SunMinMaxPage;

import java.util.Scanner;

/**
 * @author cong
 * @create 2022-01-20 10:58
 */
public class P4956 {
    public static void main(String[] args) {
        //1≤x≤100。
        Scanner reader=new Scanner(System.in);
        int M=reader.nextInt();
        int sum=M/52;
        int x,k;
        for (k=1;;k++){
            for (x=100;x>=1;x--){
                if (7*x+21*k==sum){
                    System.out.println(x+"\n"+k);
                    return;
                }
            }
        }
    }
}
