package _1;

import java.util.Scanner;

/**
 * @author cong
 * @create 2022-01-12 16:50
 */
public class P5705 {
    public static void main(String[] args) {
        //1.234
        Scanner reader=new Scanner(System.in);
        float a=reader.nextFloat();
        while(a<100&&a>=1000){
            a=reader.nextFloat();
        }
        //toString方法 转换为String类型
        String b=Float.toString(a);
        for(int i=b.length()-1;i>=0;i--){
            //charAt() 方法用于返回指定索引处的字符。索引范围为从 0 到 length() - 1。
            System.out.print(b.charAt(i));
        }
    }
}
