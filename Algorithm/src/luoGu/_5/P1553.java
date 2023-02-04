package _5;

import java.io.FileReader;
import java.math.BigInteger;
import java.util.Scanner;

/**
 * @author cong
 * @create 2022-01-26 11:19
 */
public class P1553 {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        String str=reader.nextLine();
        if (str.contains(".")){
            //split()方法
            //注意： . 、 $、 | 和 * 等转义字符，必须得加 \\。
            String[] s=str.split("\\.");
            long s1=Long.parseLong(s[0]);
            long s2=Long.parseLong(s[1]);
            System.out.println(reverse(s1)+"."+reverse(s2));
        }else if (str.contains("/")){
            String[] s=str.split("/");
           long s1=Long.parseLong(s[0]);
            long s2=Long.parseLong(s[1]);
            System.out.println(reverse(s1)+"/"+reverse(s2));
        }else if (str.contains("%")){
            String[] s=str.split("%");
            long s1=Long.parseLong(s[0]);
            System.out.println(reverse(s1)+"%");
        }else{
            //String a = "1234567890123456789";
            //        //String转为BigInteger
            //        BigInteger b=new BigInteger(a);
            //        //BigInteger转为String
            //        String c = String.valueOf(b);
//            BigInteger s1=new BigInteger(str);
//            System.out.println(reverseBig(s1));
            StringBuilder sb=new StringBuilder(str);
            sb.reverse();
//            long 20位
            System.out.println(Long.parseLong(String.valueOf(sb)));
//            long s1=Long.parseLong(str);
//            System.out.println(reverse(s1));
        }
    }
//    static  BigInteger reverseBig(BigInteger n){
//        BigInteger x=n;
//        BigInteger y=new BigInteger("0");
//        BigInteger ten=new BigInteger("10");
        //1.BigInteger BigInteger.mod(BigInteger)方法取得正余数
        //2.BigInteger BigInteger.remainder(BigInteger)方法取得余数，符号随原数

//        System.out.println(!x.equals(0));
//        while (!x.equals(0)){
//            y=y.multiply(ten).add(x.mod(ten));
//            x=x.divide(ten);
//        }
//        return y;
//    }
    static long reverse(long n){
        //最小值：Long.MIN_VALUE=-9223372036854775808 （-2的63次方）
        //最大值：Long.MAX_VALUE=9223372036854775807 （2的63次方-1）
//        超过就会乱码
        long x=n;
        long y=0;
        while (x!=0){
            y=y*10+x%10;
            x=x/10;
        }
        return y;
    }
}
