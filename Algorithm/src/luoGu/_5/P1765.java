package _5;

import org.w3c.dom.DOMError;

import java.util.Scanner;

/**
 * @author cong
 * @create 2022-01-26 9:11
 */
public class P1765 {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        String str=reader.nextLine();
        int[] count={1,2,3,1,2,3,1,2,3,1,2,3,1,2,3,1,2,3,4,1,2,3,1,2,3,4};
        int sum=0;
        for (int i=0;i<str.length();i++){
            if (str.charAt(i)>='a'&&str.charAt(i)<='z'){
                sum+=count[str.charAt(i)-'a'];
            }if (str.charAt(i)==' '){
                sum++;
            }
        }
        System.out.println(sum);
    }
}
