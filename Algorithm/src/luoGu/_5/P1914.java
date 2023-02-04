package _5;

import java.util.Queue;
import java.util.Scanner;

/**
 * @author cong
 * @create 2022-01-25 14:51
 */
public class P1914 {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        int n=reader.nextInt();
        String str=reader.next();
        char[] chars=new char[str.length()];
        for (int i=0;i<str.length();i++){
            chars[i]=str.charAt(i);
                for (int j=1;j<=n;j++){
                    chars[i]++;
                    if (chars[i]>'z'){
                        chars[i]='a';
                    }
                }
        }
        for(int i=0;i<chars.length;i++){
            System.out.print(chars[i]);
        }
    }
}
