package _5;

import java.util.Scanner;

/**
 * @author cong
 * @create 2022-01-25 16:28
 */
public class P1957 {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        int n=Integer.parseInt(reader.nextLine());
        String character="";
        for (int i=0;i<n;i++)
        {
            String s=reader.nextLine();
            String res="";
//            正则表达式中\s匹配任何空白字符，包括空格、制表符、换页符等等, 等价于[ \f\n\r\t\v]
//            \f -> 匹配一个换页
//            \n -> 匹配一个换行符
//            \r -> 匹配一个回车符
//            \t -> 匹配一个制表符
//            \v -> 匹配一个垂直制表符
//            而“\s+”则表示匹配任意多个上面的字符。另因为反斜杠在Java里是转义字符，所以在Java里，我们要这么用“\s+”.
            String[] str=s.split("\\s+");
            int a,b;
//            startsWith() 方法用于检测字符串是否以指定的前缀开始。
            if (s.startsWith("a")){
                character="a";
                a=Integer.parseInt(str[1]);
                b=Integer.parseInt(str[2]);
            }else if(s.startsWith("b")){
                character="b";
                a=Integer.parseInt(str[1]);
                b=Integer.parseInt(str[2]);
            }else if (s.startsWith("c")){
                character="c";
                a=Integer.parseInt(str[1]);
                b=Integer.parseInt(str[2]);
            }else{
                a=Integer.parseInt(str[0]);
                b=Integer.parseInt(str[1]);
            }
            switch (character){
                case "a": res=a+"+"+b+"="+(a+b);break;
                case "b": res=a+"-"+b+"="+(a-b);break;
                case "c": res=a+"*"+b+"="+(a*b);break;
            }
            System.out.println(res);
            System.out.println(res.length());
        }

        }
    }

