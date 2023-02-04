package _2;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
/**
 * @author cong
 * @create 2022-01-16 20:18
 */
public class P4414 {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        int[] arr=new int[3];
        for(int i=0;i<arr.length;i++){
            arr[i]=reader.nextInt();
        }
        Arrays.sort(arr);
        /*next()方法在读取内容时，会过滤掉有效字符前面的无效字符，对输入有效
        字符之前遇到的空格键、Tab键或Enter键等结束符，next()方法会自动将其过滤掉；只
        有在读取到有效字符之后，next()方法才将其后的空格键、Tab键或Enter键等视为结束符；
        所以next()方法不能得到带空格的字符串。
         */

        /*nextLine()方法字面上有扫描一整行的意思，它的结束符只能是Enter键，
        即nextLine()方法返回的是Enter键之前没有被读取的所有字符，
        它是可以得到带空格的字符串的。
         */
        String s=reader.next();
        char j1=s.charAt(0);
        char j2=s.charAt(1);
        char j3=s.charAt(2);
        System.out.println(arr[j1-'A']+" "+arr[j2-'A']+" "+arr[j3-'A']);
    }
}
