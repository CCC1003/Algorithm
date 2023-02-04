package _5;

import java.util.Scanner;

/**
 * @author cong
 * @create 2022-01-25 19:47
 */
public class P5734 {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
            int q=reader.nextInt();
            String str=reader.next();
            for (int i=0;i<=q;i++){
                String s=reader.nextLine();
                if (s.startsWith("1")){
                    String[] arr1=s.split(" ");
                    str=str.concat(arr1[1]);//将指定字符串连接到此字符串的结尾。
                    System.out.println(str);
                }else if(s.startsWith("2")){
                    String[] arr2=s.split(" ");
                    int x=Integer.parseInt(arr2[1]);
                    int y=Integer.parseInt(arr2[2]);
                    str=str.substring(x,y+x);
//                    传入两个参数：substring(int beginIndex, int endIndex)
//                    从索引号beginIndex开始到索引号endIndex结束 !!!
//                （返回结果包含索引为beginIndex的字符不包含索引我endIndex的字符）
                    System.out.println(str);
                }else if(s.startsWith("3")){
                    String[] arr3=s.split(" ");
                    int index=Integer.parseInt(arr3[1]);
                    StringBuffer sb=new StringBuffer(str);
//                    	public insert(int offset, int i)
//                    将 int 参数的字符串表示形式插入此序列中。
                    str= String.valueOf((sb.insert(index,arr3[2])));
                    System.out.println(str);
                }else if(s.startsWith("4")){
                    String[] arr4=s.split(" ");
                    System.out.println(str.indexOf(arr4[1]));
                }
            }
    }
}
