package _5;

import java.util.Scanner;
import java.util.zip.CheckedOutputStream;

/**
 * @author cong
 * @create 2022-01-25 21:00
 */
public class P1308 {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        String Uto=reader.nextLine().toLowerCase();
        String s=reader.nextLine().toLowerCase();
        String[] str=s.split(" ");
        int count=0;
        int flag=0;
        int c=0;
//        ==：比较的是两个字符串内存地址（堆内存）的数值是否相等，属于数值比较；
//        equals()：比较的是两个字符串的内容，属于内容比较。
//                  如果两个字符串  "=="  结果相等，就是说地址一样，那么虚拟机就认为是一个对象，字面量自然是相等的；
//                  如果两个字符串  "=="  结果不相等，再逐一对比每个字符，判断字面量是否相同，如果相同认为是相等的；
        for (int i=0;i<str.length;i++){
            if (Uto.equals(str[i])){
                count++;
            }
                if (count==1){
                    flag=1;
                }
                if (flag==0){
                    c+=str[i].length()+1;
                }
            }

        if (count==0){
            System.out.println("-1");

        }else{
            System.out.print(count+" "+c);
        }
    }
}
