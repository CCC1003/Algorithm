package _5;

import java.util.Scanner;

/**
 * @author cong
 * @create 2022-01-26 10:12
 */
public class P3741 {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        //nextInt()：只读取 整数 数值，不读取回车\n 下面的nextLine()会读取\n
        int n=Integer.parseInt(reader.nextLine());
        //next() 与 nextLine() 区别
        //next():
        //
        //1、一定要读取到有效字符后才可以结束输入。
        //2、对输入有效字符之前遇到的空白，next() 方法会自动将其去掉。
        //3、只有输入有效字符后才将其后面输入的空白作为分隔符或者结束符。
        //next() 不能得到带有空格的字符串。
        //nextLine()：
        //
        //1、以Enter为结束符,也就是说 nextLine()方法返回的是输入回车之前的所有字符。
        //2、可以获得空白。
        String str=reader.nextLine();
        reader.close();
        int count=0;
        while (str.contains("VK")){
            //replaceFirst() 方法使用给定的参数 replacement 替换字符串第一个匹配给定的正则表达式的子字符串。
            str=str.replaceFirst("Vk","XX");
            count++;
        }
        if (str.contains("VV")||str.contains("KK")){
            count++;
        }
        System.out.println(count);
    }
}
